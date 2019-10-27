package MasterMindGameMVCPatternsId.models.DAO;

import MasterMindGameMVCPatternsId.models.SessionImplementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import MasterMindGameMVCPatternsId.models.SessionImplementation;
import MasterMindGameMVCPatternsId.models.StateValue;

public class SessionImplementationDAO {

	private static final String SAVES_DIRECTORY = "/home/paco/IdeaProjects/MasterMindGamePatterns/saves";
	private static final String EXT = ".mm";

	private static File directory;

	static {
		SessionImplementationDAO.directory = new File(SessionImplementationDAO.SAVES_DIRECTORY);
	}

	private SessionImplementation sessionImpl;

	private GameDAO gameDAO;

	public void associate(SessionImplementation sessionImpl) {
		this.sessionImpl = sessionImpl;
		this.gameDAO = new GameDAO(this.sessionImpl.getGame());
	}

	public void load(String name) {
		this.sessionImpl.setName(name);
		File file = new File(SessionImplementationDAO.directory, name);
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			this.gameDAO.load(bufferedReader);
			this.sessionImpl.resetRegistry();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sessionImpl.setStateValue(StateValue.IN_GAME);
		if (this.sessionImpl.isLooser() || this.sessionImpl.isWinner()) {
			this.sessionImpl.setStateValue(StateValue.FINAL);
		}
	}

	public void save() {
		this.save(this.sessionImpl.getName());
	}

	public void save(String name) {
		if (name.endsWith(SessionImplementationDAO.EXT)) {
			name = name.replace(SessionImplementationDAO.EXT, "");
		}
		File file = new File(SessionImplementationDAO.directory, name + SessionImplementationDAO.EXT);
		try {
			FileWriter fileWriter = new FileWriter(file);
			this.gameDAO.save(fileWriter);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getGamesNames() {
		return SessionImplementationDAO.directory.list();
	}

	public boolean exists(String name) {
		for (String auxName : this.getGamesNames()) {
			if (auxName.equals(name + SessionImplementationDAO.EXT)) {
				return true;
			}
		}
		return false;
	}

}
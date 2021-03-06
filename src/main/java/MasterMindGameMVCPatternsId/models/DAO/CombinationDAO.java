package MasterMindGameMVCPatternsId.models.DAO;

import MasterMindGameMVCPatternsId.models.Combination;
import MasterMindGameMVCPatternsId.types.Color;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class CombinationDAO {
	
	protected Combination combination;
	
	public CombinationDAO(Combination combination) {
		this.combination = combination;
	}

	public void save(FileWriter fileWriter) {
		try {
			for (Color color : this.combination.getColors()) {
				fileWriter.write(color.name() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			for (int i = 0; i < Combination.getWidth(); i++) {
				String color = bufferedReader.readLine();
				this.combination.addColor(Color.valueOf(color));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

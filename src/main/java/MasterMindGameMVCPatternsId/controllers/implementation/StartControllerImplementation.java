package MasterMindGameMVCPatternsId.controllers.implementation;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.SessionImplementation;
import MasterMindGameMVCPatternsId.models.DAO.SessionImplementationDAO;


public class StartControllerImplementation extends StartController {

    private final SessionImplementationDAO sessionDao;

    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDao) {
        super(session);
        this.sessionDao = sessionImplementationDao;
    }

    @Override
    public void start() {
        ((SessionImplementation) this.session).setName(null);
        ((SessionImplementation) this.session).next();
    }

    @Override
    public void start(String name) {
        this.sessionDao.load(name);
    }

    @Override
    public String[] getGamesNames() {
        return this.sessionDao.getGamesNames();
    }

}
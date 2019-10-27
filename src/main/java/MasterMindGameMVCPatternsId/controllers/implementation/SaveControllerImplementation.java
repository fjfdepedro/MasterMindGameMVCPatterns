package MasterMindGameMVCPatternsId.controllers.implementation;

import MasterMindGameMVCPatternsId.controllers.SaveController;
import MasterMindGameMVCPatternsId.models.DAO.SessionImplementationDAO;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.SessionImplementation;

public class SaveControllerImplementation extends SaveController {

    private final SessionImplementationDAO sessionDao;

    SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDao) {
        super(session);
        this.sessionDao = sessionImplementationDao;
    }

    @Override
    public void save(String name) {
        this.sessionDao.save(name);
    }

    @Override
    public void save() {
        this.sessionDao.save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) {
        return this.sessionDao.exists(name);
    }
}

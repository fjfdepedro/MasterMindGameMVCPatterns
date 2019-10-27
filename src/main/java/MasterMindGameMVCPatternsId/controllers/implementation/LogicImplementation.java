package MasterMindGameMVCPatternsId.controllers.implementation;

import MasterMindGameMVCPatternsId.controllers.Logic;
import MasterMindGameMVCPatternsId.models.SessionImplementation;
import MasterMindGameMVCPatternsId.models.StateValue;
import MasterMindGameMVCPatternsId.models.DAO.SessionImplementationDAO;

public class LogicImplementation extends Logic {

    protected StartControllerImplementation startControllerImplementation;

    protected PlayControllerImplementation playControllerImplementation;

    protected SaveControllerImplementation saveControllerImplementation;

    protected ResumeControllerImplementation resumeControllerImplementation;

    private SessionImplementationDAO sessionDao;

    public LogicImplementation(SessionImplementationDAO sessionDao) {
        this.session = new SessionImplementation();
        this.sessionDao = sessionDao;
        this.sessionDao.associate((SessionImplementation) this.session);
        this.startControllerImplementation = new StartControllerImplementation(this.session, this.sessionDao);
        this.playControllerImplementation = new PlayControllerImplementation(this.session);
        this.saveControllerImplementation = new SaveControllerImplementation(this.session, this.sessionDao);
        this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
        this.acceptorControllers.put(StateValue.INITIAL, this.startControllerImplementation);
        this.acceptorControllers.put(StateValue.IN_GAME, this.playControllerImplementation);
        this.acceptorControllers.put(StateValue.FINAL, this.resumeControllerImplementation);
        this.acceptorControllers.put(StateValue.SAVING, this.saveControllerImplementation);
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

}
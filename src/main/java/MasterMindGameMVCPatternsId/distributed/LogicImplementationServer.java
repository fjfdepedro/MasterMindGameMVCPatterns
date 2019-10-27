package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.implementation.LogicImplementation;
import MasterMindGameMVCPatternsId.distributed.dispatchers.*;
import MasterMindGameMVCPatternsId.models.DAO.SessionImplementationDAO;


public class LogicImplementationServer extends LogicImplementation {

    public LogicImplementationServer(SessionImplementationDAO sesionImplementationDAO) {
        super(sesionImplementationDAO);
    }

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
        dispatcherPrototype.add(FrameType.START_NAME, new StartNameDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.TITLES, new TitlesDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.PROPOSECOMBINATION, new ProposeDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WIDTH, new WidthDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.NEXT, new NextDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.SAVE, new SaveDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.SAVE_NAMED, new SaveNamedDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.HAS_NAME, new HasNameDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.EXISTS, new ExistsDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_TITLE, new GetTitleDispatcher(this.saveControllerImplementation));
        dispatcherPrototype.add(FrameType.SET_TITLE, new SetTitleDispatcher(this.saveControllerImplementation));
    }

}
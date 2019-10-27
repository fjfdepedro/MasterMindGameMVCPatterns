package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.implementation.LogicImplementation;
import MasterMindGameMVCPatternsId.distributed.dispatchers.ColorsDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.BlacksDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.DispatcherPrototype;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.distributed.dispatchers.LooserDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.ProposeDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.RedoDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.RedoableDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.ResumeDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.StartDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.StateDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.AttemptsDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.UndoDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.UndoableDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.WhitesDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.WidthDispatcher;
import MasterMindGameMVCPatternsId.distributed.dispatchers.WinnerDispatcher;


public class LogicImplementationServer extends LogicImplementation {

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.COLORS, new ColorsDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.PROPOSECOMBINATION,
                new ProposeDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WIDTH, new WidthDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.playControllerImplementation));
        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
    }

}
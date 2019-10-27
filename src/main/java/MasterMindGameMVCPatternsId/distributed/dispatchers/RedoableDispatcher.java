package MasterMindGameMVCPatternsId.distributed.dispatchers;

import MasterMindGameMVCPatternsId.controllers.implementation.PlayControllerImplementation;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(PlayControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayControllerImplementation)this.acceptorController).redoable());
    }

}
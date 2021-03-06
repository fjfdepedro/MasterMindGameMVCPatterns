package MasterMindGameMVCPatternsId.distributed.dispatchers;

import MasterMindGameMVCPatternsId.controllers.implementation.PlayControllerImplementation;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(PlayControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((PlayControllerImplementation)this.acceptorController).redo();
    }

}
package MasterMindGameMVCPatternsId.distributed.dispatchers;

import MasterMindGameMVCPatternsId.controllers.implementation.PlayControllerImplementation;
import MasterMindGameMVCPatternsId.types.Color;
import java.util.List;


public class ProposeDispatcher extends Dispatcher {

    public ProposeDispatcher(PlayControllerImplementation playControllerImplementation) {
        super(playControllerImplementation);
    }

    @Override
    public void dispatch() {
        List<Color> colors = this.tcpip.recieveColors();
        this.tcpip.send(((PlayControllerImplementation) this.acceptorController).addProposedCombination(colors));
    }
}
package MasterMindGameMVCPatternsId.distributed.dispatchers;

import MasterMindGameMVCPatternsId.controllers.AcceptorController;
import MasterMindGameMVCPatternsId.distributed.dispatchers.TCPIP;

public abstract class Dispatcher {

    protected AcceptorController acceptorController;

    protected TCPIP tcpip;

    public Dispatcher (AcceptorController acceptorController) {
        this.acceptorController = acceptorController;
    }

    public abstract void dispatch();

    public void associate(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

}
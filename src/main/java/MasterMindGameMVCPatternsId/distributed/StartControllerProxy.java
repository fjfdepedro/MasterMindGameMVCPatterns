package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.utils.TCPIP;

public class StartControllerProxy extends StartController {

    private TCPIP tcpip;

    public StartControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void start() {
        this.tcpip.send(FrameType.START.name());
    }

}
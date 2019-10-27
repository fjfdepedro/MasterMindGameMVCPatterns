package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.ResumeController;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.utils.TCPIP;

public class ResumeControllerProxy extends ResumeController {

    private TCPIP tcpip;

    public ResumeControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void resume(boolean newGame) {
        this.tcpip.send(FrameType.NEW_GAME.name());
        this.tcpip.send(newGame);
    }

}
package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.SaveController;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.distributed.dispatchers.TCPIP;
import MasterMindGameMVCPatternsId.models.Session;

public class SaveControllerProxy extends SaveController {

    private TCPIP tcpip;

    SaveControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void save(String name) {
        this.tcpip.send(FrameType.SAVE.name());
        this.tcpip.send(name);
    }

    @Override
    public void save() {
        this.tcpip.send(FrameType.SAVE_NAMED.name());
    }

    @Override
    public void next() {
        this.tcpip.send(FrameType.NEXT.name());
    }

    @Override
    public boolean hasName() {
        this.tcpip.send(FrameType.HAS_NAME.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean exists(String name) {
        this.tcpip.send(FrameType.EXISTS.name());
        this.tcpip.send(name);
        return this.tcpip.receiveBoolean();
    }
}
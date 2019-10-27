package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.StateValue;
import MasterMindGameMVCPatternsId.utils.TCPIP;

public class SessionProxy implements Session {

    private TCPIP tcpip;

    public SessionProxy(TCPIP tcpip) {
        this.tcpip = tcpip;
    }

    @Override
    public StateValue getValueState() {
        this.tcpip.send(FrameType.STATE.name());
        return StateValue.values()[this.tcpip.receiveInt()];
    }

    @Override
    public int getWidth() {
        this.tcpip.send(FrameType.WIDTH.name());
        return this.tcpip.receiveInt();
    }

}
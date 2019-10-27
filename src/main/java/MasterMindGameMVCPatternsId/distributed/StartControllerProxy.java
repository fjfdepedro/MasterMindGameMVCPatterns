package MasterMindGameMVCPatternsId.distributed;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.utils.TCPIP;
import MasterMindGameMVCPatternsId.types.Color;
import java.util.ArrayList;
import java.util.List;


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

    @Override
    public void start(String title) {
        this.tcpip.send(FrameType.START_NAME.name());
        this.tcpip.send(title);
    }

    @Override
    public String[] getGamesNames() {
        this.tcpip.send(FrameType.TITLES.name());
        int length = this.tcpip.receiveInt();
        String[] names = new String[length];
        for (int i = 0; i < length; i++) {
            names[i] = this.tcpip.receiveLine();
        }
        return names;
    }

}
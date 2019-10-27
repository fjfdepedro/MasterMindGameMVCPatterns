package MasterMindGameMVCPatternsId.distributed;

import java.util.ArrayList;
import java.util.List;
import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.distributed.dispatchers.FrameType;
import MasterMindGameMVCPatternsId.distributed.dispatchers.TCPIP;

public class PlayControllerProxy extends PlayController {

    private TCPIP tcpip;

    PlayControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public Error addProposedCombination(List<Color> colors) {
        this.tcpip.send(FrameType.PROPOSECOMBINATION.name());
        this.tcpip.send(colors);
        return this.tcpip.receiveError();
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isLooser() {
        this.tcpip.send(FrameType.LOOSER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public List<Color> getColors(int position) {
        this.tcpip.send(FrameType.COLORS.name());
        this.tcpip.send(position);
        int size = this.tcpip.receiveInt();
        List<Color> colors = new ArrayList<Color>();
        for (int i = 0; i < size; i++) {
            colors.add(this.tcpip.receiveColor());
        }
        return colors;
    }

    @Override
    public int getAttempts() {
        this.tcpip.send(FrameType.ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public int getBlacks(int position) {
        this.tcpip.send(FrameType.BLACKS.name());
        this.tcpip.send(position);
        return this.tcpip.receiveInt();
    }

    @Override
    public int getWhites(int position) {
        this.tcpip.send(FrameType.WHITES.name());
        this.tcpip.send(position);
        return this.tcpip.receiveInt();
    }

}

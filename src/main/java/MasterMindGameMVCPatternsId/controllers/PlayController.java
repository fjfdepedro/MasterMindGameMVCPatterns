package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;

import java.util.List;

public abstract class PlayController extends AcceptorController {

    protected PlayController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract void undo();

    public abstract void redo();

    public abstract boolean undoable();

    public abstract boolean redoable();

    public abstract boolean isWinner();

    public abstract boolean isLooser();

    public abstract List<Color> getColors(int position);

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract int getAttempts();

    public abstract void next();


    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}

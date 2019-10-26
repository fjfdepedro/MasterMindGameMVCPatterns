package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.views.MessageView;

public class UndoCommand extends Command {

    UndoCommand(PlayController playController) {
        super(MessageView.UNDO_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        this.playController.undo();
        new GameView(this.playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.undoable();
    }

}

package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.views.MessageView;

public class RedoCommand extends Command{

    public RedoCommand(PlayController playController) {
        super(MessageView.REDO_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        this.playController.redo();
        new GameView(this.playController);
    }

    @Override
    protected boolean isActive() {
        return this.playController.redoable();
    }

}

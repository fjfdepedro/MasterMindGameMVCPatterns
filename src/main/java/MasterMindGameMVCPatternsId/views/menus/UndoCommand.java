package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.views.MessageView;

public class UndoCommand extends Command {

	public UndoCommand(PlayController playController) {
		super(MessageView.UNDO_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		((PlayController) this.acceptorController).undo();
	}

	@Override
	protected boolean isActive() {
		return ((PlayController) this.acceptorController).undoable();
	}
	
}

package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.views.MessageView;

class NewGameCommand extends Command {

	protected NewGameCommand(StartController startController) {
		super(MessageView.NEWGAME_COMMAND.getMessage(), startController);
	}

	@Override
	protected void execute() {
		((StartController) this.acceptorController).start();
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}

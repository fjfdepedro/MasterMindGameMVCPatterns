package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.views.MessageView;

class OpenGameCommand extends Command{

	protected OpenGameCommand(StartController startController) {
		super(MessageView.OPENGAME_COMMAND.getMessage(), startController);
	}

	@Override
	protected void execute() {
		new GameSelectMenu((StartController) this.acceptorController).execute();
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}

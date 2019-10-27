package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.AcceptorController;

abstract class Command extends MasterMindGameMVCPatternsId.utils.Command {

	protected AcceptorController acceptorController;

	protected Command(String title, AcceptorController acceptorController) {
		super(title);
		this.acceptorController = acceptorController;
	}
	
}

package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.controllers.AcceptorController;
import MasterMindGameMVCPatternsId.controllers.Controller;
import MasterMindGameMVCPatternsId.controllers.Logic;
import MasterMindGameMVCPatternsId.views.View;
import MasterMindGameMVCPatternsId.views.console.ConsoleView;

public abstract class Mastermind {
	
	private Logic logic;
	
	private View view;

	protected Mastermind() {
		this.logic = this.createLogic();
		this.view = new ConsoleView();
	}

	protected abstract Logic createLogic();

	protected void play() {
		AcceptorController controller;
		do {
			controller = this.logic.getController();
			if (controller != null) {
				this.view.interact(controller);
			}
		} while (controller != null);
	}
	
}


package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.controllers.AcceptorController;
import MasterMindGameMVCPatternsId.controllers.Controller;
import MasterMindGameMVCPatternsId.controllers.Logic;
import MasterMindGameMVCPatternsId.views.View;

public abstract class Mastermind {
	
	private Logic logic;
	
	private View view;
	
	protected Mastermind() {
		this.logic = new Logic();
		this.view = this.createView();
	}
	
	protected abstract View createView();

	protected void play() {
		AcceptorController controller;
		do {
			controller = this.logic.getController();
			if (controller != null){
				this.view.interact(controller);
			}
		} while (controller != null); 
	}
	
}


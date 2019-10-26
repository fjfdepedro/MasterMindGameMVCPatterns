package MasterMindGameMVCPatternsId.views;

import MasterMindGameMVCPatternsId.controllers.AcceptorController;
import MasterMindGameMVCPatternsId.controllers.Controller;
import MasterMindGameMVCPatternsId.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

	public void interact(AcceptorController controller) {
		controller.accept(this);
	}

}

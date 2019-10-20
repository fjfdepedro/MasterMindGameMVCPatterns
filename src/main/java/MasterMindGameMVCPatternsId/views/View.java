package MasterMindGameMVCPatternsId.views;

import MasterMindGameMVCPatternsId.controllers.Controller;
import MasterMindGameMVCPatternsId.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {
	
	public void interact(Controller controller) {
		controller.accept(this);
	}

}

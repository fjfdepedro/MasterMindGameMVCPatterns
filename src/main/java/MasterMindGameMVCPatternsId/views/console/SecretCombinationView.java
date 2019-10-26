package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.Controller;
import MasterMindGameMVCPatternsId.views.MessageView;
import MasterMindGameMVCPatternsId.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {
	
	private Controller controller;
	
	SecretCombinationView(Controller controller) {
		super();
		this.controller = controller;
	}
	
	void writeln() {
		for (int i = 0; i < this.controller.getWidth(); i++) {
			this.console.write(MessageView.SECRET.getMessage());
		}
		this.console.writeln();
	}
	
}

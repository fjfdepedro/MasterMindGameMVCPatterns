package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.utils.WithConsoleView;
import MasterMindGameMVCPatternsId.views.MessageView;

public class AttemptsView  extends WithConsoleView {

	private PlayController playController;

	AttemptsView(PlayController proposalController) {
		this.playController = playController;
	}

	void writeln() {
		MessageView.ATTEMPTS.writeln(this.playController.getAttempts());
	}

}

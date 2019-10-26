package MasterMindGameMVCPatternsId.views.console;

import java.util.List;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.controllers.ProposalController;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.views.console.ErrorView;
import MasterMindGameMVCPatternsId.utils.WithConsoleView;
import MasterMindGameMVCPatternsId.views.MessageView;

class ProposalView extends WithConsoleView {

	void interact(PlayController playController) {

		this.console.writeln();
		new AttemptsView(playController).writeln();
		new SecretCombinationView(playController).writeln();
		for (int i = 0; i < playController.getAttempts(); i++) {
			new ProposedCombinationView(playController).write(i);
			new ResultView(playController).writeln(i);
		}
		if (playController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (playController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
	}

}

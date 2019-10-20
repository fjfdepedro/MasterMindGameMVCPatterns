package MasterMindGameMVCPatternsId.views.console;

import java.util.List;

import MasterMindGameMVCPatternsId.controllers.ProposalController;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.views.console.ErrorView;
import santaTecla.utils.WithConsoleView;
import MasterMindGameMVCPatternsId.views.MessageView;

class ProposalView extends WithConsoleView {

	void interact(ProposalController proposalController) {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView(proposalController).read();
			error = proposalController.addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		this.console.writeln();
		new AttemptsView(proposalController).writeln();
		new SecretCombinationView(proposalController).writeln();
		for (int i = 0; i < proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
		if (proposalController.isWinner()) {
			this.console.writeln(MessageView.WINNER.getMessage());
		} else if (proposalController.isLooser()) {
			this.console.writeln(MessageView.LOOSER.getMessage());
		}
	}

}

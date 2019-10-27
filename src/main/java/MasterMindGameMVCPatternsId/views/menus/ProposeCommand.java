package MasterMindGameMVCPatternsId.views.menus;

import java.util.List;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.views.ErrorView;
import MasterMindGameMVCPatternsId.views.MessageView;
import MasterMindGameMVCPatternsId.views.console.GameView;
import MasterMindGameMVCPatternsId.views.console.ProposedCombinationView;

class ProposeCommand extends Command {

	ProposeCommand(PlayController playController) {
		super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		Error error;
		do {
			List<Color> colors = new ProposedCombinationView((PlayController)this.acceptorController).read();
			error = ((PlayController)this.acceptorController).addProposedCombination(colors);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		new GameView((PlayController)this.acceptorController);
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}

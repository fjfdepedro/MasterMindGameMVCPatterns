package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.controllers.ProposalController;
import MasterMindGameMVCPatternsId.views.MessageView;
import MasterMindGameMVCPatternsId.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	private PlayController playController;

	ResultView(PlayController playController){
		this.playController = playController;
	}

	void writeln(int position) {
		MessageView.RESULT.writeln(this.playController.getBlacks(position), this.playController.getWhites(position));;
	}

}

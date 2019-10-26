package MasterMindGameMVCPatternsId.views.graphics;

import MasterMindGameMVCPatternsId.controllers.ProposalController;
import MasterMindGameMVCPatternsId.controllers.ResumeController;
import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.views.View;

public abstract class GraphicsView extends View {

	private GameView gameView;

	public GraphicsView() {
		this.gameView = new GameView();
	}

	@Override
	public void visit(StartController startController) {
		this.gameView.interact(startController);
	}

	@Override
	public void visit(ProposalController proposalController) {
		this.gameView.interact(proposalController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		ResumeDialog resumeDialog = new ResumeDialog();
		resumeController.resume(resumeDialog.isNewGame());
		if (resumeDialog.isNewGame()) {
			this.gameView = new GameView();
		} else {
			this.gameView.setVisible(false);
			System.exit(0);
		}
	}

}

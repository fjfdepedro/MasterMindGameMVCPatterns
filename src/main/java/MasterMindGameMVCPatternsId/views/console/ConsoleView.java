package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.*;
import MasterMindGameMVCPatternsId.views.View;
import MasterMindGameMVCPatternsId.views.console.PlayMenu;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResumeView saveView;

	public ConsoleView(){
		this.startView = new StartView();
		this.playView = new PlayView();
		this.saveView = new ResumeView();
	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(PlayController playController ) {
		new PlayMenu(playController).execute();
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.saveView.interact(resumeController);
	}

	@Override
	public void interact(AcceptorController acceptorController){
		acceptorController.accept(this);
	}
}

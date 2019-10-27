package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.*;
import MasterMindGameMVCPatternsId.views.View;
import MasterMindGameMVCPatternsId.views.console.PlayMenu;
import MasterMindGameMVCPatternsId.views.menus.StartMenu;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;
	private SaveView saveView;


	public ConsoleView(){
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resumeView = new ResumeView();
		this.saveView = new SaveView();	}

	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
		new StartMenu(startController).execute();
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

	@Override
	public void visit(PlayController playController) {
		this.playView.interact(playController);
		new PlayMenu(playController).execute();
	}

	@Override
	public void visit(SaveController saveController) {
		this.saveView.interact(saveController);
	}
}

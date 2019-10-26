package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.views.View;
import MasterMindGameMVCPatternsId.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	protected View createView() {
		return new ConsoleView();
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

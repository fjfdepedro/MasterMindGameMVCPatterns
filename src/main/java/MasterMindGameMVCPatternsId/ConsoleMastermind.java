package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.controllers.Logic;
import MasterMindGameMVCPatternsId.controllers.implementation.LogicImplementation;
import MasterMindGameMVCPatternsId.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}
}

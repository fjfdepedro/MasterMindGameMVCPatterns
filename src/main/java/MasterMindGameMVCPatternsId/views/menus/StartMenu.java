package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.utils.Menu;

public class StartMenu extends Menu {

	public StartMenu(StartController startController) {
		this.addCommand(new NewGameCommand(startController));
		this.addCommand(new OpenGameCommand(startController));
	}
}

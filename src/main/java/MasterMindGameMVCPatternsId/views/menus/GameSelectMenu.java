package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.StartController;
import MasterMindGameMVCPatternsId.utils.Menu;

class GameSelectMenu extends Menu {

	GameSelectMenu(StartController startController) {
		String[] gamesNames = startController.getGamesNames();
		for (String title : gamesNames) {
			this.addCommand(new GameSelectCommand(title, startController));
		}
	}

}

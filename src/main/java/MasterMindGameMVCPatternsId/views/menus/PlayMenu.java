package MasterMindGameMVCPatternsId.views.menus;

import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.utils.Menu;
import MasterMindGameMVCPatternsId.views.console.ProposeCommand;
import MasterMindGameMVCPatternsId.views.console.RedoCommand;
import MasterMindGameMVCPatternsId.views.console.UndoCommand;

public class PlayMenu extends Menu {

	public PlayMenu(PlayController playController) {
		this.addCommand(new ProposeCommand(playController));
		this.addCommand(new UndoCommand(playController));
		this.addCommand(new RedoCommand(playController));
		this.addCommand(new ExitCommand(playController));
	}

}

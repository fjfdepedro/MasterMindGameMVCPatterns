package MasterMindGameMVCPatternsId.views.console;


import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.utils.Menu;

public class PlayMenu extends Menu {

    PlayMenu(PlayController playController) {
        this.addCommand(new ProposeCommand(playController));
        this.addCommand(new UndoCommand(playController));
        this.addCommand(new RedoCommand(playController));
    }

}

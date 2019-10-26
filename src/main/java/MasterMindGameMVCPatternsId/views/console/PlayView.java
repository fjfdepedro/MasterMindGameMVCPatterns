package MasterMindGameMVCPatternsId.views.console;


import MasterMindGameMVCPatternsId.controllers.PlayController;

class PlayView {

    void interact(PlayController playController) {
        new PlayMenu(playController).execute();
    }

}
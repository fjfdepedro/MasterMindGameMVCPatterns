package MasterMindGameMVCPatternsId.controllers.implementation;

import MasterMindGameMVCPatternsId.controllers.ResumeController;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    public ResumeControllerImplementation(Session session) {
        super(session);
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            ((SessionImplementation) this.session).clearGame();
        } else {
            ((SessionImplementation) this.session).next();
        }
    }

}

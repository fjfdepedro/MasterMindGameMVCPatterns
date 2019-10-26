package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Session;

public class RedoController extends Controller {

    RedoController(Session session) {
        super(session);
    }

    protected void redo() {
        this.session.redo();
    }

    protected boolean redoable() {
        return this.session.redoable();
    }

}

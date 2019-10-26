package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Session;

public class UndoController extends Controller {

    UndoController(Session session) {
        super(session);
    }

    protected void undo() {
        this.session.undo();
    }
    protected boolean undoable() {
        return this.session.undoable();
    }

}
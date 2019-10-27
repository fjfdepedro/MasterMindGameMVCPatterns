package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.SessionImplementation;

public class UndoController extends Controller {

    public UndoController(Session session) {
        super(session);
    }

    public void undo() {
        ((SessionImplementation) this.session).undo();
    }
    public boolean undoable() {
        return ((SessionImplementation) this.session).undoable();
    }

}

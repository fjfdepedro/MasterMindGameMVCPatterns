package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.SessionImplementation;

public class ExitController extends Controller {

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }

}
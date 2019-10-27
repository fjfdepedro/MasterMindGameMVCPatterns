package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Game;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.State;

public abstract class StartController extends AcceptorController {

	public StartController(Session session) {
		super(session);
	}
	
	public abstract void start();
	
	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}

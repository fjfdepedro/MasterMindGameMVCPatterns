package MasterMindGameMVCPatternsId.controllers;

import java.util.HashMap;
import java.util.Map;

import MasterMindGameMVCPatternsId.models.Game;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.State;
import MasterMindGameMVCPatternsId.models.StateValue;

public class Logic {

	private Session session;

	private Map<StateValue, AcceptorController> controllers;
		
	public Logic() {
		this.session = new Session();
		this.controllers = new HashMap<StateValue, AcceptorController>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.session));
		this.controllers.put(StateValue.IN_GAME, new PlayController(this.session));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
	}

	public AcceptorController getController() {
		return this.controllers.get(this.session.getValueState());
	}
	
}

package MasterMindGameMVCPatternsId.controllers;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import MasterMindGameMVCPatternsId.models.Game;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.StateValue;
import MasterMindGameMVCPatternsId.utils.TCPIP;

public class Logic {

	protected Session session;

	protected Map<StateValue, AcceptorController> acceptorControllers;

	protected Logic () {
		this.acceptorControllers = new HashMap<StateValue, AcceptorController>();
	}

	public AcceptorController getController() {
		return this.acceptorControllers.get(this.session.getValueState());
	}

}
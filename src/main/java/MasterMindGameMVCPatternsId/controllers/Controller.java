package MasterMindGameMVCPatternsId.controllers;

import MasterMindGameMVCPatternsId.models.Game;
import MasterMindGameMVCPatternsId.models.Session;
import MasterMindGameMVCPatternsId.models.StateValue;

public abstract class Controller {

	protected Session session;

	Controller(Session session) {
		this.session = session;
	}

	public int getWidth() {
		return this.session.getWidth();
	}

	public StateValue getValueState() {
		return this.session.getValueState();
	}

	public void setName(String name) {
		this.session.setName(name);
	}

	public String getName() {
		return this.session.getName();
	}
}

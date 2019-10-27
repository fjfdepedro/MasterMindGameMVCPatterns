package MasterMindGameMVCPatternsId.distributed.dispatchers;

import MasterMindGameMVCPatternsId.controllers.implementation.SaveControllerImplementation;

public class SetTitleDispatcher extends Dispatcher {

	public SetTitleDispatcher(SaveControllerImplementation saveControllerImplementation) {
		super(saveControllerImplementation);
	}

	@Override
	public void dispatch() {
		String title = this.tcpip.receiveLine();
		this.acceptorController.setName(title);
	}

}

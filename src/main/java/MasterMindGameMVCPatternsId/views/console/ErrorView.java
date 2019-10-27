package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.utils.Console;

class ErrorView extends MasterMindGameMVCPatternsId.views.ErrorView {

	ErrorView(Error error) {
		super(error);
	}
	
	public void writeln() {
		new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
	}	

}

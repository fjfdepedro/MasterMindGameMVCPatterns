package MasterMindGameMVCPatternsId.views;

import MasterMindGameMVCPatternsId.utils.Console;

public enum MessageView {
	ATTEMPTS("#attempts attempt(s): "),
	SECRET("*"),
	RESUME("Do you want to continue"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	PROPOSE_COMMAND("Propose Combination"),
	UNDO_COMMAND("Undo previous Proposal"),
	REDO_COMMAND("Redo previous Proposal"),
	NEW_LINE(""),
	SAVE("Do you want to save the game?"),
	NEWGAME_COMMAND("Start a new game"),
	EXIT_COMMAND("Exit game"),
	OPENGAME_COMMAND("Open a saved game"),
	NAME("Name: "),
	NAME_EXISTS("The proposed name already exists");

	private String message;
	private Console console;
	
	private MessageView(String message) {

		this.message = message;
		this.console = new Console();
	}
	
	public String getMessage() {
		return this.message;
	}

	public void writeln() {
		this.console.writeln(this.message);
	}

	public void writeln(int attempts) {
		this.console.writeln(this.message.replaceAll("#attempts", "" + attempts));
	}

	public void writeln(int blacks, int whites) {
		this.console.writeln(this.message.replaceAll("#blacks", "" + blacks).replaceAll("#whites", "" + whites));
	}

	public void write() {
		this.console.write(this.message);
	}

}

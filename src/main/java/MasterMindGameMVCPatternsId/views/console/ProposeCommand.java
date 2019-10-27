package MasterMindGameMVCPatternsId.views.console;


import java.util.List;
import MasterMindGameMVCPatternsId.controllers.PlayController;
import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.types.Error;
import MasterMindGameMVCPatternsId.views.MessageView;

public class ProposeCommand extends Command {

    public ProposeCommand(PlayController playController) {
        super(MessageView.PROPOSE_COMMAND.getMessage(), playController);
    }

    @Override
    protected void execute() {
        Error error;
        do {
            List<Color> colors = new ProposedCombinationView(this.playController).read();
            error = this.playController.addProposedCombination(colors);
            if (error != null) {
                new ErrorView(error).writeln();
            }
        } while (error != null);
        new GameView(this.playController);
    }

    @Override
    protected boolean isActive() {
        return true;
    }

}
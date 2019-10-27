package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.controllers.Logic;
import MasterMindGameMVCPatternsId.controllers.implementation.LogicImplementation;
import MasterMindGameMVCPatternsId.models.DAO.SessionImplementationDAO;


public class ConsoleMastermind extends Mastermind{

    protected Logic createLogic() {
        return new LogicImplementation(new SessionImplementationDAO());
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
package MasterMindGameMVCPatternsId.models.DAO;

import MasterMindGameMVCPatternsId.models.DAO.CombinationDAO;
import MasterMindGameMVCPatternsId.models.ProposedCombination;

class ProposedCombinationDAO extends CombinationDAO {

	ProposedCombinationDAO(ProposedCombination proposedCombination) {
		super(proposedCombination);
	}

	ProposedCombination getProposedCombination() {
		return (ProposedCombination) this.combination;
	}

}

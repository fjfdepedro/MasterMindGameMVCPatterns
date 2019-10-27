package MasterMindGameMVCPatternsId.models.DAO;

import java.io.BufferedReader;

import MasterMindGameMVCPatternsId.models.DAO.CombinationDAO;
import MasterMindGameMVCPatternsId.models.SecretCombination;

class SecretCombinationDAO extends CombinationDAO {
	
	SecretCombinationDAO(SecretCombination secretCombination) {
		super(secretCombination);
	}
	
	public void load(BufferedReader bufferedReader) {
		this.combination.clearColors();
		super.load(bufferedReader);
	}

}

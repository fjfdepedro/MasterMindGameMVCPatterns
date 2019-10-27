package MasterMindGameMVCPatternsId.models.DAO;

import MasterMindGameMVCPatternsId.models.Result;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResultDAO {

	public Result result;

	public ResultDAO(Result result) {
		this.result = result;
	}
	
	public Result getResult() {
		return this.result;
	}

	public void save(FileWriter fileWriter) {
		try {
			fileWriter.write(this.result.getBlacks() + "\n");
			fileWriter.write(this.result.getWhites() + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load(BufferedReader bufferedReader) {
		try {
			this.result.setBlacks(Integer.parseInt(bufferedReader.readLine()));
			this.result.setWhites(Integer.parseInt(bufferedReader.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}

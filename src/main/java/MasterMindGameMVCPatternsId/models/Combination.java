package MasterMindGameMVCPatternsId.models;

import java.util.ArrayList;
import java.util.List;

import MasterMindGameMVCPatternsId.types.Color;

public abstract class Combination {
	
	private static final int WIDTH = 4;

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	public static int getWidth() {
		return Combination.WIDTH;
	}
	
}

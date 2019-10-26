package MasterMindGameMVCPatternsId;

import MasterMindGameMVCPatternsId.views.View;
import MasterMindGameMVCPatternsId.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

	protected View createView() {
		return new GraphicsView();
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}

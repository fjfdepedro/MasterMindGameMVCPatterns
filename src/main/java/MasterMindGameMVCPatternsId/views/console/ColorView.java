package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.types.Color;
import MasterMindGameMVCPatternsId.utils.Console;

class ColorView extends MasterMindGameMVCPatternsId.views.ColorView {

	ColorView(Color color) {
		super(color);
	}
	
	void write() {
		new Console().write(ColorView.INITIALS[this.color.ordinal()]);
	}

}

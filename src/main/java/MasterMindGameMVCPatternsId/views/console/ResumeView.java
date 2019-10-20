package MasterMindGameMVCPatternsId.views.console;

import MasterMindGameMVCPatternsId.controllers.ResumeController;
import MasterMindGameMVCPatternsId.views.MessageView;
import santaTecla.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}

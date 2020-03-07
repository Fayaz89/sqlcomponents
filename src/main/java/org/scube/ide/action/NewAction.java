package org.scube.ide.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.scube.ide.ApplicationManager;
import org.scube.ide.screen.model.SetupRequest;
import org.scube.scubedao.constants.RequestContants;
import org.scube.scubedao.model.DaoProject;

final class NewAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		SetupRequest request = new SetupRequest();
		request.setRequestParameter(RequestContants.PARAM_DAO_PROJECT,
				new DaoProject());
		ApplicationManager.getApplicationManager().openModelDialog(
				"org.scube.scubedao.ide.propertyeditor.IcgProjectScreen",request);
	}

}

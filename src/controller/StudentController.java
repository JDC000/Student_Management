package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import view.ManagementView;

public class StudentController implements Action {
	public ManagementView view;

	public StudentController(ManagementView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		if (cm.equals("Hinzufügen")) {
			this.view.entfernForm();
			this.view.model.setAuswahl("Hinzufügen");
		} else if (cm.equals("Speichern")) {
			try {
				this.view.studentEinfügen();

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (cm.equals("Aktualisieren")) {
			this.view.studentInfo();

		}

		else if (cm.equals("Löschen")) {
			this.view.deleteStudent();

		} else if (cm.equals("Abbrechen")) {
			this.view.entfernForm();

		} else if (cm.equals("Suchen")) {
			this.view.suchen();

		} else if (cm.equals("Suchen Abbrechen")) {
			this.view.suchenAbbrechen();

		}

	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub

	}

}

package test;

import javax.swing.UIManager;

import view.ManagementView;

public class test {
	public void main(String[] args) {
		try {
			UIManager.setInstalledLookAndFeels(UIManager.getInstalledLookAndFeels());
			new ManagementView();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import controller.StudentController;
import model.Fach;
import model.ManagementModel;
import model.Student;
import model.stadt;

public class ManagementView extends JFrame {

	private static final long serialVersionUID = 1L;
	public ManagementModel model;
	public JTextField textField_MNr;
	public JTable table;
	public JTextField textField_Mnr;
	public JTextField textField_NName;
	public JTextField textField_VName;
	public JTextField textField_Note1;
	public JTextField textField_Note2;
	public JTextField textField_Note3;
	public JComboBox comboBox_Herkunft;
	public JComboBox comboBox_Fach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					ManagementView frame = new ManagementView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagementView() {
		this.model = new ManagementModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 604);

		ActionListener action = new StudentController(this);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setForeground(Color.BLACK);
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);

		JMenu menuFIle = new JMenu("File");
		menuFIle.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		menuFIle.setForeground(UIManager.getColor("Button.background"));
		menuBar.add(menuFIle);

		JMenuItem itemOpen = new JMenuItem("Open");
		itemOpen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		;
		menuFIle.add(itemOpen);

		JMenuItem itemClose = new JMenuItem("Close");
		itemClose.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		;
		menuFIle.add(itemClose);

		JSeparator separator = new JSeparator();
		menuFIle.add(separator);

		JMenuItem itemExit = new JMenuItem("Exit");
		itemExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		;
		menuFIle.add(itemExit);

		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		menuBar.add(menuAbout);

		JMenuItem itemAboutMe = new JMenuItem("About me");
		itemAboutMe.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		;
		menuAbout.add(itemAboutMe);
		getContentPane().setLayout(null);

		JLabel LabelHerkunft = new JLabel("Herkunft");
		LabelHerkunft.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelHerkunft.setBounds(40, 32, 78, 57);
		getContentPane().add(LabelHerkunft);

		JLabel LabelMNr = new JLabel("Matrikelnummer");
		LabelMNr.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelMNr.setBounds(229, 41, 155, 38);
		getContentPane().add(LabelMNr);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(564, 52, 1, 16);
		getContentPane().add(textArea);

		textField_MNr = new JTextField();
		textField_MNr.setColumns(10);
		textField_MNr.setBounds(361, 33, 124, 57);
		getContentPane().add(textField_MNr);

		JButton SuchenButton = new JButton("Suchen");
		SuchenButton.addActionListener(action);
		SuchenButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		SuchenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		SuchenButton.setBounds(497, 41, 117, 41);
		getContentPane().add(SuchenButton);

		JComboBox comboBox_Herkunft_1 = new JComboBox();
		ArrayList<stadt> stadtListe = stadt.getStadtListe();
		for (stadt stadt : stadtListe) {
			comboBox_Herkunft_1.addItem(stadt.getStadtName());

		}
		comboBox_Herkunft_1.setBounds(131, 40, 86, 43);
		getContentPane().add(comboBox_Herkunft_1);

		JLabel lblStudentenliste = new JLabel("Studentenliste");
		lblStudentenliste.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblStudentenliste.setBounds(40, 101, 231, 38);
		getContentPane().add(lblStudentenliste);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 92, 767, 12);
		getContentPane().add(separator_1);

		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "MNr", "Nachname", "Vorname", "Herkunft",
				"Fachrichtung", "Note 1", "Note  2", "Note 3" }));
		table.setRowHeight(25);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(45, 137, 743, 100);
		getContentPane().add(scrollPane);

		JLabel LabelMNr_2 = new JLabel("Matrikelnummer");
		LabelMNr_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelMNr_2.setBounds(40, 302, 139, 33);
		getContentPane().add(LabelMNr_2);

		JLabel LabelNName = new JLabel("Nachname");
		LabelNName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelNName.setBounds(40, 347, 117, 33);
		getContentPane().add(LabelNName);

		JLabel LabelVName = new JLabel("Vorname");
		LabelVName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelVName.setBounds(40, 392, 117, 33);
		getContentPane().add(LabelVName);

		JLabel LabelHerkunft_2 = new JLabel("Herkunft");
		LabelHerkunft_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelHerkunft_2.setBounds(40, 439, 117, 33);
		getContentPane().add(LabelHerkunft_2);

		JLabel LabelFach = new JLabel("Fachrichtung");
		LabelFach.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelFach.setBounds(385, 302, 117, 33);
		getContentPane().add(LabelFach);

		JLabel LabelNote_1 = new JLabel("Note 1");
		LabelNote_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelNote_1.setBounds(385, 347, 117, 33);
		getContentPane().add(LabelNote_1);

		JLabel LabelNote_2 = new JLabel("Note 2");
		LabelNote_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelNote_2.setBounds(385, 392, 117, 33);
		getContentPane().add(LabelNote_2);

		JLabel LabelNote_3 = new JLabel("Note 3");
		LabelNote_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelNote_3.setBounds(385, 439, 117, 33);
		getContentPane().add(LabelNote_3);

		JLabel LabelInfo = new JLabel("Persönliche Infomationen");
		LabelInfo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LabelInfo.setBounds(40, 257, 286, 33);
		getContentPane().add(LabelInfo);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(40, 249, 767, 12);
		getContentPane().add(separator_1_1);

		textField_Mnr = new JTextField();
		textField_Mnr.setColumns(10);
		textField_Mnr.setBounds(196, 292, 147, 38);
		getContentPane().add(textField_Mnr);

		textField_NName = new JTextField();
		textField_NName.setColumns(10);
		textField_NName.setBounds(196, 342, 147, 38);
		getContentPane().add(textField_NName);

		textField_VName = new JTextField();
		textField_VName.setColumns(10);
		textField_VName.setBounds(196, 390, 147, 38);
		getContentPane().add(textField_VName);

		textField_Note1 = new JTextField();
		textField_Note1.setColumns(10);
		textField_Note1.setBounds(528, 345, 147, 38);
		getContentPane().add(textField_Note1);

		textField_Note2 = new JTextField();
		textField_Note2.setColumns(10);
		textField_Note2.setBounds(528, 390, 147, 38);
		getContentPane().add(textField_Note2);

		textField_Note3 = new JTextField();
		textField_Note3.setColumns(10);
		textField_Note3.setBounds(528, 437, 147, 38);
		getContentPane().add(textField_Note3);

		comboBox_Herkunft = new JComboBox();
		comboBox_Herkunft.addItem("");
		// ArrayList<stadt> stadtListe1 = stadt.getStadtListe();
		for (stadt stadt : stadtListe) {
			comboBox_Herkunft.addItem(stadt.getStadtName());

		}
		comboBox_Herkunft.setBounds(196, 436, 147, 43);
		getContentPane().add(comboBox_Herkunft);

		comboBox_Fach = new JComboBox();
		comboBox_Fach.addItem("");
		ArrayList<Fach> fachListe1 = Fach.getFachListe();
		for (Fach fach : fachListe1) {
			comboBox_Fach.addItem(fach.getFachname());

		}
		comboBox_Fach.setBounds(528, 292, 147, 43);
		getContentPane().add(comboBox_Fach);

		JButton btnHinzufuegen = new JButton("Hinzufügen");
		btnHinzufuegen.addActionListener(action);
		btnHinzufuegen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHinzufuegen.setBounds(40, 484, 117, 41);
		getContentPane().add(btnHinzufuegen);

		JButton btnAktualisieren = new JButton("Aktualisieren");
		btnAktualisieren.addActionListener(action);
		btnAktualisieren.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAktualisieren.setBounds(181, 484, 145, 41);
		getContentPane().add(btnAktualisieren);

		JButton btnLoeschen = new JButton("Löschen");
		btnLoeschen.addActionListener(action);
		btnLoeschen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLoeschen.setBounds(361, 484, 117, 41);
		getContentPane().add(btnLoeschen);

		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(action);
		btnSpeichern.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSpeichern.setBounds(506, 484, 117, 41);
		getContentPane().add(btnSpeichern);

		JButton btnAbrechen = new JButton("Abbrechen");
		btnAbrechen.addActionListener(action);
		btnAbrechen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAbrechen.setBounds(651, 484, 117, 41);
		getContentPane().add(btnAbrechen);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(40, 479, 767, 12);
		getContentPane().add(separator_1_1_1);

		JButton btnAbbrechen_1 = new JButton("Suchen Abbrechen");
		btnAbbrechen_1.addActionListener(action);
		btnAbbrechen_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAbbrechen_1.setBounds(626, 41, 162, 41);
		getContentPane().add(btnAbbrechen_1);

		this.setVisible(true);
	}

	public void entfernForm() {
		textField_Mnr.setText("");
		textField_NName.setText("");
		textField_VName.setText("");
		textField_Note1.setText("");
		textField_Note2.setText("");
		textField_Note3.setText("");
		comboBox_Herkunft.setSelectedIndex(-1);
		comboBox_Fach.setSelectedIndex(-1);

	}

	public void addOderUpdateStudent(Student st) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.existCheck(st)) {
			this.model.insert(st);
			model_table.addRow(new Object[] { st.getMMr() + "", st.getStudentNName(), st.getStudentVName(),
					st.getHerkunft().getStadtName(), st.getFach().getFachname(), st.getNoteModul1() + "",
					st.getNoteModul2() + "", st.getNoteModul3() + "" });

		} else {
			this.model.update(st);
			int row = model_table.getRowCount();
			for (int i = 0; i < row; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (id.equals(st.getMMr() + "")) {
					model_table.setValueAt(st.getMMr() + "", i, 0);
					model_table.setValueAt(st.getStudentNName() + "", i, 1);
					model_table.setValueAt(st.getStudentVName() + "", i, 2);
					model_table.setValueAt(st.getHerkunft() + "", i, 3);
					model_table.setValueAt(st.getFach() + "", i, 4);
					model_table.setValueAt(st.getNoteModul1() + "", i, 5);
					model_table.setValueAt(st.getNoteModul2() + "", i, 6);
					model_table.setValueAt(st.getNoteModul3() + "", i, 7);

				}

			}
		}
	}

	public void updateStudent(Student st) {
		// TODO Auto-generated method stub

	}

	public Student getAusgewahlteStudent() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();

		int MMr = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
		String studentNName = model_table.getValueAt(i_row, 1) + "";
		String studentVName = model_table.getValueAt(i_row, 2) + "";
		stadt Stadt = stadt.getStadtByName(model_table.getValueAt(i_row, 3) + "");

		Fach fach = Fach.getFachByName(model_table.getValueAt(i_row, 4) + "");
		Float noteModul1 = Float.valueOf(model_table.getValueAt(i_row, 5) + "");
		Float noteModul2 = Float.valueOf(model_table.getValueAt(i_row, 6) + "");
		Float noteModul3 = Float.valueOf(model_table.getValueAt(i_row, 7) + "");

		Student st = new Student(MMr, studentNName, studentVName, Stadt, fach, noteModul1, noteModul2, noteModul3);
		return st;

	}

	public void studentInfo() {
		Student st = this.getAusgewahlteStudent();

		this.textField_Mnr.setText(st.getMMr() + "");
		this.textField_NName.setText(st.getStudentNName());
		this.textField_VName.setText(st.getStudentVName());
		this.comboBox_Herkunft.setSelectedItem(st.getHerkunft().getStadtName());
		this.comboBox_Fach.setSelectedItem(st.getFach().getFachname());
		this.textField_Note1.setText(st.getNoteModul1() + "");
		this.textField_Note2.setText(st.getNoteModul2() + "");
		this.textField_Note3.setText(st.getNoteModul3() + "");
	}

	public void deleteStudent() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int auswahl = JOptionPane.showConfirmDialog(this, "Mochten Sie diese Student unwiederruflich löschen?");
		if (auswahl == JOptionPane.YES_OPTION) {
			Student st = this.getAusgewahlteStudent();
			this.model.delete(st);
			model_table.removeRow(i_row);

		}
	}

	public void studentEinfügen() {
		int MMr = Integer.valueOf(this.textField_Mnr.getText());
		String studentNName = this.textField_NName.getText();
		String studentVName = this.textField_VName.getText();
		int herkunft = this.comboBox_Herkunft.getSelectedIndex();
		stadt Stadt = stadt.getStadtById(herkunft);
		int fachrichung = this.comboBox_Fach.getSelectedIndex();
		Fach fach = Fach.getFachById(fachrichung);
		Float noteModul1 = Float.valueOf(this.textField_Note1.getText());
		Float noteModul2 = Float.valueOf(this.textField_Note2.getText());
		Float noteModul3 = Float.valueOf(this.textField_Note3.getText());

		Student st = new Student(MMr, studentNName, studentVName, Stadt, fach, noteModul1, noteModul2, noteModul3);
		this.addOderUpdateStudent(st);

	}

	public void suchen() {
		int herkunft = this.comboBox_Herkunft.getSelectedIndex() - 1;
		String studentName = this.textField_NName.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int rowAnzahl = model_table.getRowCount();
		Set<Integer> idGelöschteStudent = new TreeSet<Integer>();
		if (herkunft >= 0) {
			stadt ausgewahlteStadt = stadt.getStadtById(herkunft);
			for (int i = 0; i < rowAnzahl; i++) {
				String stadtName = model_table.getValueAt(i, 3) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (!stadtName.equals(ausgewahlteStadt)) {
					idGelöschteStudent.add(Integer.valueOf(id));

					// studentName.length()>0: Name wurde eingegeben
				}
			}
		}
		if (studentName.length() > 0) {
			// studentName.length()>0: Name wurde eingegeben
			for (int i = 0; i < rowAnzahl; i++) {
				String studentNameinTable = model_table.getValueAt(i, 1) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (studentNameinTable.indexOf(studentName) < 0) {
					idGelöschteStudent.add(Integer.valueOf(id));

				}
			}
		}
	}

	public void suchenAbbrechen() {
		// TODO Auto-generated method stub

	}
}

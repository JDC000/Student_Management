package model;

import java.util.ArrayList;

public class ManagementModel {
	private ArrayList<Student> listStudent;
	private String auswahl;

	public ManagementModel() {

		this.listStudent = new ArrayList<Student>();
		this.auswahl = "";
	}

	public String getAuswahl() {
		return auswahl;
	}

	public void setAuswahl(String auswahl) {
		this.auswahl = auswahl;
	}

	public ManagementModel(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}

	public void insert(Student student) {
		this.listStudent.add(student);

	}

	public void delete(Student student) {
		this.listStudent.remove(student);

	}

	public void update(Student student) {
		this.listStudent.remove(student);
		this.listStudent.add(student);

	}

	public boolean existCheck(Student st) {
		for (Student student : listStudent) {
			if (student.getMMr() == st.getMMr())
				return true;
		}
		return false;
	}

}

package model;

import java.util.Objects;

public class Student {
	private int MMr;
	private String studentNName;
	private String studentVName;
	private stadt herkunft;
	private Fach fach;
	private boolean geschlecht;
	private float noteModul1, noteModul2, noteModul3;

	public Student() {

	}

	public Student(int mMr, String studentNName, String studentVName, stadt herkunft, Fach fach, float noteModul1,
			float noteModul2, float noteModul3) {
		MMr = mMr;
		this.studentNName = studentNName;
		this.studentVName = studentVName;
		this.herkunft = herkunft;
		this.fach = fach;
		this.noteModul1 = noteModul1;
		this.noteModul2 = noteModul2;
		this.noteModul3 = noteModul3;
	}

	public int getMMr() {
		return MMr;
	}

	public void setMMr(int mMr) {
		MMr = mMr;
	}

	public String getStudentNName() {
		return studentNName;
	}

	public void setStudentNName(String studentNName) {
		this.studentNName = studentNName;
	}

	public String getStudentVName() {
		return studentVName;
	}

	public void setStudentVName(String studentVName) {
		this.studentVName = studentVName;
	}

	public stadt getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(stadt herkunft) {
		this.herkunft = herkunft;
	}

	public Fach getFach() {
		return fach;
	}

	public void setFach(Fach fach) {
		this.fach = fach;
	}

	public boolean isGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}

	public float getNoteModul1() {
		return noteModul1;
	}

	public void setNoteModul1(float noteModul1) {
		this.noteModul1 = noteModul1;
	}

	public float getNoteModul2() {
		return noteModul2;
	}

	public void setNoteModul2(float noteModul2) {
		this.noteModul2 = noteModul2;
	}

	public float getNoteModul3() {
		return noteModul3;
	}

	public void setNoteModul3(float noteModul3) {
		this.noteModul3 = noteModul3;
	}

	@Override
	public String toString() {
		return "Student [MMr=" + MMr + ", studentNName=" + studentNName + ", studentVName=" + studentVName
				+ ", herkunft=" + herkunft + ", fach=" + fach + ", geschlecht=" + geschlecht + ", noteModul1="
				+ noteModul1 + ", noteModul2=" + noteModul2 + ", noteModul3=" + noteModul3 + "]";

	}

	@Override
	public int hashCode() {
		return Objects.hash(MMr, fach, geschlecht, herkunft, noteModul1, noteModul2, noteModul3, studentNName,
				studentVName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return MMr == other.MMr && Objects.equals(fach, other.fach) && geschlecht == other.geschlecht
				&& Objects.equals(herkunft, other.herkunft)
				&& Float.floatToIntBits(noteModul1) == Float.floatToIntBits(other.noteModul1)
				&& Float.floatToIntBits(noteModul2) == Float.floatToIntBits(other.noteModul2)
				&& Float.floatToIntBits(noteModul3) == Float.floatToIntBits(other.noteModul3)
				&& Objects.equals(studentNName, other.studentNName) && Objects.equals(studentVName, other.studentVName);
	}

}

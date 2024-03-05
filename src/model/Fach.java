package model;

import java.util.ArrayList;
import java.util.Objects;

public class Fach {
	private String fachname;
	private int FNr;

	public Fach(String fachname, int fNr) {
		super();
		this.fachname = fachname;
		FNr = fNr;
	}

	public int getFNr() {
		return FNr;
	}

	public void setFNr(int fNr) {
		FNr = fNr;
	}

	public Fach(String fachname) {
		this.fachname = fachname;
	}

	public String getFachname() {
		return fachname;
	}

	public void setFachname(String fachname) {
		this.fachname = fachname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FNr, fachname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fach other = (Fach) obj;
		return FNr == other.FNr && Objects.equals(fachname, other.fachname);
	}

	@Override
	public String toString() {
		return fachname;
	}

	public static ArrayList<Fach> getFachListe() {
		String[] arr_fach = { "Wirtschaftsinformatik", "Wirtschaftsingenierwesen", "Betriebwirtschaftslehrer",
				"Logistik Management", "Wirtschaftsmatematik" };
		ArrayList<Fach> fachListe = new ArrayList<Fach>();
		int i = 0;
		for (String fach : arr_fach) {
			Fach f = new Fach(fach, i);
			fachListe.add(f);

		}
		return fachListe;

	}

	public static Fach getFachById(int fachrichtung) {
		return Fach.getFachListe().get(fachrichtung);
	}

	public static Fach getFachByName(String fachName) {

		ArrayList<Fach> fachList = Fach.getFachListe();
		for (Fach fach : fachList) {
			if (fach.getFachname().equals(fachName))
				return fach;
		}
		return null;
	}
}

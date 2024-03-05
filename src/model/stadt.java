package model;

import java.util.ArrayList;
import java.util.Objects;

public class stadt {
	private String stadtName;
	private int plz;

	public stadt(String stadtName, int plz) {
		super();
		this.stadtName = stadtName;
		this.plz = plz;
	}

	public String getStadtName() {
		return stadtName;
	}

	public void setStadtName(String stadtName) {
		this.stadtName = stadtName;
	}

	@Override
	public String toString() {
		return stadtName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(plz, stadtName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stadt other = (stadt) obj;
		return plz == other.plz && Objects.equals(stadtName, other.stadtName);
	}

	public static ArrayList<stadt> getStadtListe() {
		String[] arr_stadt = { "Frankfurt", "Friedberg", "Wetzlar", "Köln", "München", "Berlin", "Nürnberg", "Ulm",
				"Gießen" };
		ArrayList<stadt> stadtListe = new ArrayList<stadt>();
		int i = 0;
		for (String stadtName : arr_stadt) {
			stadt s = new stadt(stadtName, i);
			stadtListe.add(s);
		}
		return stadtListe;
	}

	public static stadt getStadtById(int herkunft) {

		return stadt.getStadtListe().get(herkunft);
	}

	public static stadt getStadtByName(String stadtName) {
		ArrayList<stadt> stadtList = stadt.getStadtListe();
		for (stadt Stadt : stadtList) {
			if (Stadt.stadtName.equals(stadtName))
				return Stadt;

		}
		return null;
	}

}

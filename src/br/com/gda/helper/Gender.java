package br.com.gda.helper;

import java.util.ArrayList;

public class Gender {

	private Integer codGender;
	private ArrayList<GenderText> genderText = new ArrayList<GenderText>();

	public Integer getCodGender() {
		return codGender;
	}

	public void setCodGender(Integer codGender) {
		this.codGender = codGender;
	}

	public ArrayList<GenderText> getGenderText() {
		return genderText;
	}

	public void setGenderText(ArrayList<GenderText> genderText) {
		this.genderText = genderText;
	}

}

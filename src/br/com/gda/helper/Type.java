package br.com.gda.helper;

import java.util.ArrayList;

public class Type {

	private Integer codType;
	private ArrayList<TypeText> typeText = new ArrayList<TypeText>();

	public Integer getCodType() {
		return codType;
	}

	public void setCodType(Integer codType) {
		this.codType = codType;
	}

	public ArrayList<TypeText> getTypeText() {
		return typeText;
	}

	public void setTypeText(ArrayList<TypeText> typeText) {
		this.typeText = typeText;
	}

}

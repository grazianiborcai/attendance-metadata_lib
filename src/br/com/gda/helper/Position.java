package br.com.gda.helper;

import java.util.ArrayList;

public class Position {

	private Integer codPosition;
	private ArrayList<PositionText> positionText = new ArrayList<PositionText>();

	public Integer getCodPosition() {
		return codPosition;
	}

	public void setCodPosition(Integer codPosition) {
		this.codPosition = codPosition;
	}

	public ArrayList<PositionText> getPositionText() {
		return positionText;
	}

	public void setPositionText(ArrayList<PositionText> positionText) {
		this.positionText = positionText;
	}

}

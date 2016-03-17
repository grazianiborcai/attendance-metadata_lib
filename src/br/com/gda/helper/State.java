package br.com.gda.helper;

import java.util.ArrayList;

public class State {

	private String country;
	private String state;
	private ArrayList<StateText> stateText = new ArrayList<StateText>();

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ArrayList<StateText> getStateText() {
		return stateText;
	}

	public void setStateText(ArrayList<StateText> stateText) {
		this.stateText = stateText;
	}

}

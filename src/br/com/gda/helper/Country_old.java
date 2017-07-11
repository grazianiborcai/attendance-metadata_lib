package br.com.gda.helper;

import java.util.ArrayList;

public class Country_old {

	private String country;
	private ArrayList<Country> countryText = new ArrayList<Country>();
	private ArrayList<State> state = new ArrayList<State>();

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Country> getCountryText() {
		return countryText;
	}

	public void setCountryText(ArrayList<Country> countryText) {
		this.countryText = countryText;
	}

	public ArrayList<State> getState() {
		return state;
	}

	public void setState(ArrayList<State> state) {
		this.state = state;
	}

}

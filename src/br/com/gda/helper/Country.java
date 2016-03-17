package br.com.gda.helper;

import java.util.ArrayList;

public class Country {

	private String country;
	private ArrayList<CountryText> countryText = new ArrayList<CountryText>();
	private ArrayList<State> state = new ArrayList<State>();

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<CountryText> getCountryText() {
		return countryText;
	}

	public void setCountryText(ArrayList<CountryText> countryText) {
		this.countryText = countryText;
	}

	public ArrayList<State> getState() {
		return state;
	}

	public void setState(ArrayList<State> state) {
		this.state = state;
	}

}

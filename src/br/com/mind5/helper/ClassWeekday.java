package br.com.mind5.helper;

import java.util.ArrayList;

public class ClassWeekday extends Class{
	
	private ArrayList<Weekday> weekday = new ArrayList<Weekday>();

	public ClassWeekday(Long classID, Long placeID) {
		// TODO Auto-generated constructor stub
		super.setClassID(classID);
		super.setPlaceID(placeID);
	}

	public ArrayList<Weekday> getWeekday() {
		return weekday;
	}

	public void setWeekday(ArrayList<Weekday> weekday) {
		this.weekday = weekday;
	}


}

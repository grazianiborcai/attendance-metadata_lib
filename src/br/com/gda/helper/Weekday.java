package br.com.gda.helper;

import java.util.ArrayList;

public class Weekday {

	public Integer weekday;
	public ArrayList<WeekdayText> weekdayText = new ArrayList<WeekdayText>();

	public Integer getWeekday() {
		return weekday;
	}

	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
	}

	public ArrayList<WeekdayText> getWeekdayText() {
		return weekdayText;
	}

	public void setWeekdayText(ArrayList<WeekdayText> weekdayText) {
		this.weekdayText = weekdayText;
	}

}

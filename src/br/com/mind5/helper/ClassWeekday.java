package br.com.mind5.helper;

import java.time.LocalTime;
import java.util.ArrayList;

public class ClassWeekday extends Class {

	private ArrayList<Weekday> weekday = new ArrayList<Weekday>();
	private LocalTime beginTime;
	private Integer duration;
	private LocalTime endTime;

	public ClassWeekday(Long classID, Place place) {
		// TODO Auto-generated constructor stub
		super.setClassID(classID);
		super.setPlace(place);
	}

	public ArrayList<Weekday> getWeekday() {
		return weekday;
	}

	public void setWeekday(ArrayList<Weekday> weekday) {
		this.weekday = weekday;
	}

	public LocalTime getBeginTime() {
		if (beginTime != null)
			return beginTime;
		else
			return LocalTime.now();
	}

	public void setBeginTime(LocalTime beginTime) {
		this.beginTime = beginTime;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public LocalTime getEndTime() {
		if (endTime != null)
			return endTime;
		else
			return LocalTime.now();
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

}

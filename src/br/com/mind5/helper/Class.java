package br.com.mind5.helper;

import java.time.LocalTime;
import java.util.ArrayList;

public class Class {

	private Long classID;
	private Place place;
	private String name;
	private LocalTime beginTime;
	private Integer duration;
	private LocalTime endTime;
	private ArrayList<Weekday> weekday = new ArrayList<Weekday>();

	public Long getClassID() {
		return classID;
	}

	public void setClassID(Long classID) {
		this.classID = classID;
	}

	public Place getPlace() {
		if (place != null)
			return place;
		else
			return new Place();
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ArrayList<Weekday> getWeekday() {
		return weekday;
	}

	public void setWeekday(ArrayList<Weekday> weekday) {
		this.weekday = weekday;
	}

}

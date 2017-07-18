package br.com.mind5.helper;

import java.time.LocalDate;

public class Attendance {

	private People people;
	private Long classID;
	private Long placeID;
	private LocalDate date;
	private String attTypeID;

	public People getPeople() {
		if (people != null)
			return people;
		else
			return new People();
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public Long getClassID() {
		return classID;
	}

	public void setClassID(Long classID) {
		this.classID = classID;
	}

	public Long getPlaceID() {
		return placeID;
	}

	public void setPlaceID(Long placeID) {
		this.placeID = placeID;
	}

	public LocalDate getDate() {
		if (date != null)
			return date;
		else
			return LocalDate.now();
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getAttTypeID() {
		return attTypeID;
	}

	public void setAttTypeID(String attTypeID) {
		this.attTypeID = attTypeID;
	}

}

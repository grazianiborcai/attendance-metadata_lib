package br.com.mind5.helper;

import java.time.LocalDate;
import java.util.ArrayList;

public class Enrollment {

	private Long classID;
	private Long placeID;
	private Integer enrTypeID;
	private LocalDate beginDate;
	private LocalDate endDate;
	private ArrayList<People> people = new ArrayList<People>();

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

	public Integer getEnrTypeID() {
		return enrTypeID;
	}

	public void setEnrTypeID(Integer enrTypeID) {
		this.enrTypeID = enrTypeID;
	}

	public LocalDate getBeginDate() {
		if (beginDate != null)
			return beginDate;
		else
			return LocalDate.now();
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public ArrayList<People> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<People> people) {
		this.people = people;
	}

}

package br.com.mind5.helper;

import java.time.LocalDate;

public class Enrollment {

	private Long classID;
	private Long placeID;
	private People people;
	private EnrollmentType enrType;
	private LocalDate beginDate;
	private LocalDate endDate;

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

	public People getPeople() {
		if (people != null)
			return people;
		else
			return new People();
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public EnrollmentType getEnrType() {
		if (enrType != null)
			return enrType;
		else
			return new EnrollmentType();
	}

	public void setEnrType(EnrollmentType enrType) {
		this.enrType = enrType;
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
		if (endDate != null)
			return endDate;
		else
			return LocalDate.now();
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}

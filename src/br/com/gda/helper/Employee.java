package br.com.gda.helper;

import java.time.LocalTime;

public class Employee extends Person {

	private Long codOwner;
	private Integer codEmployee;
	private Byte codPosition;
	private String recordMode;
	private LocalTime beginTime;
	private LocalTime endTime;

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public Integer getCodEmployee() {
		return codEmployee;
	}

	public void setCodEmployee(Integer codEmployee) {
		this.codEmployee = codEmployee;
	}

	public Byte getCodPosition() {
		return codPosition;
	}

	public void setCodPosition(Byte codPosition) {
		this.codPosition = codPosition;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public LocalTime getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(LocalTime beginTime) {
		this.beginTime = beginTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

}

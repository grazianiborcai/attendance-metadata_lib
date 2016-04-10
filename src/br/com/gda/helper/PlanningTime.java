package br.com.gda.helper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PlanningTime {

	private Long codOwner;
	private Integer codStore;
	private Integer codEmployee;
	private LocalDate beginDate;
	private LocalTime beginTime;
	private LocalTime endTime;
	private Integer group;
	private Integer weekday;
	private Integer codMaterial;
	private String recordMode;
	private BigDecimal priceStore;
	private String codCurrStore;
	private LocalDateTime reservedTo;
	private Long codCustomer;
	private Long number;
	private Integer part;
	private Integer rate;
	private String reservedNum;
	
	public PlanningTime() {
		
	}
	
	public PlanningTime(PlanningTime planningTime) {
		this.setCodOwner(planningTime.getCodOwner());
		this.setCodStore(planningTime.getCodStore());
		this.setCodEmployee(planningTime.getCodEmployee());
		this.setBeginDate(planningTime.getBeginDate());
		this.setBeginTime(planningTime.getBeginTime());
		this.setEndTime(planningTime.getEndTime());
		this.setGroup(planningTime.getGroup());
		this.setWeekday(planningTime.getWeekday());
		this.setCodMaterial(planningTime.getCodMaterial());
		this.setRecordMode(planningTime.getRecordMode());
		this.setPriceStore(planningTime.getPriceStore());
		this.setCodCurrStore(planningTime.getCodCurrStore());
		this.setReservedTo(planningTime.getReservedTo());
		this.setCodCustomer(planningTime.getCodCustomer());
		this.setNumber(planningTime.getNumber());
		this.setPart(planningTime.getPart());
		this.setRate(planningTime.getRate());
	}

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public Integer getCodStore() {
		return codStore;
	}

	public void setCodStore(Integer codStore) {
		this.codStore = codStore;
	}

	public Integer getCodEmployee() {
		return codEmployee;
	}

	public void setCodEmployee(Integer codEmployee) {
		this.codEmployee = codEmployee;
	}

	public LocalDate getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(LocalDate beginDate) {
		this.beginDate = beginDate;
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

	public Integer getGroup() {
		return group;
	}

	public void setGroup(Integer group) {
		this.group = group;
	}

	public Integer getWeekday() {
		return weekday;
	}

	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
	}

	public Integer getCodMaterial() {
		return codMaterial;
	}

	public void setCodMaterial(Integer codMaterial) {
		this.codMaterial = codMaterial;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public BigDecimal getPriceStore() {
		return priceStore;
	}

	public void setPriceStore(BigDecimal priceStore) {
		this.priceStore = priceStore;
	}

	public String getCodCurrStore() {
		return codCurrStore;
	}

	public void setCodCurrStore(String codCurrStore) {
		this.codCurrStore = codCurrStore;
	}

	public LocalDateTime getReservedTo() {
		return reservedTo;
	}

	public void setReservedTo(LocalDateTime reservedTo) {
		this.reservedTo = reservedTo;
	}

	public Long getCodCustomer() {
		return codCustomer;
	}

	public void setCodCustomer(Long codCustomer) {
		this.codCustomer = codCustomer;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Integer getPart() {
		return part;
	}

	public void setPart(Integer part) {
		this.part = part;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getReservedNum() {
		return reservedNum;
	}

	public void setReservedNum(String reservedNum) {
		this.reservedNum = reservedNum;
	}

}

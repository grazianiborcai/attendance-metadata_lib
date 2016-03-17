package br.com.gda.helper;

import java.time.LocalDateTime;

public class Reserve {

	private Long number;
	private Long codOwner;
	private Integer codStore;
	private Long codCustomer;
	private String payId;
	private LocalDateTime reservedTime;
	private Long reservedNum;

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
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

	public Long getCodCustomer() {
		return codCustomer;
	}

	public void setCodCustomer(Long codCustomer) {
		this.codCustomer = codCustomer;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public LocalDateTime getReservedTime() {
		return reservedTime;
	}

	public void setReservedTime(LocalDateTime reservedTime) {
		this.reservedTime = reservedTime;
	}

	public Long getReservedNum() {
		return reservedNum;
	}

	public void setReservedNum(Long reservedNum) {
		this.reservedNum = reservedNum;
	}

}

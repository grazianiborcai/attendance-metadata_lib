package br.com.gda.helper;

public class Customer extends Person {

	private Long codCustomer;
	private String recordMode;
	private String codPayment;

	public Long getCodCustomer() {
		return codCustomer;
	}

	public void setCodCustomer(Long codCustomer) {
		this.codCustomer = codCustomer;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public String getCodPayment() {
		return codPayment;
	}

	public void setCodPayment(String codPayment) {
		this.codPayment = codPayment;
	}

}

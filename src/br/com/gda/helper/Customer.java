package br.com.gda.helper;

public class Customer extends Person {

	private Long codCustomer;
	private String recordMode;

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

}

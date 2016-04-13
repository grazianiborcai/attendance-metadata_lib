package br.com.gda.helper;

import moip.sdk.api.CreditCard;

public class CreditCardAG extends CreditCard {

	private Long codCustomer;
	private String last4;
	private String brand;

	public Long getCodCustomer() {
		return codCustomer;
	}

	public void setCodCustomer(Long codCustomer) {
		this.codCustomer = codCustomer;
	}

	public String getLast4() {
		return last4;
	}

	public void setLast4(String last4) {
		this.last4 = last4;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isComplete() {
		return getHash() != null && getLast4() != null && getBrand() != null && getHolder() != null
				&& getHolder().getFullname() != null && getHolder().getBirthDate() != null
				&& getHolder().getTaxDocument() != null && getHolder().getTaxDocument().getType() != null
				&& getHolder().getTaxDocument().getNumber() != null;
	}

}

package br.com.gda.helper;

public class CreditCardAG {

	private Long codCard;
	private String hash;
	private String last4;
	private String brand;
	private HolderAG holder;

	public Long getCodCard() {
		return codCard;
	}

	public void setCodCard(Long codCard) {
		this.codCard = codCard;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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

	public HolderAG getHolder() {
		return holder;
	}

	public void setHolder(HolderAG holder) {
		this.holder = holder;
	}

	public boolean isComplete() {
		return hash != null && last4 != null && brand != null && holder != null && holder.getFullname() != null
				&& holder.getBirthdate() != null && holder.getTaxDocument() != null
				&& holder.getTaxDocument().getType() != null && holder.getTaxDocument().getNumber() != null;
	}

}

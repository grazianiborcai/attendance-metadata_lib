package br.com.gda.helper;


public class HolderAG {

	private String fullname;
	private String birthdate;
	private TaxDocumentAG taxDocument;
	
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public TaxDocumentAG getTaxDocument() {
		return taxDocument;
	}
	public void setTaxDocument(TaxDocumentAG taxDocument) {
		this.taxDocument = taxDocument;
	}
	
}

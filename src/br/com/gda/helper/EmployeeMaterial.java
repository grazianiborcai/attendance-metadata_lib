package br.com.gda.helper;

public class EmployeeMaterial extends Employee {

	private Long codOwner;
	private Integer codStore;
	private Integer codEmployee;
	private Long codMaterial;
	private Integer rate;

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

	public Long getCodMaterial() {
		return codMaterial;
	}

	public void setCodMaterial(Long codMaterial) {
		this.codMaterial = codMaterial;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

}

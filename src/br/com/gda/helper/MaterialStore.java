package br.com.gda.helper;

import java.math.BigDecimal;

public class MaterialStore extends Material {

	private Integer codStore;
	private BigDecimal priceStore;
	private Integer durationStore;
	private String codCurrStore;

	public MaterialStore() {
		// TODO Auto-generated constructor stub
	}

	public MaterialStore(Material material) {

		setCodOwner(material.getCodOwner());
		setCodMaterial(material.getCodMaterial());
		setPrice(material.getPrice());
		setCodCategory(material.getCodCategory());
		setCodType(material.getCodType());
		setImage(material.getImage());
		setDuration(material.getDuration());
		setBarCode(material.getBarCode());
		setRecordMode(material.getRecordMode());
		setMaterialText(material.getMaterialText());
		setDetailMat(material.getDetailMat());
		setCodCurr(material.getCodCurr());
	}

	public Integer getCodStore() {
		return codStore;
	}

	public void setCodStore(Integer codStore) {
		this.codStore = codStore;
	}

	public BigDecimal getPriceStore() {
		return priceStore;
	}

	public void setPriceStore(BigDecimal priceStore) {
		this.priceStore = priceStore;
	}

	public Integer getDurationStore() {
		return durationStore;
	}

	public void setDurationStore(Integer durationStore) {
		this.durationStore = durationStore;
	}

	public String getCodCurrStore() {
		return codCurrStore;
	}

	public void setCodCurrStore(String codCurrStore) {
		this.codCurrStore = codCurrStore;
	}

}

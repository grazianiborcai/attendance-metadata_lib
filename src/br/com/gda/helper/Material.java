package br.com.gda.helper;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Material {

	private Long codOwner;
	private Integer codMaterial;
	private BigDecimal price;
	private Integer duration;
	private Integer codCategory;
	private Integer codType;
	private String image;
	private String barCode;
	private String recordMode;
	private String codCurr;
	private ArrayList<MaterialText> materialText = new ArrayList<MaterialText>();
	private ArrayList<MaterialDetail> detailMat = new ArrayList<MaterialDetail>();

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public Integer getCodMaterial() {
		return codMaterial;
	}

	public void setCodMaterial(Integer codMaterial) {
		this.codMaterial = codMaterial;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getCodCategory() {
		return codCategory;
	}

	public void setCodCategory(Integer codCategory) {
		this.codCategory = codCategory;
	}

	public Integer getCodType() {
		return codType;
	}

	public void setCodType(Integer codType) {
		this.codType = codType;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public ArrayList<MaterialText> getMaterialText() {
		return materialText;
	}

	public void setMaterialText(ArrayList<MaterialText> materialText) {
		this.materialText = materialText;
	}

	public ArrayList<MaterialDetail> getDetailMat() {
		return detailMat;
	}

	public void setDetailMat(ArrayList<MaterialDetail> detailMat) {
		this.detailMat = detailMat;
	}

	public String getCodCurr() {
		return codCurr;
	}

	public void setCodCurr(String codCurr) {
		this.codCurr = codCurr;
	}

}

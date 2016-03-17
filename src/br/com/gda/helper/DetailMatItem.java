package br.com.gda.helper;

import java.util.ArrayList;

public class DetailMatItem {

	private Long codOwner;
	private Integer codDetail;
	private Integer codItem;
	private String recordMode;
	private ArrayList<DetailMatItemText> detailItemText = new ArrayList<DetailMatItemText>();

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public Integer getCodDetail() {
		return codDetail;
	}

	public void setCodDetail(Integer codDetail) {
		this.codDetail = codDetail;
	}

	public Integer getCodItem() {
		return codItem;
	}

	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public ArrayList<DetailMatItemText> getDetailItemText() {
		return detailItemText;
	}

	public void setDetailItemText(ArrayList<DetailMatItemText> detailItemText) {
		this.detailItemText = detailItemText;
	}

}

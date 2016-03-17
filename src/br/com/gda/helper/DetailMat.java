package br.com.gda.helper;

import java.util.ArrayList;

public class DetailMat {

	private Long codOwner;
	private Integer codDetail;
	private float quantity;
	private String recordMode;
	private ArrayList<DetailMatText> detailText = new ArrayList<DetailMatText>();
	private ArrayList<DetailMatItem> detailItem = new ArrayList<DetailMatItem>();

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

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public ArrayList<DetailMatItem> getDetailItem() {
		return detailItem;
	}

	public void setDetailItem(ArrayList<DetailMatItem> detailItem) {
		this.detailItem = detailItem;
	}

	public ArrayList<DetailMatText> getDetailText() {
		return detailText;
	}

	public void setDetailText(ArrayList<DetailMatText> detailText) {
		this.detailText = detailText;
	}

}

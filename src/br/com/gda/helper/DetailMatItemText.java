package br.com.gda.helper;

public class DetailMatItemText {

	private Long codOwner;
	private Integer codDetail;
	private Integer codItem;
	private String language;
	private String name;
	private String description;
	private String textLong;
	private String recordMode;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTextLong() {
		return textLong;
	}

	public void setTextLong(String textLong) {
		this.textLong = textLong;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

}

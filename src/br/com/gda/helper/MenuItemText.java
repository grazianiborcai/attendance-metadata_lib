package br.com.gda.helper;

public class MenuItemText {

	private Long codOwner;
	private Integer codMenu;
	private Integer item;
	private String language;
	private String name;
	private String recordMode;

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public Integer getCodMenu() {
		return codMenu;
	}

	public void setCodMenu(Integer codMenu) {
		this.codMenu = codMenu;
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
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

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

}

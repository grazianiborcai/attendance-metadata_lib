package br.com.gda.helper;

import java.util.ArrayList;

public class Menu {

	private Long codOwner;
	private Integer codMenu;
	private String recordMode;
	private ArrayList<MenuText> menuText = new ArrayList<MenuText>();
	private ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();

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

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public ArrayList<MenuText> getMenuText() {
		return menuText;
	}

	public void setMenuText(ArrayList<MenuText> menuText) {
		this.menuText = menuText;
	}

	public ArrayList<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(ArrayList<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}

}

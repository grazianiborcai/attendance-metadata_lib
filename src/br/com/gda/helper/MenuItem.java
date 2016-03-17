package br.com.gda.helper;

import java.util.ArrayList;

public class MenuItem {

	private Long codOwner;
	private Integer codMenu;
	private Integer item;
	private String identifier; // if it is a level (H) or a material (F)
	private Byte level;
	private Integer idFather;
	private Integer firstChild;
	private Integer next;
	private Material material;
	private String recordMode;
	private String icon;
	private ArrayList<MenuItemText> menuItemText = new ArrayList<MenuItemText>();
	private ArrayList<MenuItem> children = new ArrayList<MenuItem>();

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

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
	}

	public Integer getIdFather() {
		return idFather;
	}

	public void setIdFather(Integer idFather) {
		this.idFather = idFather;
	}

	public Integer getFirstChild() {
		return firstChild;
	}

	public void setFirstChild(Integer firstChild) {
		this.firstChild = firstChild;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public Material getMaterial() {
		if (material == null)
			material = new Material();
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public ArrayList<MenuItemText> getMenuItemText() {
		return menuItemText;
	}

	public void setMenuItemText(ArrayList<MenuItemText> menuText) {
		this.menuItemText = menuText;
	}

	public ArrayList<MenuItem> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<MenuItem> child) {
		this.children = child;
	}

}

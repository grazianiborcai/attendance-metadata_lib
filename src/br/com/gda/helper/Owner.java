package br.com.gda.helper;

import java.util.ArrayList;

public class Owner extends Person {

	private Long codOwner;
	private String emailAux;
	private String codCurr;
	private String recordMode;
	private ArrayList<DetailMat> detailMat = new ArrayList<DetailMat>();
	private ArrayList<Material> material = new ArrayList<Material>();
	private ArrayList<Menu> menu = new ArrayList<Menu>();
	private ArrayList<Store> store = new ArrayList<Store>();
	private ArrayList<Employee> employee = new ArrayList<Employee>();

	public Long getCodOwner() {
		return codOwner;
	}

	public void setCodOwner(Long codOwner) {
		this.codOwner = codOwner;
	}

	public String getEmailAux() {
		return emailAux;
	}

	public void setEmailAux(String emailAux) {
		this.emailAux = emailAux;
	}

	public String getCodCurr() {
		return codCurr;
	}

	public void setCodCurr(String codCurr) {
		this.codCurr = codCurr;
	}

	public String getRecordMode() {
		return recordMode;
	}

	public void setRecordMode(String recordMode) {
		this.recordMode = recordMode;
	}

	public ArrayList<DetailMat> getDetailMat() {
		return detailMat;
	}

	public void setDetailMat(ArrayList<DetailMat> detailMat) {
		this.detailMat = detailMat;
	}

	public ArrayList<Material> getMaterial() {
		return material;
	}

	public void setMaterial(ArrayList<Material> material) {
		this.material = material;
	}

	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}

	public ArrayList<Store> getStore() {
		return store;
	}

	public void setStore(ArrayList<Store> store) {
		this.store = store;
	}

	public ArrayList<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<Employee> employee) {
		this.employee = employee;
	}

}

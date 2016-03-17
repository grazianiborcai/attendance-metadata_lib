package br.com.gda.helper;

import java.util.ArrayList;

public class Store {

	private Long codOwner;
	private Integer codStore;
	private String cnpj;
	private String inscEstadual;
	private String inscMunicipal;
	private String razaoSocial;
	private String name;
	private String address1;
	private String address2;
	private Integer postalcode;
	private String city;
	private String country;
	private String state;
	private String phone;
	private String codCurr;
	private String recordMode;
	private ArrayList<MaterialStore> material = new ArrayList<MaterialStore>();
	private ArrayList<StoreEmployee> employee = new ArrayList<StoreEmployee>();

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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Integer getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(Integer postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public ArrayList<MaterialStore> getMaterial() {
		return material;
	}

	public void setMaterial(ArrayList<MaterialStore> material) {
		this.material = material;
	}

	public ArrayList<StoreEmployee> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<StoreEmployee> employee) {
		this.employee = employee;
	}

}

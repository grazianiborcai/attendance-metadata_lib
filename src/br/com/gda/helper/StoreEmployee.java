package br.com.gda.helper;

public class StoreEmployee extends Employee {

	private Integer codStore;
	private Byte codPositionStore;

	public StoreEmployee() {
		super();
	}

	public StoreEmployee(Employee e) {
		super.setCodOwner(e.getCodOwner());
		super.setCodEmployee(e.getCodEmployee());
		super.setCpf(e.getCpf());
		super.setPassword(e.getPassword());
		super.setName(e.getName());
		super.setCodPosition(e.getCodPosition());
		super.setCodGender(e.getCodGender());
		super.setBornDate(e.getBornDate());
		super.setEmail(e.getEmail());
		super.setAddress1(e.getAddress1());
		super.setAddress2(e.getAddress2());
		super.setPostalcode(e.getPostalcode());
		super.setCity(e.getCity());
		super.setCountry(e.getCountry());
		super.setState(e.getState());
		super.setPhone(e.getPhone());
		super.setRecordMode(e.getRecordMode());
		super.setBeginTime(e.getBeginTime());
		super.setEndTime(e.getEndTime());
	}

	public Integer getCodStore() {
		return codStore;
	}

	public void setCodStore(Integer codStore) {
		this.codStore = codStore;
	}

	public Byte getCodPositionStore() {
		return codPositionStore;
	}

	public void setCodPositionStore(Byte codPositionStore) {
		this.codPositionStore = codPositionStore;
	}

}

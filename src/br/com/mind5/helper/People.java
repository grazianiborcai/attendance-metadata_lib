package br.com.mind5.helper;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class People {

	private Long peopleID;
	private String countryID;
	private Region region;
	private Grade grade;
	private String name;
	private LocalDate birthDate;
	private Long enrollmentNumber;
	private LocalDate gradeDate;
	private String email;
	private String celphone;
	private String phone;
	private String address1;
	private String address2;
	private String postalCode;
	private String bloodType;
	private String allergy;
	private String allergyDesc;
	private LocalDate nextGradeExam;
	private Gender gender;
	private HowDiscovered howDiscovered;
	private String whereOther;
	private LookingFor lookingFor;
	private String lookingOther;
	private String password;
	private Integer enrTypeID;
	private String oAuth;
	private LocalDateTime oAuthDate;
	private String userAgent;
	private String regionID;
	private Integer gradeID;
	private String birthDateS;
	private String gradeDateS;
	private String nextGradeExamS;
	private Integer genderID;
	private Integer whereID;
	private Integer lookID;

	public Long getPeopleID() {
		return peopleID;
	}

	public void setPeopleID(Long peopleID) {
		this.peopleID = peopleID;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Grade getGrade() {
		if (grade != null)
			return grade;
		else
			return new Grade();
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		if (birthDate != null)
			return birthDate;
		else
			return LocalDate.now();
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Long getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(Long enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public LocalDate getGradeDate() {
		if (gradeDate != null)
			return gradeDate;
		else
			return LocalDate.now();
	}

	public void setGradeDate(LocalDate gradeDate) {
		this.gradeDate = gradeDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelphone() {
		return celphone;
	}

	public void setCelphone(String celphone) {
		this.celphone = celphone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAllergy() {
		return allergy;
	}

	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}

	public String getAllergyDesc() {
		return allergyDesc;
	}

	public void setAllergyDesc(String allergyDesc) {
		this.allergyDesc = allergyDesc;
	}

	public LocalDate getNextGradeExam() {
		if (nextGradeExam != null)
			return nextGradeExam;
		else
			return LocalDate.now();
	}

	public void setNextGradeExam(LocalDate nextGradeExam) {
		this.nextGradeExam = nextGradeExam;
	}

	public Gender getGender() {
		if (gender != null)
			return gender;
		else
			return new Gender();
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public HowDiscovered getHowDiscovered() {
		if (howDiscovered != null)
			return howDiscovered;
		else
			return new HowDiscovered();
	}

	public void setHowDiscovered(HowDiscovered howDiscovered) {
		this.howDiscovered = howDiscovered;
	}

	public String getWhereOther() {
		return whereOther;
	}

	public void setWhereOther(String whereOther) {
		this.whereOther = whereOther;
	}

	public LookingFor getLookingFor() {
		if (lookingFor != null)
			return lookingFor;
		else
			return new LookingFor();
	}

	public void setLookingFor(LookingFor lookingFor) {
		this.lookingFor = lookingFor;
	}

	public String getLookingOther() {
		return lookingOther;
	}

	public void setLookingOther(String lookingOther) {
		this.lookingOther = lookingOther;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnrTypeID() {
		return enrTypeID;
	}

	public void setEnrTypeID(Integer enrTypeID) {
		this.enrTypeID = enrTypeID;
	}

	public String getoAuth() {
		return oAuth;
	}

	public void setoAuth(String oAuth) {
		this.oAuth = oAuth;
	}

	public LocalDateTime getoAuthDate() {
		return oAuthDate;
	}

	public void setoAuthDate(LocalDateTime oAuthDate) {
		this.oAuthDate = oAuthDate;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public Integer getGradeID() {
		return gradeID;
	}

	public void setGradeID(Integer gradeID) {
		this.gradeID = gradeID;
	}

	public String getBirthDateS() {
		return birthDateS;
	}

	public void setBirthDateS(String birthDateS) {
		this.birthDateS = birthDateS;
	}

	public String getGradeDateS() {
		return gradeDateS;
	}

	public void setGradeDateS(String gradeDateS) {
		this.gradeDateS = gradeDateS;
	}

	public String getNextGradeExamS() {
		return nextGradeExamS;
	}

	public void setNextGradeExamS(String nextGradeExamS) {
		this.nextGradeExamS = nextGradeExamS;
	}

	public Integer getGenderID() {
		return genderID;
	}

	public void setGenderID(Integer genderID) {
		this.genderID = genderID;
	}

	public Integer getWhereID() {
		return whereID;
	}

	public void setWhereID(Integer whereID) {
		this.whereID = whereID;
	}

	public Integer getLookID() {
		return lookID;
	}

	public void setLookID(Integer lookID) {
		this.lookID = lookID;
	}

}

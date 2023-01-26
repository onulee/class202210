package com.site.www.dto;

public class MemberDto {
	
	public MemberDto() {}
	public MemberDto(String id) {
		this.id = id;
	}
	public MemberDto(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public MemberDto(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public MemberDto(String id, String pw, String name, String phone, String gender, String hobby) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}

	private String id,pw,name,phone,gender,hobby;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	

}

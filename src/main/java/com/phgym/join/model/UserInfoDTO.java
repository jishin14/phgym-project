package com.phgym.join.model;

import java.time.LocalDateTime;

public class UserInfoDTO {

	private int userNo; // 회원번호
	private String userId; // 아이디
	private String pw; // 비밀번호
	private String name; // 이름
	private LocalDateTime birth; // 생년월일
	private String gender; // 성별
	private String phone; // 연락처
	private String email; // 이메일
	private String address; // 주소
	private LocalDateTime regDate; // 가입일
	private String profile; // 프로필
	
	public UserInfoDTO() {
		
	}
	
	public UserInfoDTO(int userNo, String userId, String pw, String name, LocalDateTime birth, String gender,
			String phone, String email, String address, LocalDateTime regDate, String profile) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.regDate = regDate;
		this.profile = profile;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public LocalDateTime getBirth() {
		return birth;
	}

	public void setBirth(LocalDateTime birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
}

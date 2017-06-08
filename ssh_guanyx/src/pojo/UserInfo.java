package pojo;

import java.util.Date;

public class UserInfo {

	private Integer UserId;
	private String UserName;
	private String PassWord;
	private String Sex;
	private String PhoneNumber;
	private String Email;
	private String Address;
	private String Authority;
	private Integer UpdateUserId;
	private Date UpdateDatetime;
	private Integer CreateUserId;
	private Date CreateDatetime;
	
	public UserInfo() {
		super();
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getAuthority() {
		return Authority;
	}

	public void setAuthority(String authority) {
		Authority = authority;
	}

	public Integer getUpdateUserId() {
		return UpdateUserId;
	}

	public void setUpdateUserId(Integer updateUserId) {
		UpdateUserId = updateUserId;
	}

	public Date getUpdateDatetime() {
		return UpdateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		UpdateDatetime = updateDatetime;
	}

	public Integer getCreateUserId() {
		return CreateUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		CreateUserId = createUserId;
	}

	public Date getCreateDatetime() {
		return CreateDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		CreateDatetime = createDatetime;
	}
	
	
}

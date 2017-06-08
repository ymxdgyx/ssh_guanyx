package Service;

import java.util.Date;
import java.util.List;

import Dao.UserInfoDao;
import pojo.UserInfo;

public class UserInfoService {

	private UserInfoDao uid;


	public boolean existId(int userId) {
		return uid.existId(userId);
		
	}

	public boolean existUser(int userId, String userPassword) {
		
		return uid.existUser(userId, userPassword);
	}

	public UserInfoDao getUid() {
		return uid;
	}

	public void setUid(UserInfoDao uid) {
		this.uid = uid;
	}

//	public void addUserInfo(String userName, String passWord, String sex, String phoneNumber, String email, String address,
//			String authority, Integer createUserId) {
//		System.out.println("reservice");
//		
//		uid.addUserInfo(userName,passWord,sex,phoneNumber,email,address,authority,createUserId,new Date());	
//	}

	public void addUserInfo(UserInfo ui) {
		ui.setCreateDatetime(new Date());
		uid.addUserInfo(ui);
	}
	
	public List<UserInfo> getallUserInfo() {
		return uid.getallUserInfo();
		
		
	}

	public void deleteUserInfo(Integer userInfoId) {
		List<UserInfo> list = uid.getoneUserInfo(userInfoId);
		uid.deleteUserInfo(list.get(0));
		return;
	}


	public List<UserInfo> updateUserInfo1(Integer UserInfoId) {
		return uid.getoneUserInfo(UserInfoId);
	}

	public void updateUserInfo2(UserInfo ui) {
		uid.updateUserInfo(ui);
		
	}



}

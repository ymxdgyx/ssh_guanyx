package Dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import pojo.UserInfo;

public class UserInfoDao extends HibernateDaoSupport{



	public boolean existId(int userId) {
		String hql = "select UserId from UserInfo where UserId=?";
		List<?> list = getHibernateTemplate().find(hql,userId);
		if(list.size()==0){
			return false;
		}
		else{
			return true;
		}
	}

//	public void addUserInfo(String userName, String passWord, String sex, String phoneNumber, String email, String address,
//			String authority, Integer createUserId, Date date) {
//		System.out.println("redao");
//		UserInfo ui = new UserInfo();
//		ui.setUserName(userName);
//		ui.setPassWord(passWord);
//		ui.setSex(sex);
//		ui.setPhoneNumber(phoneNumber);
//		ui.setEmail(email);
//		ui.setAddress(address);
//		ui.setAuthority(authority);
//		ui.setCreateUserId(createUserId);
//		ui.setCreateDatetime(date);
//		getHibernateTemplate().save(ui);
//		
//	}

	public void addUserInfo(UserInfo ui) {
		getHibernateTemplate().save(ui);
		
	}
	
	public boolean existUser(int userId, String userPassword) {
		String hql = "select UserId from UserInfo where UserId=? and PassWord=?" ;
		List<?> list = getHibernateTemplate().find(hql,userId,userPassword);
		if(list.size()==0){
			return false;
		}
		else{
			return true;
		}
	}

	public List<UserInfo> getallUserInfo() {
		String hql = "from UserInfo" ;
		List<UserInfo> list = (List<UserInfo>) getHibernateTemplate().find(hql);
		return list;
	}

	public void deleteUserInfo(UserInfo ui) {
		getHibernateTemplate().delete(ui);;
		
	}

	public List<UserInfo> getoneUserInfo(Integer userInfoId) {
		String hql = "from UserInfo where UserId=?" ;
		List<UserInfo> list = (List<UserInfo>) getHibernateTemplate().find(hql,userInfoId);
		return list;
	}

	public void updateUserInfo(UserInfo ui) {
		getHibernateTemplate().update(ui);
		
	}



}

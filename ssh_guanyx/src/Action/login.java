package Action;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Service.UserInfoService;
import pojo.UserInfo;

public class login extends ActionSupport{

	private int UserId;
	private String UserPassword;

	
	private UserInfoService uis;
	
	
	public String login(){
		ActionContext ac = ActionContext.getContext();
		Map sessionMap = ac.getSession();
		sessionMap.put("UserId", UserId);
		return SUCCESS;
		
	}
	public void validateLogin(){
		if(UserId==0){
			this.addFieldError("E000001", "用户ID为空");
		}else if(UserPassword.equals("")){
			this.addFieldError("E000001", "密码为空");
		}else if(!(uis.existId(UserId))){
			this.addFieldError("E000002", "用户不存在！");
		}else if(!(uis.existUser(UserId, UserPassword))){
			this.addFieldError("E000003", "用户密码不正确！");
		}
		
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public UserInfoService getUis() {
		return uis;
	}
	public void setUis(UserInfoService uis) {
		this.uis = uis;
	}
	
}

package Action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import Service.UserInfoService;
import pojo.UserInfo;

public class userInfo extends ActionSupport {

	private List<UserInfo> ulist;
	private UserInfoService uis;
	private Integer UserInfoId;
	private UserInfo ui;
	private InputStream excelStream;
	
	public String allUserInfo() {
		ulist = uis.getallUserInfo();
		return SUCCESS;
	}

	public String updateUserInfo1() {
		ulist = uis.updateUserInfo1(UserInfoId);
		return "update1";
	}

	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}

	public String updateUserInfo2() {
		uis.updateUserInfo2(ui);
		return "update2";
	}

	public String delectUserInfo() {

		uis.deleteUserInfo(UserInfoId);
		return "delectUserInfo";
	}

	public String registerUserInfo() {
		ActionContext ac = ActionContext.getContext();
		Map sessionMap = ac.getSession();
		Integer createUserId = (Integer) sessionMap.get("UserId");
		ui.setCreateUserId(createUserId);
		uis.addUserInfo(ui);
		return "registerUserInfo";
	}

	public String daochu() {
		System.out.println("daochu");
		List<UserInfo> list = uis.getallUserInfo();
		StringBuffer excelBuf = new StringBuffer();
		excelBuf.append("ID").append("\t").append("用户名").append("\t").append("密码").append("\t").append("性别")
				.append("\t").append("手机号").append("\t").append("邮箱").append("\t").append("地址").append("\t")
				.append("权限").append("\n");
		for (UserInfo u : list) {
			if (u.getSex().equals("1")) {
				u.setSex("男");
			} else if (u.getSex().equals("2")) {
				u.setSex("女");
			}
			if (u.getAuthority().equals("11")) {
				u.setAuthority("担当");
			} else if (u.getAuthority().equals("12")) {
				u.setAuthority("管理员");
			}
			excelBuf.append(u.getUserId()).append("\t").append(u.getUserName()).append("\t").append(u.getPassWord())
					.append("\t").append(u.getSex()).append("\t").append(u.getPhoneNumber()).append("\t")
					.append(u.getEmail()).append("\t").append(u.getAddress()).append("\t").append(u.getAuthority()).append("\n");
		}

		String excelString = excelBuf.toString();
		excelStream = new ByteArrayInputStream(excelString.getBytes(), 0, excelString.getBytes().length);
		System.out.println(excelString);
		System.out.println("11111111111");
		System.out.println(excelStream);
		return "excel";

	}

	public List<UserInfo> getUlist() {
		return ulist;
	}

	public void setUlist(List<UserInfo> ulist) {
		this.ulist = ulist;
	}

	public UserInfoService getUis() {
		return uis;
	}

	public void setUis(UserInfoService uis) {
		this.uis = uis;
	}

	public Integer getUserInfoId() {
		return UserInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		UserInfoId = userInfoId;
	}

	public UserInfo getUi() {
		return ui;
	}

	public void setUi(UserInfo ui) {
		this.ui = ui;
	}

}

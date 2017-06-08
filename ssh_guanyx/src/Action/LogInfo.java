package Action;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import Service.LogInfoService;

public class LogInfo extends ActionSupport{
	
	private Integer year;
	private Integer month;
	
	private List<String> list;
	private List<pojo.LogInfo> UserInfolist;
	
	private LogInfoService lis;
	
	public String year(){
		list = lis.distinctyear();
		return SUCCESS;
	}

	public String month(){
		list = lis.distinctmonth();
		return SUCCESS;
	}
	
	public String monthajax() throws ParseException{
		list = lis.monthajax(year);
		return SUCCESS;
	}
	
	public String selectLogInfo() throws ParseException{
		UserInfolist = lis.selectLogInfo(year, month);
		return "a";
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}


	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}



	public List<pojo.LogInfo> getUserInfolist() {
		return UserInfolist;
	}

	public void setUserInfolist(List<pojo.LogInfo> userInfolist) {
		UserInfolist = userInfolist;
	}

	public LogInfoService getLis() {
		return lis;
	}

	public void setLis(LogInfoService lis) {
		this.lis = lis;
	}
	
	
}

package Log;

import java.util.Date;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import Service.LogInfoService;

public class Log {

	private LogInfoService lis;
	//往数据库插入数据
	public void add(){
		ActionContext ac = ActionContext.getContext();
		Map mapsession = ac.getSession();
		System.out.println(mapsession.get("UserId"));
		Integer createUserId = (Integer) mapsession.get("UserId");
		lis.addLogInfoadd("add", "增加用户", createUserId, new Date());
		System.out.println("adduser");
	}
	public void delete(){
		ActionContext ac = ActionContext.getContext();
		Map mapsession = ac.getSession();
		Integer createUserId = (Integer) mapsession.get("UserId");
		lis.addLogInfoupdate("delete", "删除用户", createUserId, new Date()); //暂时未createUserId
	}
	public void update(){
		ActionContext ac = ActionContext.getContext();
		Map mapsession = ac.getSession();
		Integer createUserId = (Integer) mapsession.get("UserId");
		lis.addLogInfoupdate("update", "更新用户", createUserId, new Date());//暂时未createUserId
	}
	public LogInfoService getLis() {
		return lis;
	}
	public void setLis(LogInfoService lis) {
		this.lis = lis;
	}
	
}

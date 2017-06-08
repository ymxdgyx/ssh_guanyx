package pojo;

import java.util.Date;

public class LogInfo {

	private Integer LogId;
	private String FunctionId;
	private String LogCommant;
	private Integer UpdateUserId;
	private Date UpdateDatetime;
	private Integer CreateUserId;
	private Date CreateDatetime;
	public LogInfo() {
		super();
	}
	public Integer getLogId() {
		return LogId;
	}
	public void setLogId(Integer logId) {
		LogId = logId;
	}
	public String getFunctionId() {
		return FunctionId;
	}
	public void setFunctionId(String functionId) {
		FunctionId = functionId;
	}
	public String getLogCommant() {
		return LogCommant;
	}
	public void setLogCommant(String logCommant) {
		LogCommant = logCommant;
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

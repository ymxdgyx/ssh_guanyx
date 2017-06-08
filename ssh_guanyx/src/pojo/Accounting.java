package pojo;

import java.util.Date;

public class Accounting {

	private Integer Year;
	private Date StartYearMonth;
	private Date EndYearMonth;
	private Integer UpdateUserId;
	private Date UpdateDatetime;
	private Integer CreateUserId;
	private Date CreateDatetime;
	public Accounting() {
		super();
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public Date getStartYearMonth() {
		return StartYearMonth;
	}
	public void setStartYearMonth(Date startYearMonth) {
		StartYearMonth = startYearMonth;
	}
	public Date getEndYearMonth() {
		return EndYearMonth;
	}
	public void setEndYearMonth(Date endYearMonth) {
		EndYearMonth = endYearMonth;
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

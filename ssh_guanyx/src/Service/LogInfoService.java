package Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Dao.LogInfoDao;
import pojo.LogInfo;

public class LogInfoService {

	private LogInfoDao lid;

	public LogInfoDao getLid() {
		return lid;
	}

	public void setLid(LogInfoDao lid) {
		this.lid = lid;
	}
	
	public void addLogInfoadd(String FunctionId, String LogCommant, Integer CreateUserId, Date CreateDatetime) {
		System.out.println("addservice");
		lid.LogInfoaddadd(FunctionId, LogCommant, CreateUserId, CreateDatetime);
		
	}

	public void addLogInfoupdate(String FunctionId, String LogCommant, Integer updataUserId, Date date) {
		lid.LogInfoaddupdate(FunctionId, LogCommant, updataUserId, date);
		
	}

	public List<String> distinctyear() {
		
		List<Date> list = lid.CreateDatetime();
		List<String> listy = new ArrayList<>();
		System.out.println(list.size());
		SimpleDateFormat sfy = new SimpleDateFormat("yyyy");
		for(Date l : list){			
//			System.out.println(l.getYear());
				String ss = sfy.format(l);
				if(!listy.contains(ss)) {
					listy.add(ss);
				}
		}
		return listy;
	}

	public List<String> distinctmonth() {
		List<Date> list = lid.CreateDatetime();
		List<String> listm = new ArrayList<>();
		SimpleDateFormat sfm = new SimpleDateFormat("MM");
		for(Date l : list){			
//			System.out.println(l.getYear());
				String ss = sfm.format(l);
				if(!listm.contains(ss)) {
					listm.add(ss);
				}
		}
		return listm;
	}

	
	
	public List<LogInfo> selectLogInfo(Integer year, Integer month) throws ParseException {
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate1 = year.toString() + "-" + month.toString() + "-" + "1 00:00:00";
		String strDate2 = year.toString() + "-" + month.toString() + "-" + "31 23:59:59";
		System.out.println(strDate1);
		System.out.println(strDate2);
		//hql里面的日期参数是date类型的
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟  
		Date date1=sdf.parse(strDate1);
		Date date2=sdf.parse(strDate2);
		return lid.selectLogInfo(date1, date2);
	}

	public List<String> monthajax(Integer year) throws ParseException {
		String strDate1 = year.toString() + "-1-1 00:00:00";
		String strDate2 = year.toString() + "-12-31 23:59:59";
		System.out.println(strDate1);
		System.out.println(strDate2);
		//hql里面的日期参数是date类型的
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟  
		Date date1=sdf.parse(strDate1);
		Date date2=sdf.parse(strDate2);
		List<LogInfo> list = lid.selectLogInfo(date1, date2);
		List<String> listm = new ArrayList<>();
		SimpleDateFormat sfm = new SimpleDateFormat("MM");
		for(LogInfo l : list){			
				Date d = l.getCreateDatetime();
				String ss = sfm.format(d);
				if(!listm.contains(ss)) {
					listm.add(ss);
				}
		}
		return listm;
	}
	
}

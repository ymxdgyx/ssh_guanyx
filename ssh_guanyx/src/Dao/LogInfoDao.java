package Dao;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import pojo.LogInfo;

public class LogInfoDao extends HibernateDaoSupport{

	public void LogInfoaddadd(String functionId, String logCommant, Integer createUserId, Date createDatetime) {
		LogInfo li = new LogInfo();
		li.setFunctionId(functionId);
		li.setLogCommant(logCommant);
		li.setCreateUserId(createUserId);
		li.setCreateDatetime(createDatetime);
		getHibernateTemplate().save(li);
		
	}

	public void LogInfoaddupdate(String functionId, String logCommant, Integer createUserId, Date date) {
		LogInfo li = new LogInfo();
		li.setFunctionId(functionId);
		li.setLogCommant(logCommant);
		li.setCreateUserId(createUserId);
		li.setCreateDatetime(date);
		getHibernateTemplate().save(li);
	}

	public List CreateDatetime() {
		
		String hql = "select CreateDatetime from LogInfo";
		List<Date> list = (List<Date>) getHibernateTemplate().find(hql);
		return list;
	}

	
	public List<LogInfo> selectLogInfo(Date date1, Date date2) {
//		String hql = "from LogInfo where CreateDatetime between  to_date(?,'yyyy-MM-dd hh24:mm:ss') and  to_date(?,'yyyy-MM-dd hh24:mm:ss')";
		String hql = "from LogInfo where CreateDatetime between  ? and ?";
//		String hql = "from LogInfo where CreateDatetime between  to_date('2007-9-7 00:00:00','yyyy-mm-dd hh24:mi:ss') and  to_date('2017-09-07 00:00:00','yyyy-mm-dd hh24:mi:ss') or UpdateDatetime between  to_date('2007-9-7 00:00:00','yyyy-mm-dd hh24:mi:ss') and  to_date('2017-09-07 00:00:00','yyyy-mm-dd hh24:mi:ss')";
		List<LogInfo> list = (List<LogInfo>) getHibernateTemplate().find(hql,date1 ,date2);
//		List<LogInfo> list = (List<LogInfo>) getHibernateTemplate().find(hql);
		return list;
	}



}

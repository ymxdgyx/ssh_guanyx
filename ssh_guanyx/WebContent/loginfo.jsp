<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script language="javascript" for="window" event="onload">   
    function year() {       
        $.ajax({  
            type:"post",  
            url:"LogInfo_year",  
            dataType:"json",  
            async:false, 
            success:function(data){
                for(var i=0;i<data.length;i++){  
                    $(".year").append("<option value="+data[i]+">"+data[i]+"</option>");  
                }   
            }  
        });  
    };  
    function month() {       
        $.ajax({  
            type:"post",  
            url:"LogInfo_month",  
            dataType:"json",  
            async:false, 
            success:function(data){
                for(var i=0;i<data.length;i++){  
                    $(".month").append("<option value="+data[i]+">"+data[i]+"</option>");  
                }   
            }  
        });  
    };  
    if(document.readyState=="complete"){  
        year();
        month();
    }  

    $(".year").change(function(){ 
 	   var year=$(".year").val();
            $(".month option").remove();  
            $(".month").append("<option value=0>==请选择==</option>");
        $.ajax({  
            type:"get",  
            url:"LogInfo_monthajax?year="+year,
            dataType:"json",  
            async:false,  
            success:function(data){
                for(var i=0;i<data.length;i++){  
                    $(".month").append("<option value="+data[i]+">"+data[i]+"</option>");  
                }   
            }  
        });   
    });
</script>


 
<body>
<ul>
		<li><a href="userInfo_allUserInfo.action">用户管理</a></li>
		<li><a href="loginfo.jsp">年度</a></li>
		<li><a href="loginfo.jsp">日志管理</a></li>
</ul>
<%-- <s:url action="LogInfo_selectLogInfo.action"><s:param name="year" value="#sd.year"/></s:url> --%>
<form action="LogInfo_selectLogInfo?year=year&month=month" method="get">
年月:<select name="year" class="year">
		<option value="0">==请选择==</option> 
	</select>
	<select name="month" class="month">
		<option value="0">==请选择==</option>
	</select>
	<input type="submit" value="搜索">
</form>	
<table border="1">
<tr>
<th>时间</th>
<th>方法名</th>
<th>方法解释</th>
</tr>
<s:iterator value="UserInfolist" status="stat" id="sd">
			<tr>
				<td><s:property value="#sd.CreateDatetime" /></td>
				<td><s:property value="#sd.FunctionId" /></td>
				<td><s:property value="#sd.LogCommant" /></td>
			</tr>
</s:iterator>

</table>
<s:debug></s:debug>
</body>

</html>
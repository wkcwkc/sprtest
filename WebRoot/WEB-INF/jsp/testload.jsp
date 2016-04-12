<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>testload</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my testload page. <br>
    
    <form action="mtcontrl/create" method="post">
    <input type="text" name="str1">
    <input type="text" name="dd1">
    <input type="submit" value="up">
    
    </form>
    
    <br>
    <form action="mtcontrl" method="post">
    <input type="submit" name="paraname1" value="up1">  
    </form>
    
    <br>
    <form action="mtcontrl" method="post">
    <input type="submit" name="action" value="paravalue">  
    </form>
    
    
  </body>
</html>

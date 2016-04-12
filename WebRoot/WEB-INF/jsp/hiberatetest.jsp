<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>hiberatetest</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/test_css.css" />
<script type="text/javascript" src="js/jquery/jquery.min.js"></script>
<script type="text/javascript">

	function ajaxquery() {
		var qdata = {
			"id" : $("#id").val()
		};
		$.ajax({
			data : JSON.stringify(qdata),
			type : "POST",
			dataType : 'json',
			contentType : "application/json",
			url : "querydata",
			error : function(data) {

			},
			success : function(data) {
				document.getElementById("tdid").innerHTML = data.id;
				document.getElementById("tdname").innerHTML = data.name;
				document.getElementById("tdhoby").innerHTML = data.hoby;
				document.getElementById("tdcolor").innerHTML = data.color;
				document.getElementById("tdage").innerHTML = data.age;
			}
		});
	}

	function ajaxinsert() {
		var insertdata = {
			"id" : 0,
			"name" : $("#inname").val(),
			"hoby" : $("#inhoby").val(),
			"color" : $("#incolor").val(),
			"age" : $("#inage").val()
		};

		$.ajax({
			data : JSON.stringify(insertdata),
			type : "POST",
			dataType : 'json',
			url : "insertdata",
			contentType : "application/json",
			error : function(data) {

			},
			success : function(data) {
				document.getElementById("tdid").innerHTML = data.id;
				document.getElementById("tdname").innerHTML = data.name;
				document.getElementById("tdhoby").innerHTML = data.hoby;
				document.getElementById("tdcolor").innerHTML = data.color;
				document.getElementById("tdage").innerHTML = data.age;

			}
		});
	}
</script>

</head>

<body>
	${_PATH}
	<input type="button" value="" id="testbt">
	<h2>insert your data.</h2>
	</br>
	<table bordercolor="10" frame="border" rules="all" cellpadding="10">
		<tr>
			<td>name</td>
			<td>hoby</td>
			<td>color</td>
			<td>age</td>
		</tr>

		<tr>
			<td><input type="text" id="inname" name="inname" /></td>
			<td><input type="text" id="inhoby" name="inhoby" /></td>
			<td><input type="text" id="incolor" name="incolor" /></td>
			<td><input type="text" id="inage" name="inage" /></td>

		</tr>
	</table>
	<br />
	<input type="button" id="insert" value="OK" onclick="ajaxinsert();">
	<br />
	<br />
	<br />



	<h2>please input query id.</h2>
	<input type="text" id="id" name="id" />
	<input id="bt" type="button" value="OK" onclick="ajaxquery();" />
	<br />
	<h2>show the result:</h2>
	<table bordercolor="10" frame="border" rules="all" cellpadding="20">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>hoby</td>
			<td>color</td>
			<td>age</td>
		</tr>

		<tr>
			<td><div id="tdid"></div></td>
			<td><div id="tdname"></div></td>
			<td><div id="tdhoby"></div></td>
			<td><div id="tdcolor"></div></td>
			<td><div id="tdage"></div></td>

		</tr>
	</table>

</body>

</html>

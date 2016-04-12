<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="sprtest" prefix="taglib"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
${mes}

<form action="hello/file" method="post" enctype="multipart/form-data">

<input type="file" id="myfile" name="myfile">
<input type="submit" value="upload">

</form>

<taglib:page text="it's my tag."/>
</body>
</html>
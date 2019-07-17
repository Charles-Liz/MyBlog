<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.7.2/jquery.js"></script>
<script type="text/javascript">
$(function(){
  $("a").click(function(){
    $("img").attr("src","validate?date="+new Date());
    return false;
  })
})
</script>
</head>
<body>
<form action="login" method="post">
<input type="text" name="username"><br>
<input type="password" name="password"><br>
<input type="text" name="code" size="1"><img src="validate"><a href="">can not see</a><br>
<input type="submit" value="login">
<input type="reset" value="reset">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>
<h3>Hi ${userName}</h3>
    <form action="bmi" method="post">
        <label>Height: </label>
        <input type="text" name="height"><br>

        <label>Weight: </label>
        <input type="text" name="weight"></br>

        <input type="submit" value="Get BMI">
    </form>
</body>
</html>
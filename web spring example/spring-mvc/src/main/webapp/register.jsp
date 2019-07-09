<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="register.lti" enctype="multipart/form-data">
Enter your name: <input type="text" name="name" /> <br/>
Enter your Age: <input type="number" name="age" /> <br/>
Enter your EmailAddresss: <input type="email" name="email" /> <br/>
Enter your City: <input type="text" name="city" /> <br/>
Upload your profile pic : <input type = "file" name = "profilepic"/><br/>
<button type="submit">Register</button>
<h1>${message}</h1>
</form>
</body>
</html>
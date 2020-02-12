<!DOCTYPE html>
<html>

<head>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">

<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"
	type="text/javascript"></script>

</head>

<body>

	<h2>Spring MVC Demo - Home Page</h2>

	<a href="hello/showForm">Hello World</a>
	<br>
	<br>
	<a href="student/showForm">Student Form</a>
	<br>
	<br>
	<a href="customer/showForm">Customer form</a>
	<br>
	<br>

	<img
		src="${pageContext.request.contextPath}/resources/images/image.png"
		alt="" />

	<br>
	<br>

	<input type="button" onclick="doSomeWork()" value="Click Me" />

</body>

</html>
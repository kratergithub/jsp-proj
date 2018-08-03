<html>
<head>
<title>JSP Test - Simple Data</title>
<style><%@include file="/WEB-INF/css/simpleData.css"%></style>
</head>
<body>
	<div id="title"> --- DATA --- </div>
	<br>
	<div id=result1 class="result"> User: ${result.firstUser} <br> Place: ${result.firstPlace}</div>
	<br>
	<div id=result2 class="result"> Random user: ${result.randomUser} </div>
</body>
</html>

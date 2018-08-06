<html>
<head>
<title>JSP Test - Calculator</title>
<style><%@include file="/WEB-INF/css/calculator.css"%></style>
</head>
<body>
	<div id="title"> --- CALCULATOR --- </div>
	<br>
	 <form action="#" method="post">
	   <div> <label for="op1"> Operator 1: </label> <input type="text" id="op1" name="op1" value="${operationDataAndResult.op1}"></div><br>
	   <div> <label for="op2"> Operator 2: </label> <input type="text" id="op2" name="op2" value="${operationDataAndResult.op2}"></div><br>
	   <div id="divRadio">
	   		<input type="radio" name="operation" value="addition" checked> Add <br>
	   		<input type="radio" name="operation" value="multiplication"> Multiply <br>
	   </div>
	   <br>
	   <button type="submit" id="btnCalc"> Calculate </button>
	 </form>
	 <div id=result class="result"> Result: ${operationDataAndResult.operationResult} </div>
</body>
</html>

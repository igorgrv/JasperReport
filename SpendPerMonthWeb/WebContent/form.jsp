<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body>

<form action="transactions" method="POST">
	<h1>Report</h1>
	Start Date: <input type="text" name="start_date"> <br/>
	End Date: <input type="text" name="end_date"> <br/><br/>
	
	Search by the transaction type: <br>
    <input type="radio" name="type" value="ENTRADA" checked="checked">Cash in
    <input type="radio" name="type" value="SAIDA">Cash out<br>

    <br>
	<input type="submit" value="Generate your report!" />

</form>
</body>
</html>
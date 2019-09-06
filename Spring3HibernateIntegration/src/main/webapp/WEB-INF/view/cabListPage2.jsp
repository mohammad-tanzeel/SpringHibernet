<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h3>Cabs</h3>
<c:if  test="${!empty cabList}">
<table class="data">
<tr>
    <th>Driver Name</th>
    <th>Cab Number</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${cabList}" var="cb">
    <tr>
        <td>${cb.drivername} </td>
        <td>${cb.cabnumber}</td>
        <td><a href="delete/${cb.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
</body>
</html>
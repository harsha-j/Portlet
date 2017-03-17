<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<table border ="3">
    <tr>
        <th>Name</th>
        <th>Cost</th>
    </tr>
    <c:forEach items = "${mobiles}" var = "mobile">
        <tr>
            <td>${mobile.name}</td>
            <td>${mobile.cost}</td>
        </tr>
    </c:forEach>
</table>
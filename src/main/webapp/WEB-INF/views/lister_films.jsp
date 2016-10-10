<%-- 
    Document   : genre_titre
    Created on : 10 oct. 2016, 11:36:46
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>*{genre}</h1>
        <c:forEach items="${mesgenres}" var="mongenre">
            
        </c:forEach>
    </body>
</html>

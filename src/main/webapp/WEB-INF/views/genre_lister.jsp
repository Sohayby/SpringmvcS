<%-- 
    Document   : genre_lister
    Created on : 10 oct. 2016, 11:01:45
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
        <h1>liste genres</h1>
        <a href="<spr"
        <c:forEach items="${genres}" var="monGenre"> 
            ${monGenre.nom}

            <a href="supprimer_genre/${monGenre.id}">Supprimer</a>
            <a href="modifier_genre/${monGenre.id}">Editer</a>
             <a href="ajouter_genre/${monGenre.id}">Ajouter</a>

            <br>
        </c:forEach>
    </body>
</html>

<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="br.com.estudandoemcasa.gerenciador.entity.*"%>
<%@page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/FormNewCompany.jsp" var="linkNewComp" />
<c:url value="/list-company" var="linkListComp" />
<c:url value="/" var="home" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>List Company on Bank</title>
</head>
<body>

	<div class="container"
		style="text-align: center; padding: 10% 20% 10% 20%;">
		<div style="border: 1px solid gray; border-radius: 5px;">

			<b>Companys on Bank</b>
			<hr>

			<ul>
				<c:forEach items="${companys}" var="comp">
					<li>${comp.getId()}: ${comp.name}</li>
				</c:forEach>
			</ul>

			<a type="button" class="btn btn-secondary"
				href="${linkNewComp}">Create a New Company</a> <a
				href="${home}" type="button" class="btn btn-secondary">Home</a>
			<hr>
		</div>
	</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>
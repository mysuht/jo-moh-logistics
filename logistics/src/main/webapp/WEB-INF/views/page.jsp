<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="brand" value="/resources/brand" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>    


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Jordan Contraceptive Logistics System - MOH Familiy Planning Program</title>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/app.css" rel="stylesheet">
    <!-- Custom styles for this template -->
  <link href="${css}/bootstrap-datepicker.min.css" rel="stylesheet">

</head>

<body>
      <!-- Bootstrap core JavaScript -->
  <script src="${js}/jquery.js"></script>
  <script src="${js}/bootstrap.bundle.min.js"></script>
  <script src="${js}/bootstrap-datepicker.min.js"></script>
  
  
  <!-- Navigation -->
 	<%@include file="./shared/navbar.jsp" %>

  <!-- Page Content -->
   <!-- breadcrumb -->
   <header>
	<%@include file="./shared/breadcrumb.jsp" %>
  </header>
  
 <!--  LOADING HOME PAGE -->
 <c:if test="${userClickHome == true}"> 
  <!-- CUROUSAL - header -->	
 <%@include file="./shared/carousel.jsp" %>
 <%@include file="home.jsp" %>
 </c:if>
 
  <!--  LOADING about us PAGE -->
 <c:if test="${userClickAbout == true}"> 
 <%@include file="about.jsp" %>
 </c:if>
 
 <!-- LOADING REPORTS -->
 <c:if test="${userClickReport == true }" >
 <%@include file="report.jsp" %>
 </c:if>	
  <!-- /.container -->

  <!-- /.container -->

  
  <!-- Footer -->
	<%@include file="./shared/footer.jsp" %>



  
</body>

</html>

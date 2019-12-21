<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
   <!--  <title> Spring Boot with Apache Tiles</title>
	<link href="/bootstrap.min.css" rel="stylesheet">
    <script src="/jquery-2.2.1.min.js"></script>
    <script src="/bootstrap.min.js"></script> -->
    <head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Simple Sidebar - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="/css/simple-sidebar.css" rel="stylesheet">

</head>
</head>
<body>
	
		<%-- <div class="container" style="margin:50px">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="menu" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	   </div> --%>

	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div style="float: left; padding: 10px; width: 20%;">
		<tiles:insertAttribute name="menu" />
	</div>
	<div
		style="float: left; padding: 10px; width: 70%; border-left: 1px solid pink;">
		<tiles:insertAttribute name="body" />
	</div>
	<div style="clear: both">
		<tiles:insertAttribute name="footer" />
	</div>


	<%-- <tiles:insertAttribute name="header" />
	<br />
	<tiles:insertAttribute name="body" />
	<br />
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="footer" /> --%>
</body>
</html>
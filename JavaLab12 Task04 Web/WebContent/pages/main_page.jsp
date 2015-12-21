<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="include.jsp" />
</head>
<body>

	<jsp:include page="nav_bar.jsp" flush="false" />
	
	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">

		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
		</ol>

		<div class="carousel-inner" role="listbox">
			<div class="item active">

				<img src="images/header-bg5.jpg" alt="Second slide">
				<div id="text">
					<h1 class="wow fadeInDown">
						We are&nbsp;&nbsp;<strong><span class="color">Development
								TEAM</span></strong>
					</h1>
					<p class="wow fadeInDown">Creates the world with us</p>
				</div>

			</div>
			<div class="item">
				<img src="images/header-bg6.jpg" alt="Second slide">
			</div>
			<div class="item">
				<img src="images/header-bg.jpg" alt="Third slide">
			</div>
		</div>
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"><\/script>')
	</script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/docs.min.js"></script>

</body>
</html>
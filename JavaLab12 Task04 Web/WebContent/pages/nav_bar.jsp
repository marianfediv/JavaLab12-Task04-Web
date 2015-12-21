

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- Fixed navbar -->

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">${development_team}</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="mainform">${home}</a></li>
				<li><a href="#about">${about}</a></li>
				<li><a href="#contact">${contact}</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">${language}<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><div>&nbsp;&nbsp;<img alt="en" src="images/en.png">&nbsp;&nbsp;<a
							href="mainform?language=en_US"> ${en} </a></div></li>
						<li><div>&nbsp;&nbsp;<img alt="ua" src="images/ua.png">&nbsp;&nbsp;<a
							href="mainform?language=ua_UA"> ${ua} </a></div></li>
					</ul></li>
			</ul>
			<ul class="nav navbar-nav" id="nav_login">
				<c:if test="${user != null}">
					<li id="user_name"><c:out value="${user}"></c:out></li>
					<li><a href="exit">${exit}&nbsp;&nbsp;&nbsp;&nbsp;<span
							class="glyphicon glyphicon-off"></span></a></li>
				</c:if>
				<c:if test="${user == null}">
					<li id="login"><a data-toggle="modal"
						data-target="#loginModal">${login}</a></li>
					<li><a href=register>${register}</a></li>
				</c:if>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>



<div class="modal fade" id="loginModal" tabindex="-1" role="dialog"
	aria-labelledby="Login" aria-hidden="true">
	<div class="modal-dialog">


		<div class="modal-body">
			<div class="container">
				<p>
					<br />
				</p>
				<div class="row">
					<div class="col-md-5"></div>
					<div class="col-md-4">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="page-header">
									<h3>Login</h3>
									<c:if test="${error != null}">
										<h3>
											<span style="color: red"><c:out
													value=" ${error_message}"></c:out></span>
										</h3>
									</c:if>
								</div>
								<form role="form" action="login" method="post">

									<div class="form-group">
										<label>Username</label>
										<div class="input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-user"></span></span> <input type="text"
												class="form-control" name="username"
												placeholder="Enter username">
										</div>
									</div>
									<div class="form-group">
										<label>Password</label>
										<div class="input-group">
											<span class="input-group-addon"><span
												class="glyphicon glyphicon-star"></span></span> <input
												type="password" class="form-control" name="password"
												placeholder="Password">
										</div>
									</div>
									<hr />
									<button type="button" class="btn btn-success"
										data-dismiss="modal">
										<span class="glyphicon glyphicon-arrow-left"></span> Back
									</button>
									<button type="submit" class="btn btn-primary">
										<span class="glyphicon glyphicon-lock"></span> Login
									</button>
									<p>
										<br />
									</p>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>



			<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
			<!-- Include all compiled plugins (below), or include individual files as needed -->
		</div>
	</div>

</div>


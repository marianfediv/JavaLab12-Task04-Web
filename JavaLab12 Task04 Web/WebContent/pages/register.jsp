<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="include.jsp" />

</head>
<body style="background: #eee;">
	<div class="row">
		<jsp:include page="nav_bar.jsp" flush="false" />
	</div>
	
	<p>
	</p>
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="page-header" style="margin-top: 5px;">
						<h4 align="center">
							<strong>Register New User</strong>
						</h4>
					</div>
					<form class="form-horizontal" role="form" action="register"
						method=post>
						<div class="form-group">
							<label for="inputfname" class="col-sm-2 control-label">First
								Name</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;*&nbsp;</span> <input
										type="text" class="form-control" id="inputfname"
										placeholder="First Name" name="f_name" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputlname" class="col-sm-2 control-label">Last
								Name</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;*&nbsp;</span> <input
										type="text" class="form-control" id="inputlname"
										placeholder="Last Name" name="l_name" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputmname" class="col-sm-2 control-label">Middle
								Name</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;&nbsp;&nbsp;</span> <input
										type="text" class="form-control" id="inputmname"
										placeholder="Middle Name" name="m_name">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputphone" class="col-sm-2 control-label">Phone</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;&nbsp;&nbsp;</span> <input
										type="text" class="form-control" id="inputphone"
										placeholder="Phone" name="phone">
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">@</span> <input type="email"
										class="form-control" id="inputEmail3" placeholder="Email"
										name="email" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">Gender</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;*&nbsp;</span> <select
										class="form-control" name="gender">
										<option value="">Choose a gender</option>
										<option value="male">male</option>
										<option value="female">female</option>
										<option value="undetermined">undetermined</option>
									</select>
								</div>
							</div>
						</div>


						<div class="form-group">
							<label for="inputlogin" class="col-sm-2 control-label">Login</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;*&nbsp;</span> <input
										type="text" class="form-control" id="inputlogin"
										placeholder="Login" name="login" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
							<div class="col-sm-10">
								<div class="input-group">
									<span class="input-group-addon">&nbsp;*&nbsp;</span> <input
										type="password" class="form-control" id="inputPassword3"
										placeholder="Password" name="password" required>
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" name="Register" class="btn btn-primary">
									&nbsp;&nbsp;<span class="glyphicon glyphicon-check"></span>&nbsp;&nbsp;&nbsp;&nbsp;Register&nbsp;&nbsp;&nbsp;&nbsp;
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>

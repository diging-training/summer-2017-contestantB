<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="jumbotron col-md-12">
	<sec:authorize access="isAnonymous()">
		<h1></h1>
		<p>Please Login to play!</p>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<h1>Current Max is ${current_max}</h1>
		<p>Enter a number between 1 and ${allowed_max}</p>
		<form action="<c:url value="/manual/new" />"method="GET">
			<input placeholder="Enter value" class="form-control input-sm"
				type="number" name="input" />
			<button class="btn btn-default btn-sm" type="submit">Submit</button>
			<br>
		</form>
		<script type="text/javascript">
			function Reload() {
				$(function() {
					$.ajax({
						url : "http://localhost:8080/contestantB/auto/update",
						type : 'GET',
						success : function(res) {
							console.log(res)
							if (res) {
								window.location.href = "http://localhost:8080/contestantB/manual";
							}
						}
					});
				});
			}
			setInterval(Reload, 3000);
		</script>
	</sec:authorize>
</div>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="jumbotron col-md-12">

	<sec:authorize access="isAnonymous()">
		<h1></h1>
		<p>Please Login to play!</p>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<h1>Starting</h1>
		<p>Current max is ${Current_max}</p>
		<div>
			<ul>
				<c:forEach var="listValue" items="${lists}">
					<li>${listValue}</li>
				</c:forEach>
			</ul>

		</div>
		<script type="text/javascript">
			function Reload() {
				$(function() {
					$.ajax({
						url : "http://localhost:8080/contestantB/auto/update",
						type : 'GET',
						success : function(res) {
							console.log(res)
							if (res) {
								location.reload(true)
							}
						}
					});
				});
			}
			setInterval(Reload, 3000);
		</script>
	</sec:authorize>
</div>
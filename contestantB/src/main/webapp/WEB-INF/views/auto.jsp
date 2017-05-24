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
		<h1></h1>
		<p>Start Automatic</p>
		<form action="<c:url value="/auto" />" method="post">
			<button class="btn btn-default btn-sm" type="submit">Start</button>
			<br>
		</form>
	</sec:authorize>
</div>
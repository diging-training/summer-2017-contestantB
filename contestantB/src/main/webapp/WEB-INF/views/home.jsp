<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div class="jumbotron col-md-12">

	<sec:authorize access="isAnonymous()">
		<h1>Congratulation!</h1>
		<p>You did it. This basic webapp is all set up now. Try to login
			as "admin" with password "admin".</p>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
		<h1>Logged in Successfully!</h1>
		<p>Select the mode you want to play in</p>
		<form action="<c:url value="/manual" />" method="get">
			<button class="btn btn-default btn-sm" type="submit">Manual</button><br>
			<button class="btn btn-default btn-sm" type="submit" formaction="<c:url value="/auto" />">Automatic</button>
		</form>
	</sec:authorize>
</div>
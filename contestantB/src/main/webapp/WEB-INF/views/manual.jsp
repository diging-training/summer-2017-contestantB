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
		<p>Enter your number</p>
		<form action="<c:url value="/manual" />"method="post">
			<input placeholder="Enter value" class="form-control input-sm"
				type="text" id="username" name="username" />
			<button class="btn btn-default btn-sm" type="submit">Manual</button>
			<br>
		</form>
	</sec:authorize>
</div>
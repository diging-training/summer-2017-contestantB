<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	
	
	<h2>${winner} wins </h2>
	
	<p> List is :</p>
	<div>
			<ul>
				<c:forEach var="listValue" items="${lists}">
					<li>${listValue}</li>
				</c:forEach>
			</ul>
		</div>
	<p> To play again press home at the top</p>
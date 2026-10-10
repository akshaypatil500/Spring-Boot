<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring" %>

<html>
<body>
	
	
	
	
	<spring:form modelAttribute="user" method="POST" action="/register">
		
		User name : <spring:input type="text"  path="username"/> 
		            <spring:errors path="username"/> <br/>
					
		Email ID  : <spring:input type="email" path="email"/>
		            <spring:errors path="email"/> <br>
					
		Mobile    : <spring:input type="text"  path="mobile"/> 
		            <spring:errors path="mobile"/><br>
 		
		Gender    : <spring:radiobutton path="gender" value="male" label="Male"/> 
		
					<spring:radiobutton path="gender" value="female" label="Female"/> 
					<spring:errors path="gender"/><br>
					
	    Birth Date :<spring:input type="date" path="bdate"/>
	             	<spring:errors path="bdate"/><br>			

		<input type="submit" value="Submit"> <br>
	</spring:form>
	
</body>	

</html>
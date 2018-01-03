<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/WEB-INF/nestedif.tld" prefix="iftag" %>
    	<h1>
    		<center>
    			<iftag:if condition='<%=10>20%>'>
    				<iftag:true>Condition is True</iftag:true>
    				<iftag:false>Condition is False</iftag:false>
    			</iftag:if>
    		</center>
    	</h1>
	

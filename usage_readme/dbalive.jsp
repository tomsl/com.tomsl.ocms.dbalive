<%@ page pageEncoding="UTF-8" %>

<%@page import="com.tomsl.dbalive.*"%>
<%@ taglib prefix="cms" uri="http://www.opencms.org/taglib/cms"%>

<jsp:useBean id="cms" class="org.opencms.jsp.CmsJspActionElement">
	<% cms.init(pageContext, request, response); %>
</jsp:useBean>
<%-- 
	This is used for check if the database AND the whole website is
	available. 
	The "ret" will display 1, if and only if the Database result is valid.
	There will be display 0 if this goes wrong.
	In this case, the page still will not answer and return a 401,404 or 501,503
	
	Long version:
	<%
	DbAlive dbalive = DbAlive.getInstance();	
	String ret =dbalive.getState();
	%>
	<%=ret%>
--%>
<%=DbAlive.getInstance().getState()%>

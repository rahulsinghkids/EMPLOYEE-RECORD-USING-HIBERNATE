<%@ page import="rahul.*" %>
<%
int id = Integer.parseInt(request.getParameter("id"));
empdao.delete(id);


%>
<jsp:include page="index.jsp" />
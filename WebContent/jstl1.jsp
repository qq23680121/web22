<%@page import="com.sun.jndi.toolkit.url.Uri"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	                  List<String> strList=new ArrayList<String>();
                   strList.add("11111");
                   strList.add("211nihao11");
                   strList.add("3ee11111");
                   strList.add("4ee11111");
                   request.setAttribute("strList", strList);
%>
<c:forEach items="${strList }" var="str">
                  ${str };  <br/>
</c:forEach>
   ${pageContext.request.contextPath};
</body>
</html>
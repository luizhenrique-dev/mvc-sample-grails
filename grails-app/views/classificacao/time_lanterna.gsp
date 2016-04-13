<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 13/04/16
  Time: 10:13
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Time Lanterna</title>
</head>

<body>
<h1><g:fieldValue bean="${timeLanterna.campeonato}" field="nome"/></h1>
<div class="fieldcontain">
	<g:if test="${timeLanterna?.nome}">
		O time lanterna é o
		<b><g:fieldValue bean="${timeLanterna}" field="nome"/></b>
	</g:if>
</div>
<br/><br/>
<a class="home" href="${createLink(uri: '/')}">Voltar ao início</a>
</body>
</html>
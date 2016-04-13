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
	<title>Time Campeão</title>
</head>

<body>
<h1><g:fieldValue bean="${timeCampeao.campeonato}" field="nome" /></h1>
<div class="fieldcontain">
	<g:if test="${timeCampeao?.nome}">
		O time campeão é o
		<b><g:fieldValue bean="${timeCampeao}" field="nome"/></b>
	</g:if>
</div>
<br /><br />
<a class="home" href="${createLink(uri: '/')}">Voltar ao início</a>
</body>
</html>
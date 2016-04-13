<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 13/04/16
  Time: 10:14
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Classificação</title>
</head>

<body>
<h1>Classificação do Campeonato</h1>
<ul>
	<g:each status="i" var="time" in="${timesOrdenadosClassificacao}">
		<p>${i + 1}
			${time.nome}</p>
	</g:each>
</ul>

<br/><br/>
<a class="home" href="${createLink(uri: '/')}">Voltar ao início</a>
<br/><br/>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 12/04/16
  Time: 14:58
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Detalhes Campeonato</title>
</head>

<body>

<div>
	<div class="fieldcontain">
		<g:if test="${campeonato?.nome}">
			Nome
			<b><g:fieldValue bean="${campeonato}" field="nome"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${campeonato?.quantidadeDeRodadas}">
			Quantidade de Rodadas
			<b><g:fieldValue bean="${campeonato}" field="quantidadeDeRodadas"/></b>
		</g:if>
	</div>
	<br/>
	<g:link controller="time" action="create">Adicionar time</g:link>
</div>
</body>
</html>
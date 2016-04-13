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
	<title>Detalhes Time</title>
</head>

<body>
<div>
	<div class="fieldcontain">
		<g:if test="${time?.nome}">
			Nome
			<b><g:fieldValue bean="${time}" field="nome"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${time?.quantidadeVitorias}">
			Quantidade de Vitórias
			<b><g:fieldValue bean="${time}" field="quantidadeVitorias"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${time?.quantidadeEmpates}">
			Quantidade de Empates
			<b><g:fieldValue bean="${time}" field="quantidadeEmpates"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${time?.quantidadeDerrotas}">
			Quantidade de Derrotas
			<b><g:fieldValue bean="${time}" field="quantidadeDerrotas"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${time?.quantidadeGolsPro}">
			Quantidade de Gols Pro
			<b><g:fieldValue bean="${time}" field="quantidadeGolsPro"/></b>
		</g:if>
	</div>

	<div class="fieldcontain">
		<g:if test="${time?.quantidadeGolsContra}">
			Quantidade de Gols Contra
			<b><g:fieldValue bean="${time}" field="quantidadeGolsContra"/></b>
		</g:if>
	</div>
</div>

<br/>
<g:link controller="time" action="create">Adicionar Novo Time</g:link>
<br/><br />
<g:link controller="classificacao" id="${time.campeonato.id}" action="menu">Ir para menu do sistema</g:link>
</body>
</html>
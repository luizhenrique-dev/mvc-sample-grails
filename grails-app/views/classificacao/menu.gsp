<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 13/04/16
  Time: 09:59
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Menu do Sistema</title>
</head>

<body>
<h1>Escolha um operação</h1>

<h2><g:fieldValue bean="${campeonato}" field="nome"/></h2>
<br/>
<g:link controller="classificacao" id="${campeonato.id}" action="obterTimeCampeao">Saber o campeão</g:link>
<br/><br/>
<g:link controller="classificacao" id="${campeonato.id}" action="obterTimeLanterna">Saber o lanterna</g:link>
<br/><br/>
<g:link controller="classificacao" id="${campeonato.id}" action="realizaClassificacao">Exibir classificação</g:link>
<br/><br/>
<a class="home" href="${createLink(uri: '/')}">Voltar ao início</a>
</body>
</html>
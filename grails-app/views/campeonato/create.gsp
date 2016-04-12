<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 12/04/16
  Time: 14:58
--%>
<%@ page import="br.com.zg.treino.entity.Campeonato" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Cadastrar Campeonato</title>
</head>

<body>

<div>
	<h1>Cadastro de um novo campeonato</h1>
	<g:form action="save">

		<div class="fieldcontain">
			<label for="nome">
				Nome
				<span class="required-indicator">*</span>
			</label>
			<g:textField name="nome" required="" value="${campeonato?.nome}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeDeRodadas">
				Quantidade de Rodadas
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeDeRodadas" type="number" required="" value="${campeonato.quantidadeDeRodadas}"/>
		</div>
		<br/>

		<div>
			<g:submitButton name="salvar" class="save" value="Salvar"/>
		</div>
	</g:form>

</div>
</body>
</html>
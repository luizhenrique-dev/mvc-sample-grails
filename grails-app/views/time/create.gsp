<%--
  Created by IntelliJ IDEA.
  User: luizhenrique
  Date: 12/04/16
  Time: 14:58
--%>
<%@ page import="br.com.zg.treino.entity.Time" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Cadastrar Time</title>
</head>

<body>

<div>
	<h1>Cadastro de um novo time</h1>
	<g:form action="save">

		<div class="fieldcontain">
			<label for="nome">
				Nome
				<span class="required-indicator">*</span>
			</label>
			<g:textField name="nome" required="" value="${time?.nome}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeVitorias">
				Quantidade de Vitórias
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeVitorias" type="number" required="" value="${time.quantidadeVitorias}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeEmpates">
				Quantidade de Empates
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeEmpates" type="number" required="" value="${time.quantidadeEmpates}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeDerrotas">
				Quantidade de Derrotas
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeDerrotas" type="number" required="" value="${time.quantidadeDerrotas}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeGolsPro">
				Quantidade Gols Pro
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeGolsPro" type="number" required="" value="${time.quantidadeGolsPro}"/>
		</div>

		<div class="fieldcontain">
			<label for="quantidadeGolsContra">
				Quantidade Gols Contra
				<span class="required-indicator">*</span>
			</label>
			<g:field name="quantidadeGolsContra" type="number" required="" value="${time.quantidadeGolsContra}"/>
		</div>

		<div>
			<g:submitButton name="salvar" class="save" value="Salvar"/>
		</div>
	</g:form>

</div>
</body>
</html>
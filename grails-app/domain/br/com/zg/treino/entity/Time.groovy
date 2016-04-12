package br.com.zg.treino.entity

class Time {

	String nome
	int quantidadeVitorias
	int quantidadeDerrotas
	int quantidadeEmpates
	int quantidadeGolsPro
	int quantidadeGolsContra

	static belongsTo = [campeonato: Campeonato]

	static constraints = {
		nome nullable: false
		quantidadeVitorias nullable: false, min: 0, blank: false
		quantidadeDerrotas nullable: false, min: 0, blank: false
		quantidadeEmpates nullable: false, min: 0, blank: false
		quantidadeGolsPro nullable: false, min: 0, blank: false
		quantidadeGolsContra nullable: false, min: 0, blank: false
	}
}

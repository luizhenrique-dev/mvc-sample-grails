package br.com.zg.treino.entity

class Campeonato {

	String nome
	int quantidadeDeRodadas

	static hasMany = [timesParticipantes: Time]

	static constraints = {
		quantidadeDeRodadas nullable: true, blank: true, range: 1..38
		nome nullable: false, blank: false
	}
}

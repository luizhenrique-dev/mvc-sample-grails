package br.com.zg.treino.entity

class Campeonato {

	String nome
	int quantidadeDeRodadas

	static hasMany = [timesParticipantes: Time]

	static constraints = {
		quantidadeDeRodadas nullable: true, blank: true, min: 1
		nome nullable: false, blank: false
	}


	@Override
	public String toString() {
		return nome
	}
}

package br.com.zg.treino.service

import br.com.zg.treino.entity.Campeonato

class CampeonatoService {

	Campeonato buscarCampeonato(id) {
		def campeonato = Campeonato.get(id)
		if (!campeonato) {
			throw new Exception("Esse campeonato não existe", campeonato)
		}
		return campeonato
	}
}

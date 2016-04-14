package br.com.zg.treino.service

import br.com.zg.treino.entity.Campeonato
import br.com.zg.treino.entity.Time

class CampeonatoService {

	def classificacao2015Service

	Campeonato buscarCampeonato(id) {
		def campeonato = Campeonato.get(id)
		if (!campeonato) {
			throw new Exception("Esse campeonato não existe", campeonato)
		}
		return campeonato
	}

	boolean salvar(Campeonato campeonato){
		if(campeonato.save(flush: true)){
			return true
		}
		return false
	}

	List<Time> realizaClassificacao(Campeonato campeonato) {
		List<Time> timesOrdenadosMenorParaMaior = classificacao2015Service.aplicaCriteriosDesempate(campeonato.timesParticipantes.collect())
		return timesOrdenadosMenorParaMaior.reverse()
	}

	Time obterTimeCampeao(Campeonato campeonato) {
		println(campeonato)
		realizaClassificacao(campeonato).first()
	}

	Time obterTimeLanterna(Campeonato campeonato) {
		realizaClassificacao(campeonato).last()
	}
}

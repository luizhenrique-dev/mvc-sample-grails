package br.com.zg.treino.controller

class ClassificacaoController {

	def classificacao2015Service
	def campeonatoService

	def realizaClassificacao(Long idCampeonato) {
		def campeonato = campeonatoService.buscarCampeonato(idCampeonato)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timesOrdenadosClassificacao = classificacao2015Service.realizaClassificacao(campeonato)
			[timesOrdenadosClassificacao: timesOrdenadosClassificacao]
		}
	}

	def obterTimeCampeao(Long idCampeonato) {
		def campeonato = campeonatoService.buscarCampeonato(idCampeonato)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timeCampeao = classificacao2015Service.obterTimeCampeao(campeonato)
			[timeCampeao: timeCampeao]
		}
	}

	def obterTimeLanterna(Long idCampeonato) {
		def campeonato = campeonatoService.buscarCampeonato(idCampeonato)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timeLanterna = classificacao2015Service.obterTimeLanterna(campeonato)
			[timeLanterna: timeLanterna]
		}
	}

	def obterTabelaCameponato() {

	}


}

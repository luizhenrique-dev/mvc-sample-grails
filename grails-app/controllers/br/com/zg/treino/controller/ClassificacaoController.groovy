package br.com.zg.treino.controller

class ClassificacaoController {

	def classificacao2015Service
	def campeonatoService

	def realizaClassificacao(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timesOrdenadosClassificacao = classificacao2015Service.realizaClassificacao(campeonato)
			render(view: "classificacao", model: [timesOrdenadosClassificacao: timesOrdenadosClassificacao])
		}
	}

	def obterTimeCampeao(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timeCampeao = classificacao2015Service.obterTimeCampeao(campeonato)
			render(view: "time_campeao", model: [timeCampeao: timeCampeao])
		}
	}

	def obterTimeLanterna(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			def timeLanterna = classificacao2015Service.obterTimeLanterna(campeonato)
			render(view: "time_lanterna", model: [timeLanterna: timeLanterna])
		}
	}

	def menu(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			render(view: "menu", model: [campeonato: campeonato])
		}
	}
}

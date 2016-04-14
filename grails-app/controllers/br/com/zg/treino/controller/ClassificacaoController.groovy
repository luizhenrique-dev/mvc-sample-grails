package br.com.zg.treino.controller

class ClassificacaoController {

	def campeonatoService

	def realizaClassificacao(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			render(view: "classificacao", model: [timesOrdenadosClassificacao: campeonatoService.realizaClassificacao(campeonato)])
		}
	}

	def obterTimeCampeao(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			render(view: "time_campeao", model: [timeCampeao: campeonatoService.obterTimeCampeao(campeonato)])
		}
	}

	def obterTimeLanterna(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato) {
			render "Esse campeonato não existe"
		} else {
			render(view: "time_lanterna", model: [timeLanterna: campeonatoService.obterTimeLanterna(campeonato)])
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

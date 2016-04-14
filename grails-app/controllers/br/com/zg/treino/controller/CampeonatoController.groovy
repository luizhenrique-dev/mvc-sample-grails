package br.com.zg.treino.controller

import br.com.zg.treino.entity.Campeonato

class CampeonatoController {

	def campeonatoService

	def index() {
		redirect(action: "create", params: params)
	}

	def save() {
		def campeonato = new Campeonato(params)
		if(campeonatoService.salvar(campeonato)){
			redirect(action: "show", id: campeonato.id)
		}
		else {
			render 'Não foi possível salvar o campeonato'
		}
	}

	def create() {
		[campeonato: new Campeonato(params)]
	}

	def show(Long id) {
		def campeonato = campeonatoService.buscarCampeonato(id)
		if (!campeonato){
			render "Esse campeonato não existe"
		}
		[campeonato: campeonato]
	}
}

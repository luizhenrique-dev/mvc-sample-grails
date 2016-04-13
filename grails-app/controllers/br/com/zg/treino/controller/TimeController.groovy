package br.com.zg.treino.controller

import br.com.zg.treino.entity.Time

class TimeController {

	def timeService

	def index() {
		redirect(action: "create", params: params)
	}

	def list() {
		render(view: actionName)
	}

	def create() {
		[time: new Time(params)]
	}

	def update() {

	}

	def save() {
		def time = new Time(params)
		if (time.save(flush: true)) {
			redirect(action: "show", id: time.id)
		}
		else {
			render "Não foi possível salvar o time"
		}
	}

	def edit() {

	}

	def show(Long id) {
		def time = timeService.buscarTime(id)
		if (!time){
			render "Esse time não existe"
		}
		[time: time]
	}
}

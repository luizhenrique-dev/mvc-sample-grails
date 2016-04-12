package br.com.zg.treino.entity

class TimeController {

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
		if (time.save()) {
			redirect(action: "show", id: time.id)
		}
		else {
			render "Não foi possível salvar o time"
		}
	}

	def edit() {

	}

	def show() {
		def time = Time.get(params.id)
	}
}

package br.com.zg.treino.entity

class CampeonatoController {

	def index() {
		redirect(action: "create", params: params)
	}

	def save() {
		def campeonato = new Campeonato(params)
		if(campeonato.save(flush: true)){
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
		def campeonato = Campeonato.get(id)
		if (!campeonato){
			render "Esse campeonato não existe"
		}
		[campeonato: campeonato]
	}
}

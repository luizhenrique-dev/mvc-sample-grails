package br.com.zg.treino.entity

import br.com.zg.treino.controller.CampeonatoController
import br.com.zg.treino.service.CampeonatoService
import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@Mock([CampeonatoService, Campeonato])
@TestMixin(Campeonato)
@TestFor(CampeonatoController)
class CampeonatoControllerTests {

	void testCreate() {
		params.nome = 'Campeonato Brasileiro 2015'
		params.quantidadeDeRodadas = 38

		assert controller.create().campeonato.nome == 'Campeonato Brasileiro 2015'
		assert controller.create().campeonato.quantidadeDeRodadas == 38
	}

	void testSaveValido() {
		params.nome = 'Campeonato Brasileiro 2015'
		params.quantidadeDeRodadas = 38

		controller.save()
		assert response.redirectedUrl == '/campeonato/show/1'
		assert Campeonato.count() == 1
	}

	void testSaveInvalido() {
		controller.save()

		assert response.text == 'Não foi possível salvar o campeonato'
		assert model.campeonato == null
	}

	void testShow() {
		params.nome = 'Campeonato Brasileiro 2015'
		params.quantidadeDeRodadas = 38

		controller.save()

		controller.show(1)
		assert model.campeonato == null
	}

	void testShowInvalido() {
		shouldFail(Exception) {
			controller.show(1)
		}
	}

	void testIndex() {
		controller.index()
		assert response.redirectedUrl == '/campeonato/create'
	}
}

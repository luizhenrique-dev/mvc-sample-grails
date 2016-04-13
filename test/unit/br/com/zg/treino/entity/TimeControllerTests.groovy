package br.com.zg.treino.entity

import br.com.zg.treino.controller.TimeController
import br.com.zg.treino.service.TimeService
import grails.test.mixin.*
import org.codehaus.groovy.grails.commons.GrailsDomainClass

import static grails.test.MockUtils.mockDomain

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@Mock([Time, TimeService])
@TestMixin(Time)
@TestFor(TimeController)
class TimeControllerTests {

	void testCreate() {
		params.nome = 'Corinthans'
		params.quantidadeVitorias = 3
		params.quantidadeDerrotas = 3
		params.quantidadeEmpates = 3
		params.quantidadeGolsPro = 3
		params.quantidadeGolsContra = 3
		params.campeonato = new Campeonato([nome: 'Campeonato Teste', quantidadeDeRodadas: 10])

		assert controller.create().time.nome == 'Corinthans'
		assert controller.create().time.quantidadeGolsPro == 3
		assert controller.create().time.quantidadeVitorias == 3
		assert controller.create().time.quantidadeDerrotas == 3
		assert controller.create().time.quantidadeEmpates == 3
		assert controller.create().time.quantidadeGolsContra == 3
	}

	void testSaveValido() {
		params.nome = 'Corinthans'
		params.quantidadeVitorias = 3
		params.quantidadeDerrotas = 3
		params.quantidadeEmpates = 3
		params.quantidadeGolsPro = 3
		params.quantidadeGolsContra = 3
		params.campeonato = new Campeonato([nome: 'Campeonato Teste', quantidadeDeRodadas: 10])

		controller.save()
		assert response.redirectedUrl == '/time/show/1'
		assert Time.count() == 1
	}

	void testSaveInvalido() {
		controller.save()

		assert model.time == null
		assert response.text == 'Não foi possível salvar o time'
	}

	void testShow() {
		params.nome = 'Corinthans'
		params.quantidadeVitorias = 3
		params.quantidadeDerrotas = 3
		params.quantidadeEmpates = 3
		params.quantidadeGolsPro = 3
		params.quantidadeGolsContra = 3
		params.campeonato = new Campeonato([nome: 'Campeonato Teste', quantidadeDeRodadas: 10])

		controller.save()

		controller.show(1)
		assert model.time == null
	}

	void testShowInvalido() {
		shouldFail(Exception) {
			controller.show(1)
		}
	}

	void testIndex() {
		controller.index()
		assert response.redirectedUrl == '/time/create'
	}
}

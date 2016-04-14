package br.com.zg.treino.entity

import br.com.zg.treino.controller.ClassificacaoController
import br.com.zg.treino.service.CampeonatoService
import br.com.zg.treino.service.Classificacao2015Service
import grails.test.mixin.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@Mock([CampeonatoService, Campeonato, Time])
@TestFor(ClassificacaoController)
class ClassificacaoControllerTests extends GroovyTestCase {

	void testRealizaClassificacaoInvalido() {
		shouldFail(Exception) {
			controller.realizaClassificacao(1)
		}
	}

	void testRealizaClassificacaoValido() {
//		def classificacao2015Service = mockFor(Classificacao2015Service)
//		classificacao2015Service = classificacao2015Service.createMock()
//		def campeonato = new Campeonato()
//		classificacao2015Service.realizaClassificacao(campeonato) >> {
//			List<Time> teste = [new Time(nome: 1, quantidadeVitorias: 2, quantidadeGolsContra: 2, quantidadeEmpates: 2,
//			quantidadeDerrotas: 2, quantidadeGolsPro: 2)]
//			return teste
//		}
		Time time1 = new Time(nome: 'Corinthans', quantidadeVitorias: 5, quantidadeGolsPro: 30, quantidadeDerrotas: 2, quantidadeEmpates: 3, quantidadeGolsContra: 1)
		Time time2 = new Time(nome: 'Palmeiras', quantidadeGolsContra: 10, quantidadeVitorias: 4, quantidadeEmpates: 2, quantidadeDerrotas: 4, quantidadeGolsPro: 10)
		def campeonato = new Campeonato(nome: 'Camp Brasileiro', quantidadeDeRodadas: 38, timesParticipantes: [time1, time2])
		//mockDomain(Campeonato, [campeonato])
		controller.realizaClassificacao(1)
		assert view == '/classificacao/classificacao'
		assert model.timesOrdenadosClassificacao != null


	}

	void testObterTimeCampeao() {
		fail "Implement me"
	}

	void testObterTimeLanterna() {
		fail "Implement me"
	}

	void testMenu() {

	}
}

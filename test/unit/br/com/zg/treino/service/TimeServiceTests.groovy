package br.com.zg.treino.service

import br.com.zg.treino.entity.Campeonato
import br.com.zg.treino.entity.Time
import grails.test.GrailsMock
import grails.test.mixin.*
import grails.test.mixin.services.ServiceUnitTestMixin
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@Mock(Time)
@TestFor(TimeService)
@TestMixin(ServiceUnitTestMixin)
class TimeServiceTests {

	void testBuscarTimeInvalido() {
		shouldFail(Exception) {
			service.buscarTime(1)
		}
	}

	void testBuscarTimeValido() {
		Campeonato camp = new Campeonato(nome: 'Camp Brasileiro', quantidadeDerrotas: 38)
		Time time = new Time(nome: 'Corinthans', quantidadeDerrotas: 1, quantidadeGolsPro: 2, quantidadeVitorias: 3,
				quantidadeGolsContra: 3, quantidadeEmpates: 3, campeonato: camp)
		time.save()
		assert service.buscarTime(1)

//		GrailsMock mockPerson = mockFor(Person)
//		mockPerson.demand.static.get() { Long id -> new Person(name:"John") }
	}
}

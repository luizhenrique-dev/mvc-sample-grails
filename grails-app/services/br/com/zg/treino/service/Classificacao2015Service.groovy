package br.com.zg.treino.service

import br.com.zg.treino.entity.Campeonato
import br.com.zg.treino.entity.Time
import br.com.zg.treino.service.interfaces.CalculoPontuacaoService
import br.com.zg.treino.service.interfaces.ClassificacaoService

/**
 * Created by luizhenrique on 07/04/16.
 */
class Classificacao2015Service implements ClassificacaoService {

	List<Time> realizaClassificacao(Campeonato campeonato) {
		List<Time> timesOrdenadosMenorParaMaior = aplicaCriteriosDesempate(campeonato.timesParticipantes)

		return timesOrdenadosMenorParaMaior.reverse()
	}

	List<Time> aplicaCriteriosDesempate(List<Time> times) {
		CalculoPontuacaoService calculoPontuacao2015 = new CalculoPontuacao2015Service()
		int saldoGolsTimeA, saldoGolsTimeB

		times = times.sort { timeA, timeB ->
			saldoGolsTimeA = timeA.quantidadeGolsPro - timeA.quantidadeGolsContra
			saldoGolsTimeB = timeB.quantidadeGolsPro - timeB.quantidadeGolsContra

			if (calculoPontuacao2015.calculaPontuacaoTotal(timeA) != calculoPontuacao2015.calculaPontuacaoTotal(timeB)) {
				calculoPontuacao2015.calculaPontuacaoTotal(timeA) <=> calculoPontuacao2015.calculaPontuacaoTotal(timeB)
			} else if (timeA.quantidadeVitorias != timeB.quantidadeVitorias) {
				timeA.quantidadeVitorias <=> timeB.quantidadeVitorias
			} else if (saldoGolsTimeA != saldoGolsTimeB) {
				saldoGolsTimeA <=> saldoGolsTimeB
			} else {
				timeA.quantidadeGolsPro <=> timeB.quantidadeGolsPro
			}
		}

		return times
	}

	Time obterTimeCampeao(Campeonato campeonato) {
		realizaClassificacao(campeonato).first()
	}

	Time obterTimeLanterna(Campeonato campeonato) {
		realizaClassificacao(campeonato).last()
	}
}

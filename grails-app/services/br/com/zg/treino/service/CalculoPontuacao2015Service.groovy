package br.com.zg.treino.service

import br.com.zg.treino.entity.Time
import br.com.zg.treino.service.interfaces.CalculoPontuacaoService

/**
 * Created by luizhenrique on 07/04/16.
 */
class CalculoPontuacao2015Service implements CalculoPontuacaoService {

	private final int PONTOS_POR_VITORIA = 3
	private final int PONTOS_POR_EMPATE = 1

	int calculaPontuacaoTotal(Time time) {
		int pontuacaoFinal = 0
		pontuacaoFinal += calculaPontuacaoVitoria(time.quantidadeVitorias)
		pontuacaoFinal += calculaPontuacaoEmpates(time.quantidadeEmpates)
		return pontuacaoFinal
	}

	int calculaPontuacaoVitoria(int quantidadeVitorias) {
		quantidadeVitorias * PONTOS_POR_VITORIA
	}

	int calculaPontuacaoEmpates(int quantidadeEmpates) {
		quantidadeEmpates * PONTOS_POR_EMPATE
	}
}

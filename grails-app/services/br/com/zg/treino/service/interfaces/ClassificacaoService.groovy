package br.com.zg.treino.service.interfaces

import br.com.zg.treino.entity.Campeonato
import br.com.zg.treino.entity.Time

/**
 * Created by luizhenrique on 07/04/16.
 */
interface ClassificacaoService {

	List<Time> realizaClassificacao(Campeonato campeonato)

	List<Time> aplicaCriteriosDesempate(List<Time> times)

	Time obterTimeCampeao(Campeonato campeonato)

	Time obterTimeLanterna(Campeonato campeonato)
}
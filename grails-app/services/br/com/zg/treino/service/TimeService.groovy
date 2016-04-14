package br.com.zg.treino.service

import br.com.zg.treino.entity.Time

class TimeService {

	Time buscarTime(id) {
		def time = Time.get(id)
		if (!time) {
			throw new Exception("Esse time não existe", time)
		}
		return time
	}

	boolean salvar(Time time) {
		if (time.save(flush: true)) {
			return true;
		}
		return false;
	}
}

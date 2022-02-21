package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabulacao {

	public Map<String, Double> monta(List<Map<String, String>> alunos) {
		Map<String, Double> totais = new HashMap<>();

		for (Map<String, String> aluno : alunos) {
			String curso = aluno.get("curso");
			if (!totais.containsKey(curso)) {
				totais.put(curso, 0.0);
			}
			totais.put(curso, totais.get(curso) + 1);
		}
		for (String curso : totais.keySet()) {
			totais.put(curso, (totais.get(curso) / alunos.size()) * 100);
		}

		return totais;
	}

}

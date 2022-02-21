package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> d) {
		Map<String, List<String>> nomes = new HashMap<>();

		for (Map.Entry<String, List<String>> entry : d.entrySet()) {
			String nome = entry.getKey();
			List<String> sobrenomes = entry.getValue();
			for (String sobrenome : sobrenomes) {
				List<String> l;
				if (!nomes.containsKey(sobrenome)) {
					l = new ArrayList<>();
					nomes.put(sobrenome, l);
				}
				l = nomes.get(sobrenome);
				l.add(nome);
			}
		}

		return nomes;
	}

}

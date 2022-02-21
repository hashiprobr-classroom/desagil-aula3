package br.edu.insper.desagil.aula3;

import java.util.List;
import java.util.Map;

public class Media {

	public double calcula(List<Map<String, Integer>> notas) {
		int s = 0;
		int n = 0;
		for (Map<String, Integer> nota : notas) {
			s += nota.get("peso") * nota.get("valor");
			n += nota.get("peso");
		}
		return (double) s / n;
	}

}

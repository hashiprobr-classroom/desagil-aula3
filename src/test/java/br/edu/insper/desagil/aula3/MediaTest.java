package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaTest {
	private static final double DELTA = 0.000001;

	private Media m;
	private List<Map<String, Integer>> notas;

	private Map<String, Integer> build(int peso, int valor) {
		Map<String, Integer> nota = new HashMap<>();
		nota.put("peso", peso);
		nota.put("valor", valor);
		return nota;
	}

	@BeforeEach
	private void setUp() {
		m = new Media();
		notas = new ArrayList<>();
	}

	@Test
	void pesoUmValorZero() {
		notas.add(build(1, 0));
		assertEquals(0.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorCinco() {
		notas.add(build(2, 5));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoTresValorDez() {
		notas.add(build(3, 10));
		assertEquals(10.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoUmValorZero() {
		notas.add(build(1, 0));
		notas.add(build(1, 0));
		assertEquals(0.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorCincoPesoUmValorCinco() {
		notas.add(build(1, 5));
		notas.add(build(1, 5));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorDezPesoUmValorDez() {
		notas.add(build(1, 10));
		notas.add(build(1, 10));
		assertEquals(10.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoDoisValorZero() {
		notas.add(build(1, 0));
		notas.add(build(2, 0));
		assertEquals(0.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorCincoPesoDoisValorCinco() {
		notas.add(build(1, 5));
		notas.add(build(2, 5));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorDezPesoDoisValorDez() {
		notas.add(build(1, 10));
		notas.add(build(2, 10));
		assertEquals(10.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoUmValorZero() {
		notas.add(build(2, 0));
		notas.add(build(1, 0));
		assertEquals(0.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorCincoPesoUmValorCinco() {
		notas.add(build(2, 5));
		notas.add(build(1, 5));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorDezPesoUmValorDez() {
		notas.add(build(2, 10));
		notas.add(build(1, 10));
		assertEquals(10.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoDoisValorZero() {
		notas.add(build(2, 0));
		notas.add(build(2, 0));
		assertEquals(0.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorCincoPesoDoisValorCinco() {
		notas.add(build(2, 5));
		notas.add(build(2, 5));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorDezPesoDoisValorDez() {
		notas.add(build(2, 10));
		notas.add(build(2, 10));
		assertEquals(10.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoUmValorCinco() {
		notas.add(build(1, 0));
		notas.add(build(1, 5));
		assertEquals(2.5, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoUmValorDez() {
		notas.add(build(1, 0));
		notas.add(build(1, 10));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorCincoPesoUmValorDez() {
		notas.add(build(1, 5));
		notas.add(build(1, 10));
		assertEquals(7.5, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoDoisValorCinco() {
		notas.add(build(1, 0));
		notas.add(build(2, 5));
		assertEquals(3.333333, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoDoisValorDez() {
		notas.add(build(1, 0));
		notas.add(build(2, 10));
		assertEquals(6.666666, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorCincoPesoDoisValorDez() {
		notas.add(build(1, 5));
		notas.add(build(2, 10));
		assertEquals(8.333333, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoUmValorCinco() {
		notas.add(build(2, 0));
		notas.add(build(1, 5));
		assertEquals(1.666666, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoUmValorDez() {
		notas.add(build(2, 0));
		notas.add(build(1, 10));
		assertEquals(3.333333, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorCincoPesoUmValorDez() {
		notas.add(build(2, 5));
		notas.add(build(1, 10));
		assertEquals(6.666666, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoDoisValorCinco() {
		notas.add(build(2, 0));
		notas.add(build(2, 5));
		assertEquals(2.5, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorZeroPesoDoisValorDez() {
		notas.add(build(2, 0));
		notas.add(build(2, 10));
		assertEquals(5.0, m.calcula(notas), DELTA);
	}

	@Test
	void pesoDoisValorCincoPesoDoisValorDez() {
		notas.add(build(2, 5));
		notas.add(build(2, 10));
		assertEquals(7.5, m.calcula(notas), DELTA);
	}

	@Test
	void pesoUmValorZeroPesoDoisValorCincoPesoTresValorDez() {
		notas.add(build(1, 0));
		notas.add(build(2, 5));
		notas.add(build(3, 10));
		assertEquals(6.666666, m.calcula(notas), DELTA);
	}

	@Test
	void pesoTresValorZeroPesoDoisValorCincoPesoUmValorDez() {
		notas.add(build(3, 0));
		notas.add(build(2, 5));
		notas.add(build(1, 10));
		assertEquals(3.333333, m.calcula(notas), DELTA);
	}

	@Test
	void exemploEnunciado() {
		notas.add(build(1, 3));
		notas.add(build(2, 4));
		notas.add(build(3, 5));
		notas.add(build(2, 6));
		notas.add(build(1, 9));
		assertEquals(5.222222, m.calcula(notas), DELTA);
	}
}

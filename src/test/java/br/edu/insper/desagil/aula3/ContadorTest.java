package br.edu.insper.desagil.aula3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContadorTest {
	private Map<Character, Integer> expected;
	private Contador c;

	@BeforeEach
	private void setUp() {
		expected = new HashMap<>();
		c = new Contador();
	}

	@Test
	void banana() {
		expected.put('b', 1);
		expected.put('a', 3);
		expected.put('n', 2);
		assertEquals(expected, c.calcula("banana"));
	}

	@Test
	void abobora() {
		expected.put('a', 2);
		expected.put('b', 2);
		expected.put('o', 2);
		expected.put('r', 1);
		assertEquals(expected, c.calcula("abobora"));
	}

	@Test
	void a() {
		expected.put('a', 1);
		assertEquals(expected, c.calcula("a"));
	}

	@Test
	void b() {
		expected.put('b', 1);
		assertEquals(expected, c.calcula("b"));
	}

	@Test
	void aa() {
		expected.put('a', 2);
		assertEquals(expected, c.calcula("aa"));
	}

	@Test
	void ab() {
		expected.put('a', 1);
		expected.put('b', 1);
		assertEquals(expected, c.calcula("ab"));
	}

	@Test
	void ba() {
		expected.put('a', 1);
		expected.put('b', 1);
		assertEquals(expected, c.calcula("ba"));
	}

	@Test
	void bb() {
		expected.put('b', 2);
		assertEquals(expected, c.calcula("bb"));
	}

	@Test
	void aaa() {
		expected.put('a', 3);
		assertEquals(expected, c.calcula("aaa"));
	}

	@Test
	void aab() {
		expected.put('a', 2);
		expected.put('b', 1);
		assertEquals(expected, c.calcula("aab"));
	}

	@Test
	void aba() {
		expected.put('a', 2);
		expected.put('b', 1);
		assertEquals(expected, c.calcula("aba"));
	}

	@Test
	void abb() {
		expected.put('a', 1);
		expected.put('b', 2);
		assertEquals(expected, c.calcula("abb"));
	}

	@Test
	void baa() {
		expected.put('a', 2);
		expected.put('b', 1);
		assertEquals(expected, c.calcula("baa"));
	}

	@Test
	void bab() {
		expected.put('a', 1);
		expected.put('b', 2);
		assertEquals(expected, c.calcula("bab"));
	}

	@Test
	void bba() {
		expected.put('a', 1);
		expected.put('b', 2);
		assertEquals(expected, c.calcula("bba"));
	}

	@Test
	void bbb() {
		expected.put('b', 3);
		assertEquals(expected, c.calcula("bbb"));
	}
}

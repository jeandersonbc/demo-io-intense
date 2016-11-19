package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testBaseCases() {
		assertTrue(0L == Fibonacci.compute(0L));
		assertTrue(1L == Fibonacci.compute(1L));
	}

	@Test
	public void testInductiveStep() {
		assertTrue(1L == Fibonacci.compute(2L));
		assertTrue(2L == Fibonacci.compute(3L));
		assertTrue(3L == Fibonacci.compute(4L));
		assertTrue(5L == Fibonacci.compute(5L));
		assertTrue(8L == Fibonacci.compute(6L));
	}

	@Test
	public void testLongRun1() {
		Fibonacci.compute(45L); // Let code running a little....
		assertTrue(2L == Fibonacci.compute(3L));
	}

	@Test
	public void testLongRun2() {
		Fibonacci.compute(45L); // Let code running a little....
		assertTrue(2L == Fibonacci.compute(3L));
	}

	@Test
	public void testLongRun3() {
		Fibonacci.compute(45L); // Let code running a little....
		assertTrue(2L == Fibonacci.compute(3L));
	}

	@Test
	public void testLongRun4() {
		Fibonacci.compute(45L); // Let code running a little....
		assertTrue(2L == Fibonacci.compute(3L));
	}

	@Test
	public void testLongRun5() {
		Fibonacci.compute(45L); // Let code running a little....
		assertTrue(2L == Fibonacci.compute(3L));
	}

}

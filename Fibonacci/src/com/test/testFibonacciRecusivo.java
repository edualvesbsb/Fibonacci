package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fibonacci.Fibonacci;

public class testFibonacciRecusivo {

	@Test
	public void testFiboBase() {
		Fibonacci fibo = new Fibonacci();
		
		assertEquals(8, fibo.fibonacciRecursivo(6));
		
	}

}

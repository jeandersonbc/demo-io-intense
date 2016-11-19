package com.example;

public class Fibonacci {

	public static Long compute(Long i) {
		if ((i == 0) || (i == 1))
			return i;
		return Fibonacci.compute(i - 1) + Fibonacci.compute(i - 2);
	}
	
	public static void main(String[] args) {;
		long init = System.currentTimeMillis();
		compute(45L);
		long final_t = System.currentTimeMillis();
		System.out.println((final_t - init) / 1000);
	}

}

package com.fibonacci;

import java.util.Scanner;

/*
 * Classe que representa o cálculo do número N da série de Fibonacci.
 * 
 *  Há tanto a versão iterativa quanto a recursiva. Hmm...
 */

public class Fibonacci {
	
	private int aux;
	private int x1 =1, x2 =1, i;
	private Scanner dados;
	
	
	public int fibonacciInterativo(int x) {
		for(i = 2; i != x; i++) {
			if(x == 1 || x == 2){
				return 1;
			}
			else{
				aux = x2;
				x2 = x1 + x2;
				x1 = aux;
			}
		}
		return x2;
	}
	
	public int fibonacciRecursivo(int x) {
		if(x == 1 || x == 2){
			return 1;
		}
		else
			return fibonacciRecursivo(x -1) + fibonacciRecursivo(x -2);
	}
	
	public int ler() {
		
		dados = new Scanner(System.in); 
			
		System.out.println("Digite n para calcular Fibonacci: ");  
		int z= dados.nextInt();  
		
		return z;
	}
	
	public void imprimir (int n){
		System.out.println("Resultado Recursivo = " + fibonacciRecursivo(n));
		System.out.println("Resultado Interativo = " +fibonacciInterativo(n));
	}
	
	

}
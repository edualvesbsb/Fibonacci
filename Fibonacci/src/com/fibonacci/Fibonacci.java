package com.fibonacci;

import java.util.Scanner;

/*
 * Classe que representa o c�lculo do n�mero N da s�rie de Fibonacci.
 * 
 *  H� tanto a vers�o iterativa quanto a recursiva. 
 */

public class Fibonacci {
	
	private int aux;
	private int x1 =1, x2 =1, i;
	private Scanner dados;
	
	
	public int calculointerativo(int x) {
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
	
	public int calculoRecursivo(int x) {
		if(x == 1 || x == 2){
			return 1;
		}
		else
			return calculoRecursivo(x -1) + calculoRecursivo(x -2);
	}
	
	public int ler() {
		
		dados = new Scanner(System.in); 
			
		System.out.println("Digite n para calcular Fibonacci: ");  
		int z= dados.nextInt();  
		
		return z;
	}
	
	public void imprimir (int n){
		System.out.println("Resultado Recursivo = " + calculoRecursivo(n));
		System.out.println("Resultado Interativo = " + calculointerativo(n));
	}
	
	

}

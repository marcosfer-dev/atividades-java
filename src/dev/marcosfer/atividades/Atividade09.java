package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade09 {
	public static void main (String args[]) {
		
		/*
		 * Crie um programa em Java que peça ao usuário para digitar dois números inteiros. 
		 * Após a entrada dos valores, o programa deve exibir uma mensagem de saudação ao usuário e, 
		 * em seguida, calcular a soma dos dois números informados. O resultado da soma deve ser 
		 * mostrado na tela. Para organizar o código, utilize métodos separados: um para exibir a 
		 * saudação e outro para realizar o cálculo da soma.
		 */
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escolha um número: ");
		int a = teclado.nextInt();
		
		System.out.print("Escolha outro número: ");
		int b = teclado.nextInt();
		
		saudacao();
		somar(a, b);
		
		teclado.close();
	}
	
	static void saudacao() {
		System.out.println("Olá, seja bem-vindo");
	}
	
	static void somar(int a, int b) {		
		int soma = a + b;
		System.out.print("Resultado da soma: " + soma);
	}
}
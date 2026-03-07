package dev.marcosfer.atividades;

import java.util.Random;
import java.util.Scanner;

public class Atividade07 {
	public static void main (String[] args) {
		 /*
		 * Criar um jogo em Java em que o computador escolhe um número aleatório entre 1 e 100 e o jogador deve tentar adivinhar. 
		 * O programa deve informar, a cada palpite, se o número do jogador é maior ou menor que o número secreto e contar quantas 
		 * tentativas o jogador fez.
		 */
		
		Random aleatorio  = new Random();
		Scanner teclado = new Scanner(System.in);
		
			int numeroSecreto = aleatorio.nextInt(100);

			System.out.println("         JOGO DE ADIVINHAR O NÚMERO SECRETO      ");
			System.out.println("            ESCOLHA UM NÚMERO DE 1 A 100         ");
			System.out.println("                      BOA SORTE                  ");
			System.out.println("                                                 ");
			int numeroUsuario;
			int contador = 1;
			
				
			do {
				System.out.print("Qual número você acha que é o correto ? (1 a 100): ");
				numeroUsuario = teclado.nextInt();
				
				if(numeroUsuario == numeroSecreto) {
					System.out.println("Parabéns, você acertou o número secreto com " + contador + " tentativas");
				} else if(numeroUsuario < numeroSecreto) {
					System.out.println("O número secreto é maior, tente novamente");
					System.out.println(" ");
				} else {
					System.out.println("O número secreto é menor, tente novamente");
					System.out.println(" ");
				}
				contador++;
			} while(numeroUsuario != numeroSecreto);
			
		teclado.close();
	}
}
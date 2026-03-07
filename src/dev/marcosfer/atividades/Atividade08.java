package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade08 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcaoUsuario = 0;

		while(opcaoUsuario != 4) {
			System.out.println("\nEscolha o que você quer fazer digitando os respectivos números\n"
					+ "1 - Somar dois números\n"
					+ "2 - Mostrar números de 1 até 10\n"
					+ "3 - Verificar se um número é par ou ímpar\n"
					+ "4 - Sair\n"
					+ " ");
			
			System.out.print("O que deseja fazer ? (Escolha uma das opções do menu) ");
			opcaoUsuario = teclado.nextInt();
			
			switch(opcaoUsuario){
			case 1:
				System.out.print("Escolha um número: ");
				int numero1 = teclado.nextInt();
				System.out.print("Escolha mais um número: ");
				int numero2 = teclado.nextInt();
				int soma = numero1 + numero2;
				System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);
			break;
			case 2:
				for (int i = 1; i <= 10; i++) {
			    System.out.println(i);
			}
			break;
			case 3: 
				System.out.print("Escolha um número: ");
				int verificacaoParImpar = teclado.nextInt();
				
				if(verificacaoParImpar % 2 == 0) {
					System.out.println("O número " + verificacaoParImpar + " é par");
				} else {
					System.out.println("O número " + verificacaoParImpar + " é ímpar");
				}
			break;
			case 4: 
				System.out.print("Sistema finalizado...");
			break;
			default:
				System.out.println("Você digitou um número errado, tente novemente");
		  }
		}
		teclado.close();
	}
}
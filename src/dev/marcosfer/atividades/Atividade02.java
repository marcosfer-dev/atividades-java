package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade02 {
	public static void main (String[] args) {
		/* Desenvolva um programa em Java que simule um quiz interativo no console.
		 * O sistema deve apresentar ao usuário pelo menos 3 perguntas de múltipla escolha. 
		 * Cada pergunta deve conter alternativas (A, B, C ou D), e o usuário deve digitar 
		 * a opção que considera correta.
		*/
		
		System.out.println("-----------------------------");
		System.out.println("  SEJA BEM-VINDO(A) AO QUIZ  ");
		System.out.println("-----------------------------");
		System.out.println(" ");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("1) Qual é o método principal responsável por iniciar a execução de um programa em Java?\n"
				+ "\n"
				+ "A) start()\n"
				+ "B) run()\n"
				+ "C) main()\n"
				+ "D) init()");
		System.out.print("Digite a alternativa (em letra maiúscula): ");
		String alternativaUsuario1 = teclado.nextLine();
		
		String respostaCorreta1 = "C";
		
		if(alternativaUsuario1.equals(respostaCorreta1)) {
			System.out.println("Resposta correta");
		} else {
			System.out.println("Resposta incorreta");
		}

		System.out.println(" ");
		System.out.println("2) Qual dos tipos abaixo é utilizado para armazenar números com casas decimais em Java?\n"
				+ "\n"
				+ "A) int\n"
				+ "B) double\n"
				+ "C) boolean\n"
				+ "D) char");
		System.out.print("Digite a alternativa (em letra maiúscula): ");
		String alternativaUsuario2 = teclado.nextLine();
		
		String respostaCorreta2 = "B";
		
		if(alternativaUsuario2.equals(respostaCorreta2)) {
			System.out.println("Resposta correta");
		} else {
			System.out.println("Resposta incorreta");
		}

		System.out.println(" ");
		System.out.println("3) Qual estrutura é utilizada para tomar decisões baseadas em condições em Java?\n"
				+ "\n"
				+ "A) for\n"
				+ "B) while\n"
				+ "C) if\n"
				+ "D) import");
		System.out.print("Digite a alternativa (em letra maiúscula): ");
		String alternativaUsuario3 = teclado.nextLine();
		
		String respostaCorreta3 = "C";
		
		if(alternativaUsuario3.equals(respostaCorreta3)) {
			System.out.println("Resposta correta");
		} else {
			System.out.println("Resposta incorreta");
		}
		
		teclado.close();
		
	}
}
package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade04 {
	public static void main (String[] args) {
		/*Utilizando a Atividade 01 como base, desenvolva uma nova versão do programa que corrija as falhas existentes, 
		 * permitindo que o usuário possa revisar e alterar seus dados antes da confirmação final do cadastro.
		 */

			Scanner teclado = new Scanner(System.in);
				
				int escolha = 0;
				
				do {
					System.out.println("Digite um nome de usuário (Não utilizar o próprio nome) ");
					String nome = teclado.nextLine();
				
					System.out.println("Qual é a sua idade? ");
					int idade = teclado.nextInt();
					teclado.nextLine(); 
					
					System.out.println("Digite a senha que deseja cadastrar: ");
					String senha = teclado.nextLine();
					
					System.out.print("\nOs seus dados estão corretos?"
							+ "\nDeseja criar a conta? (1 para Sim, 2 para Não): ");
					escolha = teclado.nextInt();
					teclado.nextLine();
					
					switch(escolha) {
					case 1: 				
						System.out.printf("Conta criada com sucesso!"
								+ "\nNome de usuário: %s"
								+ "\nSua idade: %d anos"
								+ "\nSua senha: %s", nome, idade, senha);
						break;
					case 2: 	
						System.out.println("--- Reiniciando cadastro ---"
								+ "\nInsira novamentes os dados que deseja: ");
						break;
					default : System.out.println("Opção inválida, tente novamente");
					    break;
				}
					
				} while(escolha != 1);

					
			teclado.close();
	}
}
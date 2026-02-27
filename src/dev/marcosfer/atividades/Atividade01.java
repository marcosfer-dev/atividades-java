package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade01 {
	public static void main (String[] args) {
		//// Crie um programa simulando um cadastro com nome de usuário, a idade e a senha que o usuário deseja cadastrar

			Scanner teclado = new Scanner(System.in);
			
				System.out.print("Digite um nome de usuário (Não utilizar o próprio nome) ");
				String nome = teclado.nextLine();
			
				System.out.print("Qual é a sua idade? ");
				int idade = teclado.nextInt();
				teclado.nextLine(); 
				
				System.out.print("Digite a senha que deseja cadastrar: ");
				String senha = teclado.nextLine();
				
				System.out.println();
				
				System.out.printf("Conta criada com sucesso!"
						+ "\nNome de usuário: %s"
						+ "\nSua idade: %d anos"
						+ "\nSua senha: %s", nome, idade, senha);
					
			teclado.close();
	}
}
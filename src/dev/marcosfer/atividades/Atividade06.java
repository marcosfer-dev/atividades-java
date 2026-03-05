package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade06 {
	public static void main(String args[]) {
		/* Usando o sistema base da Atividade 05, atualize com: 
		 *   		 
		 * O programa deverá permitir cadastrar vários alunos,
		 * perguntando ao final de cada cadastro se deseja continuar.
		 * 
		 * Ao encerrar, o sistema deverá exibir:
		 * - A quantidade total de alunos cadastrados;
		 * - A média geral da turma.
		 */
			
			Scanner teclado = new Scanner(System.in);
	
				System.out.print("Adicionar o aluno (Aperte 1) ");
				int adicionarAluno = teclado.nextInt();
				teclado.nextLine();
				
				int contador = 0;
		        double somaMedias = 0;
		        
				do {
					
					System.out.print("Qual o nome do aluno ? ");
					String nomeAluno = teclado.nextLine();
					
					System.out.print("Quanto o aluno tirou na primeira prova ? ");
					double notaAluno1 = teclado.nextDouble();
					teclado.nextLine();
					
					System.out.print("Quanto o aluno tirou na segunda prova ? ");
					double notaAluno2 = teclado.nextDouble();
					teclado.nextLine();
					
					double media = (notaAluno1 + notaAluno2) / 2;
					System.out.println("A média do aluno " + nomeAluno + " é " + media);
					
					if(media >= 7) {
						System.out.println("O aluno " + nomeAluno + " está aprovado");
					} else if(media >= 5 && media < 7) {
						System.out.println("O aluno " + nomeAluno + " está de recuperação");
					} else {
						System.out.println("O aluno " + nomeAluno + " está reprovado");
					}
					contador++;
					somaMedias += media;
					
					System.out.print("Você quer adicionar um aluno (0 para NÃO/ 1 para SIM): ");
					adicionarAluno = teclado.nextInt();
					teclado.nextLine();
				}while(adicionarAluno == 1);
				
				double mediaGeral = somaMedias / contador;
				
		        System.out.println("Total de alunos cadastrados: " + contador);
		        System.out.println("Média geral da turma: " + mediaGeral);
				
			teclado.close();
		
	}
}
package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade05 {
	public static void main(String args[]) {
		/* Desenvolva um programa que permita cadastrar as notas de vários alunos.
		 * O sistema deverá:
		 * - Solicitar o nome do aluno;
		 * - Solicitar duas notas;
		 * - Calcular a média do aluno;
		 * - Informar se ele está Aprovado (média >= 7),
		 *   Recuperação (média entre 5 e 6.9) ou Reprovado (média < 5).
		 */
	
		Scanner teclado = new Scanner(System.in);

			System.out.print("Qual o nome do aluno ? ");
			String nomeAluno = teclado.nextLine();
			
			System.out.print("Quanto o aluno tirou na primeira prova ? ");
			double notaAluno1 = teclado.nextDouble();
			
			System.out.print("Quanto o aluno tirou na segunda prova ? ");
			double notaAluno2 = teclado.nextDouble();
			
			double media = (notaAluno1 + notaAluno2) / 2;
			System.out.println("A média do aluno " + nomeAluno + " é " + media);
			
			if(media >= 7) {
				System.out.print("O aluno " + nomeAluno + " está aprovado");
			} else if(media > 5 && media < 7) {
				System.out.print("O aluno " + nomeAluno + " está de recuperação");
			} else {
				System.out.print("O aluno " + nomeAluno + " está reprovado");
			}
		
		teclado.close();

	}
	
}
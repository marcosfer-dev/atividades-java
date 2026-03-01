package dev.marcosfer.atividades;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		/*Desenvolva um programa em Java que solicite ao usuário um número inteiro. 
		 * O sistema deve verificar se o número é par ou ímpar e também informar se 
		 * ele é positivo, negativo ou igual a zero. Ao final, o programa deve exibir 
		 * as classificações correspondentes ao número digitado.*/
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Digite um número: ");
			int numeroUsuario = sc.nextInt();
			
			if(numeroUsuario % 2 == 0) {
				if(numeroUsuario == 0) {
					System.out.print("O número " + numeroUsuario + " é igual a zero");
				} else if(numeroUsuario > 0) {
					System.out.print("O número " + numeroUsuario + " é par e positivo");
				} else {
					System.out.print("O número " + numeroUsuario + " é par e negativo");
				}
			} else {
				if(numeroUsuario > 0) {
					System.out.print("O número " + numeroUsuario + " é impar e positivo");
				} else {
					System.out.print("O número " + numeroUsuario + " é impar e negativo");
				}
			} 
		
		sc.close();
		
	}
}
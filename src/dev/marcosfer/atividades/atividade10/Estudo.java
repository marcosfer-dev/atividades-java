package dev.marcosfer.atividades.atividade10;

public class Estudo {
	int tempoDeDuracaoEstudo;
	String disciplinaDeEstudo;
	int quantidadeExercicios;
	String material;
	void status() {
		System.out.print("Irei estudar " + this.disciplinaDeEstudo
				+ "\nVou estudar por " + this.tempoDeDuracaoEstudo + " horas"
				+ "\nE fazer " + this.quantidadeExercicios + " exercícios");
	}
	
	void terminarEstudo() {
		if(this.tempoDeDuracaoEstudo == 0 && this.quantidadeExercicios == 0) {
			System.out.print("\nTerminei de estudar");
		} else {
			System.out.print("\nEstou estudando");
		}
	}
	
	void escrever() {
		if(material.equals("Caderno")) {
			System.out.print("\nEstou anotando");
		} else if(material.equals("Computador")) {
			System.out.print("\nEstou digitando");
		} else {
			System.out.print("\nEstou só assistindo a aula");
		}
	}
	
}
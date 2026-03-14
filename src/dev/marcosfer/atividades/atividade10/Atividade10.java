package dev.marcosfer.atividades.atividade10;

public class Atividade10 {
	public static void main (String args[]) {
		/* 
		 * Primeira atividade minha de POO onde crio uma classe Estudos,
		 * contendo métodos e atributos
		*/
		
		Estudo n1 = new Estudo();
		n1.tempoDeDuracaoEstudo = 2;
		n1.quantidadeExercicios = 10;
		n1.disciplinaDeEstudo = "Matemática";
		n1.material = "Caderno";
		
		n1.status();
		n1.escrever();
		n1.terminarEstudo();
	}
}
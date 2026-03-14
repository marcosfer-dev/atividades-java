package dev.marcosfer.atividades.atividade11;

public class Estudo {
	private int tempoDeDuracaoEstudo;
	private String disciplinaDeEstudo;
	private int quantidadeExercicios;
	private String material;
	
	public Estudo(int tempo, String disciplina, int quantidade, String materiais) {
		this.tempoDeDuracaoEstudo = tempo;
		this.disciplinaDeEstudo = disciplina;
		this.quantidadeExercicios = quantidade;
		this.material = materiais;
	}
	
	public int getTempoDeDuracaoEstudo() {
		return this.tempoDeDuracaoEstudo;
	}
	
	public String getDisciplinaDeEstudo() {
		return this.disciplinaDeEstudo;
	}
	
	public void setTempoDeDuracaoEstudo(int t) {
		 this.tempoDeDuracaoEstudo = t;
	}
	
	public void setMaterial(String m) {
		 this.material = m;
	}
	
	public void escrever() {
		if(material.equals("Caderno")) {
			System.out.print("\nEstou anotando");
		} else if(material.equals("Computador")) {
			System.out.print("\nEstou digitando");
		} else {
			System.out.print("\nEstou só assistindo a aula");
		}	
	}
	
	public void terminarEstudo() {
		if(this.tempoDeDuracaoEstudo == 0 && this.quantidadeExercicios == 0) {
			System.out.print("\nTerminei de estudar");
		} else {
			System.out.print("\nEstou estudando");
		}
	}
	
	public void status() {
		System.out.print("Irei estudar " + this.disciplinaDeEstudo
				+ "\nVou estudar por " + this.tempoDeDuracaoEstudo + " horas"
				+ "\nE fazer " + this.quantidadeExercicios + " exercícios");
	}
	
}
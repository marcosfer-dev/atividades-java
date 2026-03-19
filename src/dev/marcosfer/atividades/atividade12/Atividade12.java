package dev.marcosfer.atividades.atividade12;

public class Atividade12 {
    public static void main(String args[]) {
        Banco p1 = new Banco();

        p1.setNumConta(1111);
        p1.setDono("Fulano");
        p1.abrirConta("CC");

        p1.depositar(100);
        p1.sacar(30);
        p1.pagarMensal();

        p1.estadoAtual();

        Banco p2 = new Banco();

        p2.setNumConta(2222);
        p2.setDono("Fulana");
        p2.abrirConta("CP");

        p2.depositar(200);
        p2.sacar(50);
        p2.pagarMensal();

        p2.estadoAtual();
    }
}
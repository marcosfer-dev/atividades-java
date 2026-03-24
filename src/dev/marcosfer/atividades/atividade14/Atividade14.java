package dev.marcosfer.atividades.atividade14;

public class Atividade14 {
    public static void main(String[] args) {
        Lutador l1 = new Lutador(
                "Fulano",
                "França",
                28,
                1.85f,
                68.9f,
                11,
                2,
                1
        );

        l1.apresentar();
        System.out.println(" ");
        l1.status();
    }
}

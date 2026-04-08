package dev.marcosfer.atividades.atividade19;

public class Atividade19 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Olá");
        c.reagir("NÃOO");

        c.reagir(11,45);
        c.reagir(19,00);

        c.reagir(true);
        c.reagir(false);

        c.reagir(17, 4.5f);
    }
}

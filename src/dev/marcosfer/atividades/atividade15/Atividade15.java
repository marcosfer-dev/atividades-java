package dev.marcosfer.atividades.atividade15;

public class Atividade15 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l [0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                68.9f, 11, 2, 1);

        l [1] = new Lutador("Script", "Brasil", 29, 1.68f,
                57.8f, 14, 2, 3);

        l[2] = new Lutador("Crusher", "EUA", 35, 1.90f,
                92.3f, 20, 5, 2);

        l[3] = new Lutador("Ninja", "Japão", 27, 1.72f,
                65.4f, 18, 3, 1);

        l[4] = new Lutador("Viking", "Noruega", 33, 1.85f,
                88.7f, 16, 4, 0);

        l[5] = new Lutador("El Toro", "México", 30, 1.78f,
                79.2f, 13, 6, 2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        l[0].status();
        l[1].status();
        UEC01.lutar();
    }
}

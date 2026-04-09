package dev.marcosfer.atividades.atividade18;

public class Atividade18 {
    public static void main (String[] args) {
        //POO Sobreposição

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra i = new Cobra();
        Tarturuga t = new Tarturuga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();

        c.locomover();
        k.locomover();
        k.emitirSom();
        c.emitirSom();
    }
}

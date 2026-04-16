package dev.marcosfer.atividades.atividade21;

public class Atividade21 {
    public static void main(String[] args) {
        //Ao terminar o curso de POO, vejo a necessidade em colocar tudo em prática, essa atividade é para isso,
        // pretendo utilizar tudo o que eu vi em aula, mesmo que não seja necessário, mas apenas para treinar e aprender!!

        Produtos p1 = new Produtos("Maçã", "Hortifruti", 0, 15.0f, 1000, 150.0f);
        p1.adicionarEstoque(500);
        System.out.println(p1);
        p1.diminuirEstoque(200);
        p1.aumentarPreco(2f);
        p1.calculoDesconto();
        System.out.println(p1);
        System.out.println(" ");

        Funcionario f1 = new Funcionario("Marcos", "123", "M", Funcionario.Cargo.ESTOQUISTA, 1200f, "00001");
        f1.exibirDados();
        f1.limparMercado();
        f1.organizarEstoque();
    }
}
package dev.marcosfer.atividades.atividade21;

public class Produtos {
    //Atributos
    private String nome;
    private String tipo;
    private int estoque;
    private float preco;
    private int cod;
    private float peso;

    //Construtor (Metodo Especial)
    public Produtos(String nome, String tipo, int estoque, float preco, int cod, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.estoque = estoque;
        this.preco = preco;
        this.cod = cod;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", cod=" + cod +
                ", peso=" + peso +
                '}';
    }

    //Métodos
    public void adicionarEstoque(int valor) {
        setEstoque(getEstoque() + valor);
    }

    public void diminuirEstoque(int valor) {
        setEstoque(getEstoque() - valor);
    }

    public void aumentarPreco(float valor) {
        setPreco(getPreco() + valor);
    }

    public void diminuirPreco(float valor) {
        setPreco(getPreco() - valor);
    }

    public void calculoDesconto() {
        float desconto;
        switch (tipo) {
            case "Hortifruti":
                desconto = preco * 0.15f;
                preco = preco - desconto;
                break;
            case "Carne":
                desconto = preco * 0.35f;
                preco = preco - desconto;
                break;
            case "Laticinio":
                desconto = preco * 0.5f;
                preco = preco - desconto;
                break;
            case "Mercearia":
                preco = preco;
                break;
            default:
                System.out.println("Tipo não cadastrado");
        }
    }



    //Métodos Especiais Getters e Setters
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int e) {
        this.estoque = e;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float pre) {
        this.preco = pre;
    }
}

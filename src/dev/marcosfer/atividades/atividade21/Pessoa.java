package dev.marcosfer.atividades.atividade21;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String cpf, String sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome
                + "\nCPF: "+ cpf
                + "\nSexo: " + sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
}
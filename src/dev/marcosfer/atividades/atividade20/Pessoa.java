package dev.marcosfer.atividades.atividade20;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencias;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencias = 0;
    }

    protected void ganharExperiencia() {
        this.experiencias++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(float experiencias) {
        this.experiencias = experiencias;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencias=" + experiencias +
                '}';
    }
}

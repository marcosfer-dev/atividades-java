package dev.marcosfer.atividades.atividade17;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento() {
        setSalario(getSalario() + 500);
        System.out.println(getNome() + " Recebeu um aumento de R$500, novo salário: R$" + getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

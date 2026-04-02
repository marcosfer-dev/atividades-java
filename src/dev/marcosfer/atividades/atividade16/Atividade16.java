package dev.marcosfer.atividades.atividade16;

public class Atividade16 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Pedro");
        p1.setIdade(26);
        p1.setSexo("M");

        System.out.println(p1.toString());

        Aluno p2 = new Aluno();
        p2.setNome("Maria");
        p2.setIdade(18);
        p2.setSexo("F");

        p2.setCurso("Informática");
        System.out.println(p2.toString());

        Professor p3 = new Professor();
        p3.setNome("Cláudio");
        p3.setIdade(54);
        p3.setSexo("M");

        p3.setSalario(2500.75f);
        System.out.println(p3.toString());

        Funcionario p4 = new Funcionario();
        p4.setNome("Fabiana");
        p4.setIdade(38);
        p4.setSexo("F");

        p4.setSetor("Estoque");
        System.out.println(p4.toString());
    }
}

package dev.marcosfer.atividades.atividade17;

public class Atividade17 {
    public static void main (String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println(" ");

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        System.out.println(" ");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.setIdade(19);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        System.out.println(" ");

        Professor pro1 = new Professor();
        pro1.setNome("Adriana");
        pro1.setIdade(38);
        pro1.setSexo("F");
        System.out.println(pro1.toString());
        pro1.setSalario(2600);
        pro1.receberAumento();
        System.out.println(" ");

        Tecnico t1 = new Tecnico();
        t1.setNome("Isabela");
        t1.setIdade(21);
        t1.setSexo("F");
        t1.setRegistroProfissional(1592);
        t1.setCurso("Análise e Desenvolimento de Sistemas");
        t1.praticar();
        System.out.println(t1.toString());
    }
}
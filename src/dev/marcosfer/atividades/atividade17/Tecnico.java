package dev.marcosfer.atividades.atividade17;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar() {
        System.out.println("O aluno " + getNome() + " está práticando o que foi ensinado na aula");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}

package dev.marcosfer.atividades.atividade21;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String cpf, String sexo, Cargo cargo, float salario, String registroFuncionario) {
        super(nome, cpf, sexo);
        this.cargo = cargo;
        this.salario = salario;
        this.registroFuncionario = registroFuncionario;
    }

    private String registroFuncionario;
    private Cargo cargo;
    private float salario;

    @Override
    public void exibirDados() {
        System.out.println("Funcionário");
        super.exibirDados();
        System.out.println("Cargo: " + cargo
                + "\nSalário: " + salario
                + "\nNumero de Registro: " + registroFuncionario);
    }

    public enum Cargo {
        CAIXA,
        REPOSITOR,
        ESTOQUISTA,
        GERENTE,
        FAXINEIRO;

        public boolean podeOrganizarEstoque() {
            return this == ESTOQUISTA || this == REPOSITOR;
        }

        public boolean podeLimpar() {
            return this == FAXINEIRO || this == ESTOQUISTA || this == REPOSITOR;
        }


        public boolean podeAuxiliarCliente() {
            return this == GERENTE || this == CAIXA || this == ESTOQUISTA || this == REPOSITOR;
        }
    }

    //Metodos assim funcionam mas é grande e com risco de erro
    /*
    public void organizarEstoque() {
        if (cargo == Cargo.ESTOQUISTA || cargo == Cargo.REPOSITOR) {
            System.out.println("Organizando estoque...");
        } else {
            System.out.println("Você não pode organziar estoque");
        }
    }

    public void limparMercado() {
        if (cargo == Cargo.FAXINEIRO) {
            System.out.println("Limpando mercado...");
        } else if (cargo == Cargo.ESTOQUISTA || cargo == Cargo.REPOSITOR) {
            System.out.println("Auxiliando na limpeza");
        } else {
            System.out.println("Não limpo o mercado");
        }
    }

    public void auxiliarCliente() {
        if (cargo == Cargo.GERENTE || cargo == Cargo.CAIXA || cargo == Cargo.ESTOQUISTA || cargo == Cargo.REPOSITOR) {
            System.out.println("Auxiliando cliente");
        }
    }
     */

    public void aumentarSalario() {

    }

    public void diminuirSalario() {

    }

    public void organizarEstoque() {
        if (cargo.podeOrganizarEstoque()) {
            System.out.println("Organizando estoque...");
        } else {
            System.out.println("Você não pode organizar estoque");
        }
    }

    public void limparMercado() {
        if (cargo == Cargo.FAXINEIRO) {
            System.out.println("Limpando mercado...");
        } else if (cargo.podeLimpar()) {
            System.out.println("Auxiliando na limpeza");
        } else {
            System.out.println("Não limpo o mercado");
        }
    }

    public void auxliarCliente() {
        if (cargo.podeAuxiliarCliente()) {
            System.out.println("Auxiliando cliente");
        } else {
            System.out.println("Chamar outro funcionário");
        }
    }

//    public void acabouExpediente() {
//
//    }

    public String getRegistroFuncionario() {
        return registroFuncionario;
    }

    public void setRegistroFuncionario(String registroFuncionario) {
        this.registroFuncionario = registroFuncionario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}

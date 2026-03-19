package dev.marcosfer.atividades.atividade12;

public class Banco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------");
    }

    // Métodos Específicos

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t.equals("CP")) {
            this.setSaldo(150);
        } else if (t.equals("CC")) {
            this.setSaldo(50);
        } else {
            System.out.println("Escolha o tipo CP ou CC");
            return;
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, não é possível fechar");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, pague primeiro");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar de conta fechada");
        }
    }

    public void pagarMensal() {
        int v = 0;

        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Conta fechada, não pode pagar");
        }
    }

    // Construtor (CORRETO)
    public Banco() {
        this.saldo = 0;
        this.status = false;
    }

    // Getters e Setters

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int c) {
        this.numConta = c;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean sta) {
        this.status = sta;
    }
}
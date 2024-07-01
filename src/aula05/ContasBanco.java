package aula05;

public class ContasBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    public float saldoConta;
    private boolean statusConta;

    public ContasBanco() {
        this.saldoConta = 0;
        this.statusConta = false;
    }

    public void estadoAtual() {
        System.out.println("================================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Conta: " + this.getTipoConta());
        System.out.println("Conta: " + this.getDonoConta());
        System.out.println("Conta: " + this.getSaldoConta());
        System.out.println("Conta: " + this.isStatusConta());
    }

    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        if (tipoConta.equals("CC")) {
            this.setSaldoConta(50);
        } else if (tipoConta == "CP") this.setSaldoConta(150);
    }

    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.isStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDonoConta());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float valor) {
        if (this.isStatusConta()) {
            if (this.getSaldoConta() >= valor) {
                this.setSaldoConta(this.getSaldoConta() - valor);
                System.out.println("Saque realizado na conta de " + this.getDonoConta());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        int valor = 0;
        if (this.getTipoConta() == "CC") {
            valor = 12;
        } else if (this.getTipoConta() == "CP") {
            valor = 20;
        }

        if (this.isStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() - valor);
            System.out.println("Mensalidade paga com sucesso por " + this.getDonoConta());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }


}
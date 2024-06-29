package aula05;

public class ContasBanco {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    public float saldoConta;
    private boolean statusConta;

    public ContasBanco() {
        statusConta = false;
        saldoConta = 0;
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

    public void abrirConta(String tipoConta) {
        setTipoConta(tipoConta);
        setStatusConta(true);
        if (tipoConta == "CC") {
            setSaldoConta(50);
        } else if (tipoConta == "CP") {
            setSaldoConta(150);
        }
    }

    public void fecharConta() {
        if (saldoConta > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldoConta < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatusConta(false);
        }
    }

    public void depositar(float valor) {
        if (statusConta) {
            setSaldoConta(getSaldoConta() + valor);
        } else {
            System.out.println("Impossivel Depositar");
        }
    }

    public int sacar(float valor) {
        if (statusConta) {
            if (saldoConta >= valor) {
                setSaldoConta(getSaldoConta() - valor);
                return 1; // Sucesso
            } else {
                System.out.println("Saldo insuficiente");
                return 0; // Falha
            }
        } else {
            System.out.println("Impossível sacar");
            return -1; // Falha
        }
    }

    public void pagarMensal() {
        float valor = 0;
        if (tipoConta == "CC") {
            valor = 12;
        } else if (tipoConta == "CP") {
            valor = 20;
        }

        if (statusConta) {
            if (saldoConta > valor) {
                setSaldoConta(getSaldoConta() - valor);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
}
package aula06.TesteIndivual;

public class MaquinaDeLavar implements ControlarMaq {
    private int modo;
    private int tipo;
    private boolean ligado;
    private boolean roupas;
    private boolean tampada;

    public MaquinaDeLavar() {
        this.ligado = false;
        this.roupas = false;
        this.tampada = true;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean getRoupas() {
        return roupas;
    }

    public void setRoupas(boolean roupas) {
        this.roupas = roupas;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }


    @Override
    public void ligar(int modo, int tipo) {
        if (this.tampada && this.roupas) {
            if (modo >= 1 && modo <= 5 && tipo >= 1 && tipo <= 5) {
                setModo(modo);
                setTipo(tipo);
                setLigado(true);
                System.out.println("Iniciando a lavagem...");
            } else {
                System.out.println("Opção Inválida.");
            }
        } else {
            System.out.println("Você precisa tampar e colocar as roupas antes de ligar!");
        }
    }

    @Override
    public void mensagensLavagem() {
        if (this.tampada) {
            System.out.println("Escolha as opções abaixo: ");

            System.out.println("\nEscolha o Modo de Lavagem: ");
            System.out.println("[1] - Molho Curto");
            System.out.println("[2] - Molho Longo");
            System.out.println("[3] - Turbo");
            System.out.println("[4] - Enxaguar");
            System.out.println("[5] - Centrifugar\n");

            System.out.println("\nEscolha o Tipo de Lavagem: ");
            System.out.println("[1] - Pouco Suja");
            System.out.println("[2] - Suja");
            System.out.println("[3] - Muito Suja");
            System.out.println("[4] - Cobertor");
            System.out.println("[5] - Cama e Banho\n");
        } else {
            System.out.println("Tampe a máquina antes de escolher as opções!");
        }
    }

    @Override
    public void menuGeral() {
        System.out.println("\n---- MÁQUINA DE LAVAR ----");
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Tem roupas: " + this.roupas);
        System.out.println("Modo de Lavagem : " + this.modo);
        System.out.println("Tipo de Lavagem : " + this.tipo);
        System.out.println("Ligada: " + this.ligado);
    }
}

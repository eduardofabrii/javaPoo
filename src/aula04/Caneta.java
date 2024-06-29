package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean getTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void tampar() {
        tampada = true;
    }

    public void destampar() {
        tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Cor: " + this.cor);

    }
}

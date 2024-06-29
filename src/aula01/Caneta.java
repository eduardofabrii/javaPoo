package aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada, não é possivel rabiscar!");
        } else {
            System.out.println("Rabiscado com sucesso!");
        }
    }

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}

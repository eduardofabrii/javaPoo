package aula01;

public class ChamandoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        System.out.println("Caneta 01");
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;

        c1.status();
        c1.destampar();
        c1.rabiscar();

        System.out.println();

        System.out.println("Caneta 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Teste";
        c2.cor = "Transparente";
        c2.ponta = 1f;
        c2.tampada = true;

        c2.status();
        c2.tampar();
        c2.rabiscar();
    }
}

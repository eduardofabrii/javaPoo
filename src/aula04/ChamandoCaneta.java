package aula04;

public class ChamandoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", .7f, true, "Azul");

        c1.destampar();
        System.out.println(c1.getPonta());
        c1.setPonta(0.111f);

        c1.status();
    }
}

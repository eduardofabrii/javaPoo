package aula01;

public class ChamandoGarrafa {
    public static void main(String[] args) {
        Garrafa g1 = new Garrafa();

        g1.cor = "Roxa";
        g1.frase = "It's a good day to be happy";
        g1.corda = true;
        g1.tamanho = "Grande";
        g1.canudo = true;
        g1.tampada = true;

        g1.status();
        g1.tampar();
        g1.tomar();

        System.out.println();

        Garrafa g2 = new Garrafa();

        g2.cor = "Roxa";
        g2.frase = "It's a good day to be happy";
        g2.corda = true;
        g2.tamanho = "Grande";
        g2.canudo = true;
        g2.tampada = false;

        g2.status();
        g2.destampar();
        g2.tomar();
    }
}

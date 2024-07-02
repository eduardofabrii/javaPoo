package aula07e08;

public class MainLutas {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[5];
        lutadores[0] = new Lutador("Poatan", "França", 31, 1.75f, 108.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Anderson", "Brasil", 42, 1.85f, 86.9f, 18, 0, 0);
        lutadores[2] = new Lutador("Martelo", "Bélgica", 25, 1.92f, 108.2f, 13, 1, 0);
        lutadores[3] = new Lutador("Minotauro", "Rússia", 29, 1.76f, 69.2f, 7, 3, 2);
        lutadores[4] = new Lutador("McGregor", "Suiça", 30, 1.93f, 110.1f, 12, 1, 1);

        /* for (Lutador lutador: lutadores) {
            lutador.apresentar();
            lutador.status();
        } */

        Duelos UEC = new Duelos();
        UEC.marcarLuta(lutadores[0], lutadores[2]);
        UEC.lutar();

        lutadores[0].status();
        lutadores[2].status();



    }
}

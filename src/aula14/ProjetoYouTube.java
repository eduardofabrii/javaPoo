package aula14;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Dev Routine #001");
        v[2] = new Video("Morando em Paris - Daily 07");

        User u[] = new User[2];
        u[0] = new User("Eduardo", 17, "Masculino", "Dudu");
        u[1] = new User("Graziele", 18, "Feminino", "Gra");

        System.out.println(u[1].toString());
        System.out.println(u[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(u[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());




    }
}

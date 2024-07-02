package aula09;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Eduardo", 17, "M");
        p[1] = new Pessoa("Grazi", 17, "F");

        l[0] = new Livro("Arte da Guerra", "Pedro Goncalves", 350, p[0]);
        l[1] = new Livro("Biblia", "Deus", 3000, p[1]);

        l[0].abrir();
        l[0].folhear(330);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());
    }
}

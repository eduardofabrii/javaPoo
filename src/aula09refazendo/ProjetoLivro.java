package aula09refazendo;

public class ProjetoLivro{
    public static void main(String[] args) {
        Livro l[] = new Livro[3];
        Pessoa p[] = new Pessoa[2];

        p[0] = new Pessoa("Eduardo", 17, "Masculino");
        p[1] = new Pessoa("Graziele", 17, "Feminino");

        l[0] = new Livro("As tranças de um carecaa", "João", 15, p[0]);
        l[1] = new Livro("Skinie Marine", "Unknown", 300, p[1]);

        l[0].abrir();
        l[0].folhear(0);
        p[0].fazerAniver();
        for (int c = 1; c < 15; c++) {
            l[0].avancar();
        }
        System.out.println(l[0].detalhes());
    }
}

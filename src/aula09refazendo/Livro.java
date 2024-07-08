package aula09refazendo;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String detalhes() {
        return  "==== LIVRO ====   " + "\nTitulo: '" + titulo + '\'' +
                "\nAutor: '" + autor + '\'' + " | Total de Paginas: " + totPaginas +
                "\nPagina Atual: " + pagAtual + " | Aberto: " + aberto +
                "\nLeitor: " + leitor.getNome() + " | Idade: " + leitor.getIdade() + " | Sexo: " + leitor.getSexo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (this.totPaginas < pagina) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void voltar() {
        this.pagAtual--;
    }

    @Override
    public void avancar() {
        if (this.pagAtual < this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual++;
        }
    }
}

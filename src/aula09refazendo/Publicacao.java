package aula09refazendo;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void voltar() ;
    public abstract void avancar();
}

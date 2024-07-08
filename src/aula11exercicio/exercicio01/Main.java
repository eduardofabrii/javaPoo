package aula11exercicio.exercicio01;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Veiculo v1 = new Veiculo();

        c1.setNumeroDePortas(4);
        v1.setAno(2012);
        v1.setMarca("Fiat");
        v1.setModelo("Palio");
        v1.exibirDetalhes();
        c1.exibirDetalhes();
    }
}

package aula11exercicio.exercicio01;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String exibirDetalhes() {
        System.out.printf("Número de Portas: %d%n", numeroDePortas);
        return super.exibirDetalhes();
    }
}

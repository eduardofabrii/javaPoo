package aula05;

public class Banco {
    public static void main(String[] args) {

        ContasBanco p1 = new ContasBanco();
        p1.setNumConta(821934);
        p1.setDonoConta("Eduardo");
        p1.abrirConta("CC");

        ContasBanco p2 = new ContasBanco();
        p2.setNumConta(134512);
        p2.setDonoConta("Graziele");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(200);

        p1.estadoAtual();
        p2.estadoAtual();

        p1.fecharConta();
    }
}

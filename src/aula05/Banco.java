package aula05;

public class Banco {
    public static void main(String[] args) {
        ContasBanco c1 = new ContasBanco();


        c1.abrirConta("CC");
        System.out.println(c1.getSaldoConta());
        c1.depositar(3);
        System.out.println(c1.getSaldoConta());
        System.out.println(c1.isStatusConta());

        c1.sacar(53);
        System.out.println(c1.getSaldoConta());
        c1.fecharConta();
        System.out.println(c1.isStatusConta());
    }
}

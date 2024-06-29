package aula01;
import java.util.Scanner;

public class Garrafa {
    String cor;
    String frase;
    boolean corda;
    String tamanho;
    boolean canudo;
    boolean tampada;

    void ler() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Você deseja destampar [S/N]: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("S")) {
            System.out.println("Tomando...");
        } else if (input.equalsIgnoreCase("N")) {
            System.out.println("Não é possivel tomar, por a garrafa está tampada!");
        } else {
            System.out.println("Opção Inválida.");
        }
    }

    void tomar() {
        if (this.tampada == true) {
            this.ler();
        } else if (this.tampada == false) {
            System.out.println("Tomando...");
        }
    }

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Frase: " + this.frase);
        System.out.println("Tem corda: " + this.corda);
        System.out.println("Tem canudo: " + this.canudo);
        System.out.println("Está tampada: " + this.tampada);
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}

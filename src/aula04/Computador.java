package aula04;

import java.util.Scanner;

public class Computador {
    private int ComputadorOff = 0;
    private int leds; // 0 = off & 1 = on.
    private int ligado; // 0 = off & 1 = on.
    private String teclado_conectado;
    private String mouse_conectado;
    private String fone_conectado;
    private String monitor_conectado;

    public Computador(int computadorOff) {
        Scanner ligando = new Scanner(System.in);
        if (this.ligado == 0) {
            System.out.println("O computador está desligado");
            System.out.print("Para ligar digite '1': ");
            int armazenarMsg = Integer.parseInt(ligando.nextLine());
            if (armazenarMsg == 1) {
                System.out.println("Ligando...\n");
                this.ligado = 1;
                this.leds = 1;
                this.teclado_conectado = "Conectado";
                this.mouse_conectado = "Conectado";
                this.fone_conectado = "Conectado";
                this.monitor_conectado = "Conectado";
            } else {
                System.out.println("Computador Desligado\n");
            }
        }
    }

    // printarTeste: função criada para testar se as variaveis estão corretas
    public void printarTeste() {
        System.out.println(ligado);
    }

    public int getLeds() {
        return leds;
    }

    public void setLeds(int leds) {
        this.leds = leds;
    }

    public int getLigado() {
        return ligado;
    }

    public void setLigado(int ligado) {
        this.ligado = ligado;
    }

    public String getTeclado_conectado() {
        return teclado_conectado;
    }

    public void setTeclado_conectado(String teclado_conectado) {
        this.teclado_conectado = teclado_conectado;
    }

    public String getMouse_conectado() {
        return mouse_conectado;
    }

    public void setMouse_conectado(String mouse_conectado) {
        this.mouse_conectado = mouse_conectado;
    }

    public String getFone_conectado() {
        return fone_conectado;
    }

    public void setFone_conectado(String fone_conectado) {
        this.fone_conectado = fone_conectado;
    }

    public String getMonitor_conectado() {
        return monitor_conectado;
    }

    public void setMonitor_conectado(String monitor_conectado) {
        this.monitor_conectado = monitor_conectado;
    }

    public void status() {
        System.out.println("Status do computador: " +
                "\nLeds: " + this.leds +
                "\nLigado: " + this.ligado +
                "\nTeclado: " + this.teclado_conectado +
                "\nMouse: " + this.mouse_conectado +
                "\nFone: " + this.fone_conectado +
                "\nMonitor: " + this.monitor_conectado);
    }
}

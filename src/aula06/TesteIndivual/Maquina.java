package aula06.TesteIndivual;

public class Maquina {
    public static void main(String[] args) {
        MaquinaDeLavar m1 = new MaquinaDeLavar();

        m1.setTampada(true);
        m1.setRoupas(true);
        m1.mensagensLavagem();
        m1.ligar(3, 3);
        m1.menuGeral();
    }
}

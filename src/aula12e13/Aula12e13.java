package aula12e13;

public class Aula12e13 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        System.out.println("Mamifero");
        m.setPeso(32.3f);
        m.setCorPelo("Preto");
        m.setIdade(4);
        m.alimentar();
        m.emitirSom();
        m.locomover();

        System.out.println();

        System.out.println("Peixe");
        p.setPeso(4.3f);
        p.setCorEscama("Azul");
        p.setIdade(1);
        p.alimentar();
        p.emitirSom();
        p.locomover();

        System.out.println();

        System.out.println("Canguru");
        c.locomover();

        System.out.println();

        System.out.println("Cachorro");
        k.locomover();
        k.reagir("olá");
        k.reagir("vai apanhar");
        k.reagir(11, 45);
        k.reagir(true);
        k.reagir(17, 3.4f);

        System.out.println();
        g.setCorEscama("Gold");
        System.out.println(g.getCorEscama());
        g.locomover();
    }
}

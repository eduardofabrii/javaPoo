package aula02;

public class ChamandoCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Adição: " + calc.somar(10, 5));
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Divisão por zero: " + calc.dividir(10, 0));
    }
}

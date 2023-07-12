package devdojo.maratonajava.javacore.Csobrecargametodos.test;

import devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.soma(1, 2));
        System.out.println(calc.soma(1.5, 2.3));
        System.out.println(calc.soma(1.5, 2.3, 5));
    }
}

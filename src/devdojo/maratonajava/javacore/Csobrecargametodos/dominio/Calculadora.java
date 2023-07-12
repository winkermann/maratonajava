package devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

/*
A sobrecarga de método em Java permite que uma classe tenha vários métodos com o mesmo nome,
mas com diferentes parâmetros. Isso possibilita chamar o mesmo método com argumentos diferentes,
permitindo maior flexibilidade e reutilização de código.
 */

public class Calculadora {

    //metodo "base"
    public int soma(int num1, int num2) {
        return num1 + num2;
    }
    //sobrecarga para soma de valores com ponto flutuante
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    //sobrecarga para soma de três valores
    public double soma(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}

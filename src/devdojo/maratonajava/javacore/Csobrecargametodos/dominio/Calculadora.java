package devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

// O termo sobrecarga vem do fato de declararmos vários métodos com o mesmo nome, estamos carregando o aplicativo com o 'mesmo' método.
// A única diferença entre esses métodos são seus parâmetros e/ou tipo de retorno.
// ref: https://www.javaprogressivo.net/2012/09/sobrecarga-de-metodos-method.html


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

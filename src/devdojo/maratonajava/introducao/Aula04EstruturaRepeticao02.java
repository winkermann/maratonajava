package devdojo.maratonajava.introducao;

public class Aula04EstruturaRepeticao02 {
    public static void main(String[] args) {
        System.out.println("Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50");

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        System.out.println("Calcule o valor de imposto sobre o salário de R$70000 anual");
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor imposto: " + valorImposto);
        System.out.println("----------------------------------");

        System.out.println("Dado o valor de um veículo, descubra em quantas ele pode ser parcelado\n" +
                "Condição valorParcela >= 1000");
        double valorTotal = 30000;
        System.out.println("Valor do veículo: " + valorTotal);
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}


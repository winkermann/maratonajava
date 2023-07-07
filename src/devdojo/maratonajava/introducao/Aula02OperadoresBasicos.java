package devdojo.maratonajava.introducao;

public class Aula02OperadoresBasicos {

    public static void main(String[] args) {
        /*
        * * * * * * ARITMETICOS * * * * * *
        * Operacoes matematicas basicas: +  -  *  /  %
        */
        int a = 25;
        int b = 15;
        int c = 30;
        int total = 2 * (a + b + c) / 10;
        System.out.println("------------ ARTMETICOS -----------");
        System.out.println("Expressão: 2 * (a + b + c) / 10");
        System.out.println("Resultado = " + total);
        System.out.println("-----------------------------------");

        /*
        * * * * * * INCREMENTOS * * * * * *
        * para incremento e decremento podemos utilizar ++ e --
        */
        int numero = 5;
        System.out.println("------------ INCREMENTO -----------");
        System.out.println("Inicial: " + numero);
        numero++;
        System.out.println("Incremento (++): " + numero);
        numero--;
        System.out.println("Decremento (--): " + numero);
        System.out.println("-----------------------------------");

        /*
         * * * * * * IGUALDADE * * * * * *
         * verificam se os valores são iguais(==) ou diferentes(!=)
         */
        int valorA = 1;
        int valorB = 2;
        System.out.println("------------- IGUALDADE -----------");
        System.out.println("Valores: A=1 e B=2");
        System.out.println("A é igual a B: " + (valorA == valorB));
        System.out.println("A é diferente de B: " + (valorA != valorB));
        System.out.println("-----------------------------------");

        /*
         * * * * * * RELACIONAIS * * * * * *
         * Comparam dois ou mais valores: < > <= >=
         */
        int valorC = 5;
        int valorD = 10;
        System.out.println("------------ RELACIONAIS ----------");
        System.out.println("Valores: C=5 e D=10");
        System.out.println("C é menor que D: " + (valorC < valorD));
        System.out.println("C é maior que D: " + (valorC > valorD));
        System.out.println("C é menor ou igual que D: " + (valorC <= valorD));
        System.out.println("C é maior ou igual que D: " + (valorC >= valorD));
        System.out.println("-----------------------------------");

        /*
         * * * * * * LOGICOS * * * * * *
         * Comparar expressoes partir da junção de duas ou mais expressões: && ||
         */
        System.out.println("-------------- LOGICOS ------------");
        System.out.println("se ((1 == (2 -1)) && (2 == (1 + 1)))\n" +
                "imprima “Ambas as expressões são verdadeiras”;");

        if((1 == (2 -1)) && (2 == (1 + 1))){
            System.out.println("Resultado: Ambas as expressões são verdadeiras");
        };
        System.out.println("-----------------------------------");
    }
}

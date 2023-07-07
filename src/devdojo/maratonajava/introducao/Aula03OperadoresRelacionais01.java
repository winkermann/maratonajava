package devdojo.maratonajava.introducao;

public class Aula03OperadoresRelacionais01 {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Estrutura de condição if/else: ");
        System.out.println("if(condicao) { \n" +
                "   acao se for verdadeira;\n" +
                "} else {\n" +
                "   acao se for falsa;\n" +
                "}");
        System.out.println("Exemplo: Idade = 19");
        int idade = 19;
        if (idade >= 18 ){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade :)");
        }
        System.out.println("---------------------------------");

        System.out.println("Ternario: (condicao) ? verdadeiro : falso");
        double salario = 3500;
        String resultado = salario > 2500 ? "Você precisa fazer declaração IR" : "Você está isento de IR!";
        System.out.println("Salário: R$" + salario + " " + resultado);
        System.out.println("---------------------------------");
    }
}

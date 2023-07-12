package devdojo.maratonajava.javacore.Bintrometodos.dominio;

/*
Um método em Java é um bloco de código que executa uma ação específica e pode receber parâmetros e retornar um valor.
Ele é utilizado para encapsular um conjunto de instruções que realizam uma determinada tarefa dentro de uma classe.
 */

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void infoFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            // verifica se o array de salário é nulo, caso seja,
            // retorna pra execução evitando, assim, uma excessão
            return;
        }
        for (double salario: salarios) {
            System.out.print("R$" + salario + " ");
        }
        mediaSalario();
    }

    public void mediaSalario() {
        if (salarios == null) {
            // verifica se o array de salário é nulo, caso seja,
            // retorna pra execução evitando, assim, uma excessão
            return;
        }
        double media = 0;
        for(double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: R$" + media);
    }
}
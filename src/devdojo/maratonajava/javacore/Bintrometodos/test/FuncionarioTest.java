package devdojo.maratonajava.javacore.Bintrometodos.test;
/*
Crie uma classe Funcionário com os seguintes atributos
    nome
    idade
    salario (três salários devem ser guardados)
Crie dois métodos
    i - Para imprimir os dados
    ii - Para tirar a média dos salários e im*imir o resultado
*/

import devdojo.maratonajava.javacore.Bintrometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1200, 1500, 2100};

        funcionario.infoFuncionario();
    }
}

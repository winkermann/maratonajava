package devdojo.maratonajava.javacore.Gmodificadorstatic.test;

import devdojo.maratonajava.javacore.Gmodificadorstatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 270);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("");
        System.out.println("//////////////////////////////////////");
        System.out.println("");

        // Se atribuirmos Carro.velocidadeLimite = 180 siginifica que estamos alterando o valor de todos
        // os objetos instanciados, já que se refere ao valor da classe
        Carro.velocidadeLimite = 150;

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("");
        System.out.println("//////////////////////////////////////");
        System.out.println("");

        //A mesma coisa acontece se modificarmos diretamente em um objeto ja instanciado. Em
        // em c1.setVelocidadeLimite(150) todos os objetos serão afetados,
        // uma vez que esse valor se refere à classe

        c1.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

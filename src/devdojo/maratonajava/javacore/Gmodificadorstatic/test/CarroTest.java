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

        //Se colocarmos c1.setVelocidadeLimite(150) todos os objetos serão afetados,
        // uma vez que esse valor se refere à classe
        c1.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

package devdojo.maratonajava.javacore.Aintroclasses.test;

import devdojo.maratonajava.javacore.Aintroclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 =  new Carro();
        carro1.fabricante = "Fiat";
        carro1.modelo = "Palio";
        carro1.ano = 2007;

        Carro carro2 =  new Carro();
        carro2.fabricante = "Volksvagem";
        carro2.modelo = "Polo";
        carro2.ano = 2019;

        System.out.printf("Fabricante: %s \nModelo: %s \nAno: %d \n", carro1.fabricante, carro1.modelo, carro1.ano);
        System.out.println("------------------");
        System.out.printf("Fabricante: %s \nModelo: %s \nAno: %d", carro2.fabricante, carro2.modelo, carro2.ano);
    }
}

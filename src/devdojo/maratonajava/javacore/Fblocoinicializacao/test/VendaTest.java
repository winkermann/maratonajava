package devdojo.maratonajava.javacore.Fblocoinicializacao.test;


import devdojo.maratonajava.javacore.Fblocoinicializacao.dominio.Venda;

public class VendaTest {
    public static void main(String[] args) {
        Venda venda = new Venda("Smartphone");

        for (int parcela : venda.getParcelas()) {
            System.out.print(parcela + " ");
        }

    }

}

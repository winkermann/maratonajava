package devdojo.maratonajava.introducao;

public class Aula04EstruturaRepeticao01 {
    public static void main(String[] args) {
        System.out.println("Estrutura de repeticao while do-while e for");
        System.out.println("-------------------------------");

        int count = 0;
        while (count < 10) {
            System.out.println("Estrutura while: " + ++count);
        }
        System.out.println("-------------------------------");

        count = 0;
        do {
            System.out.println("Estrutura do-while: " + ++count);
        } while (count < 10);
        System.out.println("-------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Estrutura for: " + i);
        }
        System.out.println("-------------------------------");
    }
}

package devdojo.maratonajava.introducao;

public class Aula03OperadoresRelacionais02 {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        byte dia = 10;
        // char, int, byte, short, enum, String
        System.out.println("Imprima o dia da semana, considerando 1 como domingo");
        System.out.println("Dia: " +dia);
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("---------------------------------");

        dia = 6;
        System.out.println("Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana");
        System.out.println("Dia: " +dia);
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

package devdojo.maratonajava.introducao;

public class Aula05Arrays01 {
    public static void main(String[] args) {

        /* Array tem um tipo definido e tamanho fixo e o primeiro indice sempre sera 0.
         * sintaxe: tipo do objeto[] nome do array;
         * Inicializando um array:
         * ex: int[] numeros = {1, 2, 3}; - aceita apenas números inteiros;
         * ex: String[] nomes = {"Lucas", "Fernanda", "Fabio"}; - aceita apenas strings;
         */

        System.out.println("---------- ARRAY UNIDIMENSIONAL ----------");
        // são vetores que têm um único índice como identificador para cada elemento contido em um array
        String[] nomes = {"Lucas", "Fernanda", "Fabio"};
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
    }
}

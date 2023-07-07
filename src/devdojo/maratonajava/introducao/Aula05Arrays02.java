package devdojo.maratonajava.introducao;

public class Aula05Arrays02 {
    public static void main(String[] args) {
        System.out.println("********** ARRAY MULTIDIMENSIONAL **********");
        /* é possível compará-los a tabelas, você pode enumerar múltiplos índices em um mesmo array,
        formando, assim, diversas linhas e colunas.
        https://www.w3big.com/cprogramming/two_dimensional_arrays.jpg

        Não é possível inicilaizar um array multidimensional sem que seja definido o número de colunas,
        todavia é possível deixar o número de linhas em branco.
        Sintaxe:
        String[][] = new String[5][] - onde [5] é o número de colunas e [] o número de linhas.

        O tamanho das linhas de um array pode variar, não sendo decessário a criação de um array 1:1
         */

        //Formas de inicializar um array multidimensional

        int[][] arrayInt1 = new int[3][];
        int[] arrayRow = {1,2,3,4,5,6};

        arrayInt1[0] = new int[2]; //define o total de linhas;
        arrayInt1[1] = new int[]{1,2,3}; // define o total de linhas e atribui valores;
        arrayInt1[2] = arrayRow; // define o total de linhas e atribui valores utilizando uma variavel;

        System.out.print("---------- INICIALIZACAO 1 ----------");
        for (int[] arrayBase : arrayInt1) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{1}, {1,2}, {1,2,3}};
        System.out.println("");

        System.out.print("---------- INICIALIZACAO 2 ----------");
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n----------");
            for ( int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}

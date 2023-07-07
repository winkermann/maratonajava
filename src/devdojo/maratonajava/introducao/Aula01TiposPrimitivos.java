package devdojo.maratonajava.introducao;

public class Aula01TiposPrimitivos {
    /*
    Resumo de tipos primitivos:
    int, double, float, char, byte, short, long, boolean

    Ref: https://www.devmedia.com.br/tipos-de-dados-por-valor-e-por-referencia-em-java/25293
     */
    public static void main(String[] args) {
        System.out.println("Tipos de dados em Java: \n" +
                "\nMenor Byte: " + Byte.MIN_VALUE +
                "\nMaior Byte: " + Byte.MAX_VALUE +
                "\nMenor Short Int: " + Short.MIN_VALUE +
                "\nMaior Short Int: " + Short.MAX_VALUE +
                "\nMenor Int: " + Integer.MIN_VALUE +
                "\nMaior Int: " + Integer.MAX_VALUE +
                "\nMenor Long: " + Long.MIN_VALUE +
                "\nMaior Long:" + Long.MAX_VALUE +
                "\nMenor Float: " + Float.MIN_VALUE +
                "\nMaior Float: " + Float.MAX_VALUE +
                "\nMenor Double: " + Double.MIN_VALUE +
                "\nMaior Double: " + Double.MAX_VALUE);
    }
}

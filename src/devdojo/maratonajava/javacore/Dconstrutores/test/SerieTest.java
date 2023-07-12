package devdojo.maratonajava.javacore.Dconstrutores.test;

import devdojo.maratonajava.javacore.Dconstrutores.dominio.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("The Last of Us", 2023, 1, 10);
        serie.imprime();
    }
}

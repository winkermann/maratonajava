package devdojo.maratonajava.javacore.Esobrecargaconstrutor.test;

import devdojo.maratonajava.javacore.Esobrecargaconstrutor.dominio.Filme;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme("Interestelar", 2014, "Christopher Nolan", "Paramount");
        filme.imprime();
    }
}

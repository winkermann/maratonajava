package devdojo.maratonajava.javacore.Esobrecargaconstrutor.dominio;

/*
A sobrecarga de construtores em Java permite que uma classe tenha múltiplos construtores com diferentes parâmetros,
permitindo a criação de objetos de maneiras diferentes sem precisar criar uma nova classe.
 */

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private String diretor;
    private String estudio;

    public Filme(String nome, int anoDeLancamento, String diretor) {
        this();
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
        System.out.println("Dentro do construtor 1");

    }

    public Filme() {
        System.out.println("Dentro do construtor vazio");
    }

    public Filme(String nome, int anoDeLancamento, String diretor, String estudio) {
        this(nome, anoDeLancamento, diretor);
        this.estudio = estudio;
        System.out.println("Dentro do construtor 2");
    }

    public void imprime() {
        System.out.println("-------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Diretor: " + this.getDiretor());
        System.out.println("Estudio: " + this.getEstudio());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}

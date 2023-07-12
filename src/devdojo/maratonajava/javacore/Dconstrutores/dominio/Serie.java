package devdojo.maratonajava.javacore.Dconstrutores.dominio;
/*
Um construtor em Java é um método especial usado para inicializar objetos de uma classe.
Ele é chamado automaticamente no momento da criação de um objeto e pode receber parâmetros
para configurar o estado inicial do objeto.
*/

public class Serie {
    private String nome;
    private int anoDeLancamento;
    private int temporadas;
    private int totalDeEpisodios;

    public Serie(String nome, int anoDeLancamento, int temporadas, int totalDeEpisodios) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.temporadas = temporadas;
        this.totalDeEpisodios = totalDeEpisodios;
    }

    public void imprime() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Total de episodios: " + getTotalDeEpisodios());
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTotalDeEpisodios() {
        return totalDeEpisodios;
    }

    public void setTotalDeEpisodios(int totalDeEpisodios) {
        this.totalDeEpisodios = totalDeEpisodios;
    }

}

package devdojo.maratonajava.javacore.Gmodificadorstatic.dominio;
/*
O modificador de acesso static em Java é usado para declarar membros de classe que pertencem à classe em si,
e não a instâncias individuais da classe. Ele permite o acesso direto a esses membros sem a necessidade de criar
objetos da classe. Os membros static são compartilhados por todas as instâncias da classe e podem ser acessados
através do nome da classe.
 */

public class Carro {
    private String nome;
    private int velocidadeMaxima;
    //definido como publico pq ainda nao vimos metodos estaticos
    public static int velocidadeLimite = 250;

    public Carro(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        //velocidade limite é acessado por Carro.velocidadeLimite porque pertente à classe, e não ao objeto c1, c2,...
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static int getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(int velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
}

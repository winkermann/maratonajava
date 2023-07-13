package devdojo.maratonajava.javacore.Fblocoinicializacao.dominio;

/*
Um bloco de inicialização em Java é um trecho de código que é executado antes da execução do construtor de uma classe.
Ele é usado para realizar a inicialização de variáveis estáticas ou executar qualquer outra lógica necessária antes da
criação de objetos da classe. Os blocos de inicialização são úteis para garantir a consistência e preparar o estado
inicial de uma classe antes de ser utilizada.
 */

public class Venda {
    //Exemplo: crie um bloco de inicialização que defina o número de parcelas que um cliente pode escolher

    private String produto;
    private int[] parcelas;

    /*
    Ordem ao criar/instanciar um objeto:
    1 - Alocado espaço em memoria para o objeto,
    2 - cada atributo de calsse é criado e inicializado com valores default ou o que for passado,
    3 - Bloco de inicialização é executado,
    4 - Construtor é executado;
    */

    //Para criar um bloco de inicialização utiliza-se {}
    {
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[12];
        for (int i = 0; i < parcelas.length; i++) {
            parcelas[i] = i+1;
        }
    }

    public Venda() {
    }

    public Venda(String produto) {
        this.produto = produto;
        System.out.println("Dentro do construtor");
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}

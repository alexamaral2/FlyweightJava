package flyweight;

public class Produto {

    private String nome;
    private String categoria;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String obterProduto() {
        return "Produto{" +
                "nome='" + this.nome + '\'' +
                ", categoria='" + this.categoria + '\'' +
                '}';
    }
}
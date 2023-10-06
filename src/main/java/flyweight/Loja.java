package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(String nomeProduto, String categoriaProduto) {
        Produto produto = ProdutoFactory.getProduto(nomeProduto, categoriaProduto);
        produtos.add(produto);
    }

    public List<String> obterProdutos() {
        List<String> saida = new ArrayList<>();
        for (Produto produto : this.produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }
}

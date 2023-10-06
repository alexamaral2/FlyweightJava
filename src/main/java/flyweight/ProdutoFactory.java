package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProdutoFactory {
    private static final Map<String, Produto> produtos = new HashMap<>();

    public static Produto getProduto(String nome, String categoria) {
        String chave = nome + categoria;

        if (!produtos.containsKey(chave)) {
            Produto produto = new Produto(nome, categoria);
            produtos.put(chave, produto);
        }

        return produtos.get(chave);
    }
}
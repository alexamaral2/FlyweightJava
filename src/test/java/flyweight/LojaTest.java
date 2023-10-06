package flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private Loja loja;

    @BeforeEach
    public void setUp() {
        loja = new Loja();
    }

    @Test
    public void testAdicionarEObterProdutos() {
        loja.adicionarProduto("Produto A", "Categoria X");
        loja.adicionarProduto("Produto B", "Categoria Y");

        assertEquals(2, loja.obterProdutos().size());
    }
}

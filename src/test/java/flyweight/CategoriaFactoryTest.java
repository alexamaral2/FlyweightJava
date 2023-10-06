package flyweight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaFactoryTest {

    @Test
    public void testGetProduto() {
        Produto produto1 = CategoriaFactory.getProduto("Produto A", "Categoria X");
        Produto produto2 = CategoriaFactory.getProduto("Produto B", "Categoria Y");

        assertEquals("Produto{nome='Produto A', categoria='Categoria X'}", produto1.obterProduto());
        assertEquals("Produto{nome='Produto B', categoria='Categoria Y'}", produto2.obterProduto());
    }
}
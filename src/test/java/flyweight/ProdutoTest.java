package flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testObterProduto() {
        Produto produto = new Produto("Produto A", "Categoria X");
        String resultado = produto.obterProduto();
        assertEquals("Produto{nome='Produto A', categoria='Categoria X'}", resultado);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoAndarTest {

    @Test
    void deveAndar() {
        IServico servico = ServicoFactory.obterServico("Andando");
        assertEquals("O personagem está andando", servico.executar());
    }
    @Test
    void deveFicarParado() {
        IServico servico = ServicoFactory.obterServico("Andando");
        assertEquals("O personagem está parado", servico.cancelar());
    }
}

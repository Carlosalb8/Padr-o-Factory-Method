import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoCorrerTest {
    @Test
    void deveCorrer() {
        IServico servico = ServicoFactory.obterServico("Correndo");
        assertEquals("O personagem está correndo", servico.executar());
    }
    @Test
    void deveFicarParado() {
        IServico servico = ServicoFactory.obterServico("Correndo");
        assertEquals("O personagem não está correndo", servico.cancelar());
    }
}

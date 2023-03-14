import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoGolpearTest {

    @Test
    void deveGolpear() {
        IServico servico = ServicoFactory.obterServico("Golpeando");
        assertEquals("O personagem está golpeando", servico.executar());
    }
    @Test
    void naoGolpear() {
        IServico servico = ServicoFactory.obterServico("Golpeando");
        assertEquals("O personagem não está golpeando", servico.cancelar());
    }
}

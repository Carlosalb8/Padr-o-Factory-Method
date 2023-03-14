import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoPularTest {
    @Test
    void devePular() {
        IServico servico = ServicoFactory.obterServico("Pulando");
        assertEquals("O personagem está pulando", servico.executar());
    }
    @Test
    void naoPular() {
        IServico servico = ServicoFactory.obterServico("Pulando");
        assertEquals("O personagem não está pulando", servico.cancelar());
    }
}

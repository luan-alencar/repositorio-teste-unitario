package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testLampada {

    @Test
    public void testLampada() {
        Lampada l = new Lampada("Sala");
        assertEquals("Sala", l.getNome());
        assertFalse(l.isLigada());
    }

    @Test
    public void testAlternar() {
        Lampada l = new Lampada("Quarto");
        l.alternar();
        assertTrue(l.isLigada());
    }

    @Test
    public void testSetNome() {
        Lampada l = new Lampada("Quarto");
        l.setNome("Garagem");
        assertEquals("Garagem", l.getNome());
    }
}

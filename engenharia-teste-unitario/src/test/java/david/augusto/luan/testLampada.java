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
        // aqui define um nome para o obj l que representa a Classe Lampada
        Lampada l = new Lampada("Quarto");
        // em seguida modifica sem nome
        l.setNome("Garagem");
        // em sequencia testa se o nome atual foi realmente modificado
        // verificando se "Garagem" e igual ao nome do obj l recentemente setado
        assertEquals("Garagem", l.getNome());
    }

    @Test
    public void testEquals(){
        // instanciei um obj que representa Lampada
        Lampada quarto = new Lampada();
        // instanciei outro obj que tb representa Lampada
        Lampada sala = new Lampada();
        // comparacao se ambos representam a classe Lampada
        assertEquals(quarto, sala);
    }

}

package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testEmpresa {

    Empresa e = new Empresa("BASIS");

    @Test
    public void testGetNome() {
        assertEquals("BASIS", e.getNome());
    }

    @Test
    public void testSetNome() {
        e.setNome("Accenture");
        assertEquals("Accenture", e.getNome());
    }

}

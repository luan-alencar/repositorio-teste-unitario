package david.augusto.luan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class testEmpresa {
    // inicia dando um nome ao obj "e" que instancia Empresa
    Empresa e = new Empresa("BASIS");

    @Test
    public void testGetNome() {
        // testa se o nome do obj "e" localizado na memoria e igual a sequencia
        // de caracteres "BASIS"
        assertEquals("BASIS", e.getNome());
    }

    @Test
    public void testSetNome() {
        // modificando o nome para "Accenture"
        e.setNome("Accenture");
        // verificando se o obj "e" e igual a sequencia de caracteres "Accenture"
        assertEquals("Accenture", e.getNome());
    }

}

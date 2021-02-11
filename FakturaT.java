import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakturaT {

    private Faktura faktura;
    private Zamowienie zamowienie;
    private Klient klient;

    @Test
    public void testGenerowanieSygnaturyFaktury() {
        Faktura faktura = new Faktura(zamowienie, klient);
        assertEquals("F/2021/2/1", faktura.generujNumer());
    }

    @Test
    public void testDataZaplaty() {
        Faktura faktura = new Faktura(zamowienie, klient);
        assertEquals(LocalDate.now().plusDays(14), faktura.getDataZaplaty());
    }

    @Test
    public void testDataWystawienia() {
        Faktura faktura = new Faktura(zamowienie, klient);
        assertEquals(LocalDate.now(), faktura.getDataWystawienia());
    }

}



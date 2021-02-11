import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZamowienieT {

    @Test
    public void testZamowienieNetto(){
        Zamowienie sut = new Zamowienie();
        sut.dodajPozycje("dlugopis", 4, 2.00, 23);
        sut.dodajPozycje("ketchup", 2, 4.50, 8);
        assertEquals(17.00, sut.calkowitaCenaNetto());
    }

    @Test
    public void testZamowienieBrutto(){
        Zamowienie sut = new Zamowienie();
        sut.dodajPozycje("dlugopis", 4, 2.00, 23);
        sut.dodajPozycje("ketchup", 2, 4.50, 8);

        assertEquals(19.56, sut.calkowitaCenaBrutto(), 0.01);
    }
}


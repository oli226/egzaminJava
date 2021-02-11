import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PozycjaT {

    @Test
    public void testCalkowotaCenaBrutto(){
    Pozycja sut = new Pozycja("długopis", 5,1.00,23);

    assertEquals(6.15, sut.CalkowitaCenaBrutto());
    }

    @Test
    public void testCalkowotaCenaBruttoBezPodanegoVAT(){
        Pozycja sut = new Pozycja("długopis", 5,1.00);

        assertEquals(6.15, sut.CalkowitaCenaBrutto());
    }

    @Test
    public void testCalkowotaCenaNetto() {
        Pozycja sut = new Pozycja("długopis",5,2.00);

        assertEquals(10.00, sut.CalkowitaCenaNetto());
    }
}


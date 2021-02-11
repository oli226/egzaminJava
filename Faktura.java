import java.time.LocalDate;

public class Faktura {

    private Zamowienie zamowienie;
    private Klient klient;
    private LocalDate dataWystawienia;
    private LocalDate dataZaplaty;
    private String sygnaturaFaktury;
    private int licznikFaktur = 0;

    public Faktura(Zamowienie zamowienie, Klient klient) {
        this.zamowienie = zamowienie;
        this.klient = klient;
        this.dataWystawienia = LocalDate.now();
        this.dataZaplaty = LocalDate.now().plusDays(14);
        licznikFaktur++;
        this.sygnaturaFaktury = generujNumer();
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public Klient getKlient() {
        return klient;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public LocalDate getDataZaplaty() {
        return dataZaplaty;
    }

    public String getSygnaturaFaktury() {
        return sygnaturaFaktury;
    }

    public int getLicznikFaktur() {
        return licznikFaktur;
    }

    public String generujNumer() {
        this.sygnaturaFaktury = "F/" + LocalDate.now().getYear() + "/" + LocalDate.now().getMonthValue() + "/" + licznikFaktur;
        return this.sygnaturaFaktury;
    }
}

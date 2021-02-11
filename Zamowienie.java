import java.util.ArrayList;

public class Zamowienie {

    private ArrayList<Pozycja> Zakupy;

    public Zamowienie() {
        this.Zakupy = new ArrayList<>();
    }

    public ArrayList<Pozycja> getZakupy() {
        return Zakupy;
    }

    public void nowaPozycja(String pozycja, int ilosc, double cenaNettoPozycji, double VAT) {
        Pozycja produkt = new Pozycja(pozycja, ilosc, cenaNettoPozycji, VAT);
    }

    public void dodajPozycje(String pozycja, int ilosc, double cenaNettoPozycji, double VAT) {
        Pozycja produkt = new Pozycja(pozycja, ilosc, cenaNettoPozycji, VAT);
        Zakupy.add(produkt);
    }

    public double calkowitaCenaNetto() {

        double calaCenaNetto = 0;

        for (Pozycja i : this.Zakupy) {
            calaCenaNetto += i.CalkowitaCenaNetto();
        }
        return calaCenaNetto;
    }

    public double calkowitaCenaBrutto() {

        double calaCenaBrutto = 0.00;

        for (Pozycja i : this.Zakupy) {
            calaCenaBrutto += i.CalkowitaCenaBrutto();
        }

        return calaCenaBrutto;
    }

}

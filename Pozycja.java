public class Pozycja {

    private String Nazwa;
    private int Ilosc;
    private double CenaNettoPozycji;
    private double VAT;

    public Pozycja(String Nazwa, int Ilosc, double CenaNettoPozycji) {
        this.Nazwa = Nazwa;
        this.Ilosc = Ilosc;
        this.CenaNettoPozycji = CenaNettoPozycji;
        this.VAT = 23;
    }

    public Pozycja(String Nazwa, int Ilosc, double CenaNettoPozycji, double VAT) {
        this.Nazwa = Nazwa;
        this.Ilosc = Ilosc;
        this.CenaNettoPozycji = CenaNettoPozycji;
        this.VAT = VAT;
    }

    public String getNazwa(){
        return Nazwa;
    }

    public void setNazwa(String Nazwa){
        this.Nazwa = Nazwa;
    }

    public int getIlosc() {
        return Ilosc;
    }

    public void  setIlosc(int Ilosc){
        this.Ilosc = Ilosc;
    }

    public double getCenaNettoPozycji(){
        return CenaNettoPozycji;
    }

    public void setCenaNettoPozycji(double CenaNettoPozycji){
        this.CenaNettoPozycji = CenaNettoPozycji;
    }

    public double getVAT(){
        return VAT;
    }

    public void setVAT(double VAT){
        this.VAT = VAT;
    }

    public double CenaBrutto() {
        return this.CenaNettoPozycji + (this.VAT/100 * this.CenaNettoPozycji);
    }

    public double CalkowitaCenaNetto(){
        return this.Ilosc * this.CenaNettoPozycji;
    }

    public double CalkowitaCenaBrutto(){
        return this.Ilosc * this.CenaBrutto();
    }

}

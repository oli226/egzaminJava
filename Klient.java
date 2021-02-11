public class Klient {
    private String NazwaFirmy;
    private String Adres;
    private int NIP;
    private int NrKonta;


    public Klient(String NazwaFirmy, String Adres, int NIP, int NrKonta){
        this.NazwaFirmy = NazwaFirmy;
        this.Adres = Adres;
        this.NIP = NIP;
        this.NrKonta = NrKonta;
    }

    public String getNazwaFirmy(){
        return NazwaFirmy;
    }

    public void setNazwa(String NazwaFirmy){
        this.NazwaFirmy = NazwaFirmy;
    }

    public String getAdres(){
        return NazwaFirmy;
    }

    public void setAdres(String Adres){
        this.Adres = Adres;
    }

    public int getNIP(){
        return NIP;
    }

    public void setNIP(int NIP){
        this.NIP = NIP;
    }

    public int getNrKonta(){
        return NrKonta;
    }

    public void setNrKonta(int NrKonta){
        this.NrKonta = NrKonta;
    }
}

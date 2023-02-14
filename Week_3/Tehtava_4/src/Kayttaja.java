import java.util.Scanner;


public class Kayttaja {
    private String _nimi;
    private String _osoite;


    public Kayttaja() {
    }

    public Kayttaja(String nimi, String osoite) {
        setNimi(nimi);
        setOsoite(osoite);
    }

    public Kayttaja(Kayttaja kayttaja) {
        this._nimi = kayttaja._nimi;
        this._osoite = kayttaja._osoite;
    }


    public String getNimi() {
        return _nimi;
    }

    public void setNimi(String nimi) {
        this._nimi = nimi;
    }

    public String getOsoite() {
        return _osoite;
    }

    public void setOsoite(String osoite) {
        this._osoite = osoite;
    }

    public void getKayttajaTiedot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kayttajan nimi: ");
        setNimi(sc.nextLine());
        System.out.print("Kayttajan osoite: ");
        setOsoite(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Kayttaja: {" + getNimi() + ", " + getOsoite() + '}';
    }
}

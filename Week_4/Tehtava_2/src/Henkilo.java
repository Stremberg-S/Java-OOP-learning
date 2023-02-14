import java.util.Scanner;

public class Henkilo {
    private String _nimi;
    private String _osoite;
    private String _syntymaaika;


    public Henkilo() {
    }

    public Henkilo(String nimi, String osoite, String syntymaaika) {
        this();
        setNimi(nimi);
        setOsoite(osoite);
        setSyntymaaika(syntymaaika);
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

    public String getSyntymaaika() {
        return _syntymaaika;
    }

    public void setSyntymaaika(String syntymaaika) {
        this._syntymaaika = syntymaaika;
    }


    protected void getHenkilonTiedot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        setNimi(sc.nextLine());
        System.out.print("Anna osoite: ");
        setOsoite(sc.nextLine());
        System.out.print("Anna syntymaaika: ");
        setSyntymaaika(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Henkilo - " + getNimi() + ", " + getOsoite() + ", " + getSyntymaaika();
    }
}

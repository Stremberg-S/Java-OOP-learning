import java.util.Scanner;


public class Opiskelija {
    private String _etunimi;
    private String _sukunimi;
    private String _opiskelijanumero;
    private Osoite _osoiteTiedot;


    public Opiskelija() {
    }

    public Opiskelija(String enimi, String snimi, String opiskelijanro, Osoite osoiteTiedot) {
        this();
        setEtunimi(enimi);
        setSukunimi(snimi);
        setOpiskelijanumero(opiskelijanro);
        setOsoiteTiedot(osoiteTiedot);
    }


    public String getEtunimi() {
        return _etunimi;
    }

    public void setEtunimi(String enimi) {
        this._etunimi = enimi;
    }

    public String getSukunimi() {
        return _sukunimi;
    }

    public void setSukunimi(String snimi) {
        this._sukunimi = snimi;
    }

    public String getOpiskelijanumero() {
        return _opiskelijanumero;
    }

    public void setOpiskelijanumero(String opiskelijanro) {
        this._opiskelijanumero = opiskelijanro;
    }

    public Osoite getOsoiteTiedot() {
        return _osoiteTiedot;
    }

    public void setOsoiteTiedot(Osoite osoiteTiedot) {
        this._osoiteTiedot = osoiteTiedot;
    }


    public void getAllInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Etunimi: ");
        setEtunimi(sc.next());
        System.out.print("Sukunimi: ");
        setSukunimi(sc.next());
        System.out.print("Opiskelijanumero: ");
        setOpiskelijanumero(sc.next());
        if (this._osoiteTiedot == null)
            this._osoiteTiedot = new Osoite();
        _osoiteTiedot.getOsoiteTiedot();
        sc.close();
    }

    @Override
    public String toString() {
        return "Opiskelija: {" +
                getEtunimi() + " " +
                getSukunimi() +
                ", opiskelijanumero = " + getOpiskelijanumero() +
                ", Osoite: " + getOsoiteTiedot() +
                '}';
    }
}
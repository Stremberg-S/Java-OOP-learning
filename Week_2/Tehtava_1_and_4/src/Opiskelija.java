public class Opiskelija {
    private String _etunimi;
    private String _sukunimi;
    private String _opiskelijanumero;
    private Osoite _osoiteTiedot;


    public Opiskelija() {
    }

    public Opiskelija(String etunimi, String sukunimi, String opiskelijanumero, Osoite osoiteTiedot) {
        this();
        setEtunimi(etunimi);
        setSukunimi(sukunimi);
        setOpiskelijanumero(opiskelijanumero);
        setOsoiteTiedot(osoiteTiedot);
    }


    public String getEtunimi() {
        return _etunimi;
    }

    public void setEtunimi(String etunimi) {
        this._etunimi = etunimi;
    }

    public String getSukunimi() {
        return _sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this._sukunimi = sukunimi;
    }

    public String getOpiskelijanumero() {
        return _opiskelijanumero;
    }

    public void setOpiskelijanumero(String opiskelijanumero) {
        this._opiskelijanumero = opiskelijanumero;
    }

    public Osoite getOsoiteTiedot() {
        return _osoiteTiedot;
    }

    public void setOsoiteTiedot(Osoite osoiteTiedot) {
        this._osoiteTiedot = osoiteTiedot;
    }

    @Override
    public String toString() {
        return "Opiskelija - " +
                getEtunimi() + " " +
                getSukunimi() +
                ", opiskelijanumero: " + getOpiskelijanumero() +
                ", Osoite: " + _osoiteTiedot;
    }
}

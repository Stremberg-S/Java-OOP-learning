public class Opiskelija {
    private String etunimi;
    private String sukunimi;
    private String opiskelijanumero;
    Osoite osoiteTiedot;


    public Opiskelija() {
    }

    public Opiskelija(String etunimi, String sukunimi, String opiskelijanumero, Osoite osoiteTiedot) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanumero = opiskelijanumero;
        this.osoiteTiedot = osoiteTiedot;
    }


    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(String opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }


    @Override
    public String toString() {
        return "Opiskelija: {" +
                etunimi + " " +
                sukunimi +
                ", opiskelijanumero = " + opiskelijanumero +
                ", Osoite: " + osoiteTiedot +
                '}';
    }
}

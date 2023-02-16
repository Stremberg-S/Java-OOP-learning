package com.teht3.tehtava_3;

public class Tuote {
    private String _nimi;
    private String _tuotetyyppi;
    private String _kayttoonottopaiva;
    private double _myyntihinta;
    private Henkilo _ostaja;


    public Tuote() {
    }

    public Tuote(String nimi, String tuotetyyppi, String kayttoonottopvm, double myyntihinta) {
        this();
        setNimi(nimi);
        setTuotetyyppi(tuotetyyppi);
        setKayttoonottopaiva(kayttoonottopvm);
        setMyyntihinta(myyntihinta);
    }

    public Tuote(String nimi, String tuotetyyppi, String kayttoonottopaiva, double myyntihinta, Henkilo ostaja) {
        this(nimi, tuotetyyppi, kayttoonottopaiva, myyntihinta);
        setOstaja(ostaja);
    }


    public String getNimi() {
        return _nimi;
    }

    public void setNimi(String nimi) {
        this._nimi = nimi;
    }

    public String getTuotetyyppi() {
        return _tuotetyyppi;
    }

    public void setTuotetyyppi(String tuotetyyppi) {
        this._tuotetyyppi = tuotetyyppi;
    }

    public String getKayttoonottopaiva() {
        return _kayttoonottopaiva;
    }

    public void setKayttoonottopaiva(String kayttoonottopaiva) {
        this._kayttoonottopaiva = kayttoonottopaiva;
    }

    public double getMyyntihinta() {
        return _myyntihinta;
    }

    public void setMyyntihinta(double myyntihinta) {
        this._myyntihinta = myyntihinta;
    }

    public Henkilo getOstaja() {
        return _ostaja;
    }

    public void setOstaja(Henkilo ostaja) {
        this._ostaja = ostaja;
    }


    @Override
    public String toString() {
        return "Tuote: - " +
                "nimi: " + getNimi() +
                ", tyyppi: " + getTuotetyyppi() +
                ", kayttöönottopäivä: " + getKayttoonottopaiva() +
                ", hinta: " + getMyyntihinta() + " €" +
                getOstaja();
    }
}

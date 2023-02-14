public class Henkilokunta extends Henkilo {
    private String _tyontekijanumero;
    private String _toimipaikka;
    private String _titteli;


    public Henkilokunta() {
    }

    public Henkilokunta(String nimi, String osoite, String syntymaaika,
                        String tyontekijanumero, String toimipaikka, String titteli) {
        super(nimi, osoite, syntymaaika);
        setTyontekijanumero(tyontekijanumero);
        setToimipaikka(toimipaikka);
        setTitteli(titteli);
    }


    public String getTyontekijanumero() {
        return _tyontekijanumero;
    }

    public void setTyontekijanumero(String tyontekijanumero) {
        this._tyontekijanumero = tyontekijanumero;
    }

    public String getToimipaikka() {
        return _toimipaikka;
    }

    public void setToimipaikka(String toimipaikka) {
        this._toimipaikka = toimipaikka;
    }

    public String getTitteli() {
        return _titteli;
    }

    public void setTitteli(String titteli) {
        this._titteli = titteli;
    }


    public void tulostaHenkilokunta() {
        System.out.println(getHenkilonTiedot());
    }

    @Override
    public String toString() {
        return super.toString() +
                " | tyontekijanumero: " + getTyontekijanumero() +
                ", toimipaikka: " + getToimipaikka() +
                ", titteli: " + getTitteli();
    }
}

public class Opiskelija extends Henkilo {
    private int _opiskelijanumero;
    private String _aloituspaiva;


    public Opiskelija() {
    }

    public Opiskelija(String nimi, String osoite, String syntymaaika,
                      int opiskelijanumero, String aloituspaiva) {
        super(nimi, osoite, syntymaaika);
        setOpiskelijanumero(opiskelijanumero);
        setAloituspaiva(aloituspaiva);
    }


    public int getOpiskelijanumero() {
        return _opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this._opiskelijanumero = opiskelijanumero;
    }

    public String getAloituspaiva() {
        return _aloituspaiva;
    }

    public void setAloituspaiva(String aloituspaiva) {
        this._aloituspaiva = aloituspaiva;
    }


    public void tulostaOpiskelija() {
        System.out.println(getHenkilonTiedot());
    }

    @Override
    public String toString() {
        return super.toString() +
                " | opiskelijanumero: " + getOpiskelijanumero() +
                ", aloituspaiva: " + getAloituspaiva();
    }
}

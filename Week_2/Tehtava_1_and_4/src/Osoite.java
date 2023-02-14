public class Osoite {
    private String _katuosoite;
    private String _postinumero;
    private String _postitoimipaikka;


    public Osoite() {
    }

    public Osoite(String katuosoite, String postinumero, String postitoimipaikka) {
        this();
        setKatuosoite(katuosoite);
        setPostinumero(postinumero);
        setPostitoimipaikka(postitoimipaikka);
    }


    public String getKatuosoite() {
        return _katuosoite;
    }

    public void setKatuosoite(String katuosoite) {
        this._katuosoite = katuosoite;
    }

    public String getPostinumero() {
        return _postinumero;
    }

    public void setPostinumero(String postinumero) {
        this._postinumero = postinumero;
    }

    public String getPostitoimipaikka() {
        return _postitoimipaikka;
    }

    public void setPostitoimipaikka(String postitoimipaikka) {
        this._postitoimipaikka = postitoimipaikka;
    }


    @Override
    public String toString() {
        return getKatuosoite() + ", " +
                getPostinumero() + ", " +
                getPostitoimipaikka();
    }
}

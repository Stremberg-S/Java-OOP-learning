public class Osoite {
    private String katuosoite;
    private String postinumero;
    private String postitoimipaikka;


    public Osoite() {
    }

    public Osoite(String katuosoite, String postinumero, String postitoimipaikka) {
        this.katuosoite = katuosoite;
        this.postinumero = postinumero;
        this.postitoimipaikka = postitoimipaikka;
    }


    public String getKatuosoite() {
        return katuosoite;
    }

    public void setKatuosoite(String katuosoite) {
        this.katuosoite = katuosoite;
    }

    public String getPostinumero() {
        return postinumero;
    }

    public void setPostinumero(String postinumero) {
        this.postinumero = postinumero;
    }

    public String getPostitoimipaikka() {
        return postitoimipaikka;
    }

    public void setPostitoimipaikka(String postitoimipaikka) {
        this.postitoimipaikka = postitoimipaikka;
    }


    @Override
    public String toString() {
        return katuosoite + ", " +
                postinumero + ", " +
                postitoimipaikka;
    }
}

public class Main {
    public static void main(String[] args) {
        Opiskelijat opiskelijat = new Opiskelijat();

        Osoite os1 = new Osoite("Kauppakatu 3 A33", "70700", "Kuopio");
        Osoite os2 = new Osoite("Kartanonkatu 7", "90000", "Kartano");
        Osoite os3 = new Osoite("Jokutie 1", "00000", "Jokukaupunki");

        opiskelijat.addOpiskelijaToList(new Opiskelija(
                "Sergei",
                "Stremberg",
                "12345",
                os1));
        opiskelijat.addOpiskelijaToList(new Opiskelija(
                "Toinen",
                "Henkilö",
                "23456",
                os1));
        opiskelijat.addOpiskelijaToList(new Opiskelija(
                "Kolmas",
                "Henkilö",
                "34567",
                os2));
        opiskelijat.addOpiskelijaToList(new Opiskelija(
                "Vielä-Yksi",
                "Opiskelija",
                "45678",
                os3));

        // voidaan testata että opiskelijan poisto listalta onnistuu
//        opiskelijat.removeOpiskelijaFromList(op1);

        // tämä tulostaa listan kaikki opiskelijat
        opiskelijat.tulostaOpiskelijat();
        System.out.println();
        // ja tässä tulostuu vain kaupungissa olevat
        opiskelijat.tulostaAsukkaat("Kuopio");
    }
}
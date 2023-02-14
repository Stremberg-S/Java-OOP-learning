public class Main {
    public static void main(String[] args) {
        Opiskelijat opiskelijat = new Opiskelijat();

        Osoite os1 = new Osoite("Kauppakatu 3 A33", "70700", "Kuopio");
        Osoite os2 = new Osoite("Kartanonkatu 7", "90000", "Kartano");
        Osoite os3 = new Osoite("Jokutie 1", "00000", "Jokukaupunki");

        Opiskelija op1 = new Opiskelija("Sergei", "Stremberg", "12345", os1);
        Opiskelija op2 = new Opiskelija("Toinen", "Henkilö", "23456", os1);
        Opiskelija op3 = new Opiskelija("Kolmas", "Henkilö", "34567", os2);
        Opiskelija op4 = new Opiskelija("Vielä-Yksi", "Opiskelija", "45678", os3);

        opiskelijat.addOpiskelijaToList(op1);
        opiskelijat.addOpiskelijaToList(op2);
        opiskelijat.addOpiskelijaToList(op3);
        opiskelijat.addOpiskelijaToList(op4);

        // voidaan testata että opiskelijan poisto listalta onnistuu
//        opiskelijat.removeOpiskelijaFromList(op1);

        // tämä tulostaa listan kaikki opiskelijat
        opiskelijat.tulostaOpiskelijat();
        System.out.println();
        // ja tässä tulostuu vain kaupungissa olevat
        opiskelijat.tulostaAsukkaat("Kuopio");
    }
}
import java.util.ArrayList;

public class Teht4 {
    public static void main(String[] args) {
        ArrayList<Tietokone> tietokoneet = new ArrayList<>();

        tietokoneet.add(new Tietokone(
                "212232",
                12,
                3,
                "Asus",
                "ER443"));
        tietokoneet.add(new Tietokone(
                "3233",
                15,
                21,
                "Lenovo",
                "HH544"));
        tietokoneet.add(new Tietokone(
                "9888",
                2,
                5,
                "Fujitsu",
                "3323F"));
        tietokoneet.add(new Tietokone(
                "343",
                150,
                2,
                "IBM",
                "IBM3444"));

        System.out.println("\nAlkuperäiset tuotepaikat: ");
        for (Tietokone t : tietokoneet) {
            System.out.println(t);
        }

        System.out.println("\nMuutetut tuotepaikat: ");
        for (Tietokone t : tietokoneet) {
            if (t.getTuotepaikka() < 10)
                t.setTuotepaikka(t.getTuotepaikka() + 10);
            else if (t.getTuotepaikka() >= 10 && t.getTuotepaikka() <= 100)
                t.setTuotepaikka(t.getTuotepaikka() + 30);
            else if (t.getTuotepaikka() > 100)
                t.setTuotepaikka(t.getTuotepaikka() + 500);
            System.out.println(t);
        }
    }
}
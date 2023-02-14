import java.util.ArrayList;

public class Teht3 {
    public static void main(String[] args) {
//        Kysytään 10 henkilön nimet ja koepisteet
        ArrayList<Oppilas> oppilaat = new ArrayList<>();

        while (oppilaat.size() <= 9) {
            Oppilas op = new Oppilas();
            op.kysyTiedot();
            oppilaat.add(op);
        }

        for (Oppilas oppilas : oppilaat) {
            System.out.println(oppilas);
        }
    }
}
import java.util.ArrayList;


public class OpiskelijaUtils {
    public static ArrayList<String> virheet = new ArrayList<>();

    public static Opiskelija TarkastaTiedot(Opiskelija op) {
        int counter = 0;
        // tarkistus: ettei kentät ole tyhjiä.
        if (op.getEtunimi() == null || op.getEtunimi().length() == 0) {
            virheet.add("etunimi oli tyhjä");
            counter++;
        }
        if (op.getSukunimi() == null || op.getSukunimi().length() == 0) {
            virheet.add("sukunimi oli tyhjä");
            counter++;
        }
        if (op.getOpiskelijanumero() == null || op.getOpiskelijanumero().length() == 0) {
            virheet.add("opiskelijanumero oli tyhjä");
            counter++;
        }
        if (op.getOsoiteTiedot() == null ||
                op.getOsoiteTiedot().getKatuosoite().length() == 0 ||
                op.getOsoiteTiedot().getPostinumero().length() == 0 ||
                op.getOsoiteTiedot().getPostitoimipaikka().length() == 0) {
            virheet.add("osoitetiedoissa oli tyhjää");
            counter++;
        }

        // tarkistus: eka kirjain iso, muut pienet --> korjaus.
        op.setEtunimi(capitalizeFirstLetter(op.getEtunimi()));
        op.setSukunimi(capitalizeFirstLetter(op.getSukunimi()));
        op.getOsoiteTiedot().setKatuosoite(capitalizeFirstLetter(op.getOsoiteTiedot().getKatuosoite()));
        op.getOsoiteTiedot().setPostitoimipaikka(capitalizeFirstLetter(op.getOsoiteTiedot().getPostitoimipaikka()));

        // tarkistus: opiskelijanumerossa vain numerot.
        String opiskelijanumero = op.getOpiskelijanumero();
        if (parsedIntFromStr(opiskelijanumero) == 0) {
            virheet.add("opiskelijanumerossa muutakin kuin numeroita");
            counter++;
        }
        // tarkistus: postinumerossa vain numerot ja oikea pituus.
        String postinumero = op.getOsoiteTiedot().getPostinumero();
        if (parsedIntFromStr(postinumero) == 0) {
            virheet.add("postinumerossa muutakin kuin numeroita");
            counter++;
        } else if (parsedIntFromStr(postinumero).toString().length() > 5) {
            virheet.add("postinumero liian pitkä");
            counter++;
        } else if (parsedIntFromStr(postinumero).toString().length() < 5) {
            virheet.add("postinumero liian lyhyt");
            counter++;
        }

        // null or not to null - that is the question!
        if (counter > 0)
            return null;
        return op;
    }


    private static String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
    }

    // tarkistus: onko opiskelijanumerossa integer
    private static Integer parsedIntFromStr(String str) {
        int inputNum;
        try {
            inputNum = Integer.parseInt(str);
        } catch (NumberFormatException n) {
            return 0;
        }
        return inputNum;
    }

    // virheiden tulostus
    public static void printVirheet(ArrayList<String> virheet) {
        for (String virhe : virheet) {
            System.out.println("\t- " + virhe);
        }
    }
}

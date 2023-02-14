import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Scanner;


public class LeasingUtils {
    static void KopioiTiedot(LeasingTieto lt) {
        Scanner sc = new Scanner(System.in);

        LeasingTieto ltCopy = new LeasingTieto(lt);

        System.out.print("Tietokonen sarjanumero: ");
        ltCopy.getTietokone().setSarjanumero(sc.nextLine());
        System.out.print("Kayttajan nimi: ");
        ltCopy.getKayttaja().setNimi(sc.nextLine());
        System.out.print("Kayttajan osoite: ");
        ltCopy.getKayttaja().setOsoite(sc.nextLine());
        String date = getValidDate(sc);
        ltCopy.setPaivamaara(new SimpleDateFormat(date));

        System.out.println(ltCopy);
    }

    static String getChoice(Scanner sc) {
        System.out.println("\nLisätäänkö uusi tieto (k/e)?");
        String choice = sc.next().toLowerCase();
        // valinnan validointi
        while (!Objects.equals(choice, "k") && !Objects.equals(choice, "e")) {
            System.out.println("vastaukseksi kay vain 'k' tai 'e' ");
            System.out.println("Lisätäänkö uusi tieto (k/e)?: ");
            choice = sc.next().toLowerCase();
        }
        return choice;
    }

    // päivämäärän validointi
    public static boolean isDateValid(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    // Kysyy käyttäjältä ja palauttaa validin päivämäärän
    static String getValidDate(Scanner sc) {
        System.out.print("Paivamaara: ");
        String date = sc.next();
        boolean valid = isDateValid(date);
        while (!valid) {
            System.out.println("Päivämäärä ei ole validi..");
            System.out.println("Paivamaara: ");
            date = sc.next();
            valid = isDateValid(date);
        }
        return date;
    }
}

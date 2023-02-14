import java.util.Objects;
import java.util.Scanner;

public class Utils {
    static String getChoice(Scanner sc) {
        System.out.println("\nLisätäänkö uusi osake (k/e): ");
        String choice = sc.next().toLowerCase();
        // valinnan validointi
        while (!Objects.equals(choice, "k") && !Objects.equals(choice, "e")) {
            System.out.println("vastaukseksi kay vain 'k' tai 'e' ");
            System.out.println("Lisätäänkö uusi osake (k/e): ");
            choice = sc.next().toLowerCase();
        }
        return choice;
    }

    // tarkistus: onko inputissa integer
    static Integer parsedIntFromSC(Scanner sc) {
        String input = sc.next();
        int inputNum;
        try {
            inputNum = Integer.parseInt(input);
        } catch (NumberFormatException n) {
            System.out.println("Vain numerot käy.. ");
            return 0;
        }
        return inputNum;
    }

    // tarkistus: onko inputissa double
    public static Double parsedDoubleFromSC(Scanner sc) {
        String input = sc.next();
        double inputNum;
        try {
            inputNum = Double.parseDouble(input);
        } catch (NumberFormatException n) {
            System.out.println("Vain numerot käy.. ");
            return 0.0;
        }
        return inputNum;
    }
}

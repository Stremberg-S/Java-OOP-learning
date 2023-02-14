import java.util.Scanner;

/**
 * Ohjelma, joka kysyy käyttäjältä yhden osakkeen nimen (merkkijono),
 * osinkotuottoprosentin yhdelle vuodelle (desimaali) ja sijoitettava rahamäärän(kokonaisluku).
 * Sitten ohjelma tulostaa alla olevaan tapaan lauseen, jossa se käyttää näitä tietoja.
 * Ohjelma saa kaatua, jos numeerinen syöte ei ole annettu oikein.
 */


public class Teht1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna osake : ");
        String osake = sc.nextLine();

        System.out.println("Anna osinkoprosentti : ");
        float osinkoPros = sc.nextFloat();

        System.out.println("Anna sijoitus : ");
        int sijoitus = sc.nextInt();

        float tuotto = sijoitus * (osinkoPros / 100);
        sc.close();

        System.out.printf("Osakkeen %s tuotto pääomalle %d on %5.2f \n", osake, sijoitus, tuotto);
    }
}
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Ohjelma, joka arpoo  aluksi ns veikkauksen lottorivin.
 * Sen jälkeen arpoo sinulle rivin jota se vertaa ohjelman alussa arvottuun (ns veikkauksen) lottoriviin.
 * Aina vertauksen jälkeen ohjelma ilmoittaa montako oli oikein ja mitkä ne olivat.
 * Ohjelmassa ei tarvitse välittää lisänumeroista.
 */

public class Teht4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String choice;
        int rndNum;

        choice = getChoice(sc);

        while (!Objects.equals(choice, "e")) {
            ArrayList<Integer> myLotto = new ArrayList<>();
            ArrayList<Integer> realLotto = new ArrayList<>();
            ArrayList<Integer> correctGuessedNums = new ArrayList<>();

            int i = 1, j = 1;
            int myLottoNum;

            // haetaan käyttäjältä lottonumerot..
            while (i <= 7) {
                System.out.println("Anna " + i + " numero : ");
                myLottoNum = sc.nextInt();

                if (myLotto.contains(myLottoNum) || myLottoNum > 99 || myLottoNum < 1) {
                    System.out.println("Olet jo arvannut sen numeron tai numero ei ole validi");
                    continue;
                } else
                    myLotto.add(myLottoNum);
                i++;
            }
            // tietokone arpoo lottorivin
            while (j <= 7) {
                rndNum = rnd.nextInt(99) + 1;
                if (realLotto.contains(rndNum))
                    continue;
                else {
                    realLotto.add(rndNum);
                    j++;
                }
            }
            // oman lottorivin ja oikean lottorivin vertaus
            for (i = 0; i <= myLotto.size() - 1; i++) {
                if (realLotto.contains(myLotto.get(i)))
                    correctGuessedNums.add(myLotto.get(i));
            }

            // tulostus
            System.out.print("\nLottorivisi on: ");
            for (i = 0; i <= myLotto.size() - 1; i++) {
                if (i != myLotto.size() - 1)
                    System.out.print(myLotto.get(i) + ", ");
                else
                    System.out.print(myLotto.get(i) + " ");
            }
            System.out.print("\nOikea lottorivi on: ");
            for (j = 0; j <= realLotto.size() - 1; j++) {
                if (j != realLotto.size() - 1)
                    System.out.print(realLotto.get(j) + ", ");
                else
                    System.out.print(realLotto.get(j) + " ");
            }
            System.out.print("\nOikein oli " + correctGuessedNums.size() + " kpl, jotka olivat: ");
            for (i = 0; i <= correctGuessedNums.size() - 1; i++) {
                if (i != correctGuessedNums.size() - 1)
                    System.out.print(correctGuessedNums.get(i) + ", ");
                else
                    System.out.print(correctGuessedNums.get(i) + " ");
            }
            choice = getChoice(sc);
        }
        sc.close();
        System.out.println("\nKiitos ja hei hei!");
    }


    // valinta - arvotaanko numerot vai ei.
    private static String getChoice(Scanner sc) {
        System.out.println("\n\nHaluatko arpoa rivin (k=kylla, e=ei) ? ");
        String choice = sc.next().toLowerCase();
        // valinnan validointi
        while (!Objects.equals(choice, "k") && !Objects.equals(choice, "e")) {
            System.out.println("vastaukseksi kay vain 'k' tai 'e' ");
            System.out.println("\nHaluatko arpoa rivin (k=kylla, e=ei) ? ");
            choice = sc.next().toLowerCase();
        }
        return choice;
    }
}
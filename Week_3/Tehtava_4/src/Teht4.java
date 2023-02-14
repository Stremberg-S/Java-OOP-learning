import java.util.Objects;
import java.util.Scanner;


public class Teht4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LeasingTieto lt = new LeasingTieto();
        lt.getAllInformation();
        System.out.println(lt);

        String choice = LeasingUtils.getChoice(sc);
        while (!Objects.equals(choice, "e")) {
            LeasingUtils.KopioiTiedot(lt);
            choice = LeasingUtils.getChoice(sc);
        }
        sc.close();
        System.out.println("\nKiitos ja hei hei!");
    }
}
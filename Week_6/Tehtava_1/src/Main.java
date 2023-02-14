import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        while (true) {
            try {
                System.out.print("Kuinka montako säiettä käynnistetään?");
                count = sc.nextInt();
            } catch (Exception e) {
                System.out.println("\tVain numerot käy..");
                sc.next();
                continue;
            }
            break;
        }
        sc.close();

        for (int i = 0; i < count; i++) {
            PrintDiamond pd = new PrintDiamond();
            pd.start();
        }
    }
}
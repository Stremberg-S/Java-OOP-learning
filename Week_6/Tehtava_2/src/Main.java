import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna tiedoston nimi: ");
        String fileName = sc.nextLine();
        System.out.print("Anna syöte: ");
        String input = sc.nextLine();
        sc.close();

        FileUtils.WriteToFile(fileName, input);

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                String output = FileUtils.ReadFromFile(fileName);
                System.out.println("Tiedoston sisältö: " + output);
            } catch (Exception e) {
                System.out.println("Jotain meni pieleen..");
            }
        }).start();

    }
}

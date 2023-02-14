public class Teht2 {
    public static void main(String[] args) {
        double[] arr = {1, 2.3, 2, 3, 4, 5, 6, 90.7};

        System.out.println("\nLukujen summa:\t\t" + MathUtils.LaskeYhteen(arr));
        System.out.println("Suurin luku:\t\t" + MathUtils.SuurinLuku(arr));
        System.out.println("Lukujen keskiarvo:\t" + MathUtils.LaskeKeskiarvo(arr));
    }
}
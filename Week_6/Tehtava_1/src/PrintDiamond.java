public class PrintDiamond extends Thread {
    public void print() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }

    @Override
    public void run() {
        print();
    }
}

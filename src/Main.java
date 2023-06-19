// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int multiplication = 1; multiplication <= 10; multiplication++) {
                if (multiplication > i) {
                    break;
                }
                String result = "*";
                System.out.print(result);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
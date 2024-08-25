import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N Number :");
        int value = scanner.nextInt();


        int x = 0;
        for (int i = 0; i <= value; i++) {
            if (i / 2 == 0) {
                x = i;
                x = x + x;
            }
        }
        System.out.println("Sum Is:" + x);
    }
}

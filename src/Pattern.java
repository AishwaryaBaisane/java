
public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12; j++) {
                if (i == 1 && j == 7) {
                    System.out.print("* ");
                } else if (i == 2 && (j == 6 || j == 7))
                {
                    System.out.print("* ");
                } else if (i == 3 && (j == 5 || j == 8))
                {
                    System.out.print("* ");
                } else if (i == 4 && (j == 4 || j == 9))
                {
                    System.out.print("* ");
                } else if (i == 5 && (j == 3 || j == 10))
                {
                    System.out.print("* ");
                } else if (i == 6 && (j == 2 || j == 11))
                {
                    System.out.print("* ");
                } else if (i == 7 && (j == 1 || j == 12))
                {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.print("\n");
        }
    }
}
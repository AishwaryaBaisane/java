import java.util.Scanner;

public class Asending {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int [] array = {1,2,3,45,65};

        int x =0;

        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]);
        }

        for(int i = 0; true; i++)
        {
            for(int j = i+1; true; i++)
            {
                if(array[i] < array[j])
                {
                    x= array[i];
//                    System.out.printf(String.valueOf(x));
                    System.out.println(x);
                }
            }
        }
    }
}

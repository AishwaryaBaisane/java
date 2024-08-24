//
//import java.util.Scanner;
//
////WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
////        System.out.printf("Hello and welcome!");
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//        int []array = {1,2,3,45,65};
//
//        int x = 0;
//
//        for(int i=0; i<array.length; i++)
//        {
//            System.out.print(array[i]);
//        }
//
//        for(int i=0; i<array.length; i++)
//        {
//            for(int j=0; i<array.length; i++)
//            {
//                if(array[i] < array[j])
//                {
//                    x= array[i];
//                    System.out.println("Max"+ x);
//                }
//            }
//        }
//
//
//
//
//    }
//}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
//WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.
//WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.
//WAP TO CREATE PATTERN AS MENTIONED BELOW IMAGE.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {2,3,5,6,78,8};

        int x=0;
        for(int i=0; i<array.length; i++)
        {
            for(int j=i+1; j<array.length; j++)
            {
                if(array[i]>array[j])
                {
                    x = array[i];
                }
            }
        }
        System.out.println("Max Number is " + x);
    }
}

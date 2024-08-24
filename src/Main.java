
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

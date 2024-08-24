import java.util.Scanner;

public class Asending {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int [] arr = {1,2,3,45,65};

        int temp =0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

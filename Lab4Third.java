import java.util.Scanner;

public class Lab4Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int arr[] = new int[4];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
            s = s + arr[i];

        }

        float avg = s / 4;
        System.out.println("Sum is: " + s + " And Average is: " + avg);
    }
}

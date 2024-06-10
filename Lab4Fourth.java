import java.util.Scanner;

public class Lab4Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array: ");
        for (i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

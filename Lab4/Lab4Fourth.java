import java.util.Scanner;

public class Lab4Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element into arr:" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(+arr[i]);
        }
    }
}

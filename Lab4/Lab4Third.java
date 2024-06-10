import java.util.*;

public class Lab4Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter array element at arr" + i);
            arr[i] = sc.nextInt();
            s = s + arr[i];
        }
        System.out.println("Sum is: " + s);
        double avg = s / 4.0;
        System.out.println("Average: " + avg);
    }
}

import java.util.*;

public class MaxFromthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Maximum:" + a);
            } else {
                System.out.println("Maximum:" + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum:" + b);
            } else {
                System.out.println("Maximum:" + c);
            }
        }
    }
}

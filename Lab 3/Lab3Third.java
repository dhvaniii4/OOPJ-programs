import java.util.*;

public class Lab3Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Enter no: to check: ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("OOPS!Not Prime");
        } else {
            System.out.println("Prime!");
        }
    }
}

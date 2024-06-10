import java.util.Scanner;

public class Lab4Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String nm = sc.nextLine();

        System.out.println("Length of string is: " + nm.length());
        int mid = nm.length() / 2;
        for (int i = mid; i < nm.length(); i++) {
            System.out.print("" + nm.charAt(i));
        }
    }
}
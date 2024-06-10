import java.util.Scanner;

public class Lab4Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String nm = sc.nextLine();
        for (int i = 0; i < nm.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("" + nm.charAt(j));
            }
            System.out.println();
        }
    }
}

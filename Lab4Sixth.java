import java.util.Scanner;

public class Lab4Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch) || (!Character.isWhitespace(ch))) {
            System.out.println("JAY SHREE RAM!");
        } else {
            System.out.println("ERROR!");
        }
    }
}

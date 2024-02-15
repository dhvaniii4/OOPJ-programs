import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "dhvani";
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }

        if (str.equals(revstr)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

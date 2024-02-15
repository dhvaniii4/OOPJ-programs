import java.util.*;

public class DemoTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String un = sc.nextLine();
        if (un.trim().equals("dhvani"))// trims the string first(OR PIPELINE METHOD)
        {
            System.out.println("strings match!");
        } else {
            System.out.println("strings does not match!");
        }
    }
}
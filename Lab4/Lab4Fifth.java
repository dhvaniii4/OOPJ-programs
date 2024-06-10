import java.util.*;

public class Lab4Fifth {
   public static void main(String[] args) {
      Scanner st = new Scanner(System.in);
      System.out.println("Enter string: ");
      String line = st.nextLine();
      System.out.println("Entered string is " + line);
      int len = line.length();
      int half = (len) / 2;
      System.out.println("Second half of the string: ");
      for (int i = half; i < line.length(); i++) {
         System.out.print("" + line.charAt(i));
      }
   }
}

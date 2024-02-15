import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = "Hello rajkot, how are you, maja ma chu by rajkot ";
        System.out.println("Enter word to replace: ");
        String wordToReplace = sc.nextLine();
        System.out.println("New word");
        String newWord = sc.nextLine();
        myString = myString.replace(wordToReplace, newWord);
        System.out.println(myString);
    }
}

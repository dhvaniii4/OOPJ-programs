import java.io.*;
import java.util.Scanner;
public class Lab10First{
    public static void main(String[] args){
        Scanner sc;
        
        try{
            File file = new File("a.txt");
            sc = new Scanner(file);
            int lineCount = 0, charCount = 0, wordCounter = 0;
            while(sc.hasNextLine()){
                lineCount++;
                String line = sc.nextLine();
                charCount+=line.length();
                String[] words = line.split(" ");
                wordCounter += words.length;
            }
            sc.close();
            System.out.println(lineCount);
            System.out.println(wordCounter);
            System.out.println(charCount);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
// Create a class called Student. Write a student manager program to 
//manipulate the student information from files by using 
//FileInputStream and FileOutputStream.
import java.util.*;
import java.io.*;
public class Lab10Fourth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
           FileOutputStream fos = new FileOutputStream(args[0]);
           BufferedOutputStream bos = new BufferedOutputStream(fos);
           int roll;
           String name;
           String email;
           for(int i=0;i<3;i++){
            System.out.println("Enter roll, name and email: ");
            roll = sc.nextInt();
            name = sc.nextLine();
            email = sc.nextLine();
            bos.write(i);
            bos.write("\t");
            bos.writeChars(name);
            //+roll+" Name: "+name+" Email: "+email+"\n");
            sc.nextLine();
           } 
           bos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
//Lab 02(4):Write a program to convert temperature from Fahrenheit to Celsius.(Formula : c = f-32*5/9 )
import java.util.Scanner;
public class CelciusToFarenheit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter tempurature (in Fahrenheit): ");
        double far=sc.nextDouble();
        double celc=(far-32)*5/9;
        System.out.println("Tempurature (in Celcius): "+celc);
    }
}
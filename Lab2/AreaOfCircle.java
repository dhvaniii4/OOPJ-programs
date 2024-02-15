//Lab 02(4): Write a program to calculate the area of circle
import java.util.Scanner;
    public class AreaOfCircle{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Radius: ");
            double r=sc.nextDouble();
            double area= 3.14*r*r;
            System.out.println("Radius is: "+area);
        }
}
import java.util.Scanner;
public class ScannerDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a=sc.nextInt();
        System.out.println("Enter number 2: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is= "+sum);
    }
}
//LAB 02(3):Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation given in a string on the given numbers.
import java.util.Scanner;
public class BasicCalc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter operator: +,-,*,/");
        char op=sc.next().charAt(0);
        double cal=0;
        switch(op){
            case '+':{
                    cal=a+b;
                    break;
            }
            case '-':{
                cal=a-b;
                break;
                    }
            case '*':{
            cal=a*b;
            break;
                    }
            case '/':{
            cal=a/b;
             break;
                }
            default:{
                System.out.println("Invalid Operator");
            }
        }
        System.out.println("Final Ans is "+cal);
       // System.out.println(+a+ +op+ +b+ "=" +cal);
    }
}
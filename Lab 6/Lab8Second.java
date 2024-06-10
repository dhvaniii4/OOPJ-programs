import java.util.Scanner;
public class Lab8Second{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
    if(n<0){
        throw new NegativeNoException("Number cannot be less than 0");
    }
    else{
        System.out.println(n);
    }
    }
    catch(NegativeNoException e){
        System.out.println(e.getMessage());
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}
class NegativeNoException extends Exception{
    NegativeNoException(String msg){
        super(msg);
    }
}
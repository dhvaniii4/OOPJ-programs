import java.util.*;
public class Lab8Third{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
   int balance = 5000;
        try{
            System.out.println("Enter amount to withdraw?");
        int withdraw = sc.nextInt();
            if(withdraw > balance){
                throw new InSufficientFundException();
            }
            else{
                System.out.println("Current Balance: "+withdraw);
            }
        }catch(InSufficientFundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
class InSufficientFundException extends Exception{
    public InSufficientFundException(){
        super("Insufficient Balance!");
    }
}
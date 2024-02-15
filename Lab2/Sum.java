public class Sum{
    public static void main(String[] args){
        System.out.println("Sum of Numbers!");
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double sum=a+b;
        System.out.println("Sum of "+a+" & "+b+" is "+sum);
    }
}
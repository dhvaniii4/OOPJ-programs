import java.util.Scanner;

public class HomePrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income;
        double tax = 0;
        System.out.println("Enter income");
        income = sc.nextDouble();
        if (income <= 250000) {
            System.out.println("No tax");
        } else if (income <= 500000) {
            tax = (income - 250000) * (5 / 100);
            System.out.println(tax);
        } else if (income <= 1000000) {
            tax = ((income - 500000) * (20 / 100));
            System.out.println(tax + " Rs.");
        } else {
            System.out.println("Enter valid income");
        }
    }
}

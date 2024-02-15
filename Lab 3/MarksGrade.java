import java.util.*;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        double m4 = sc.nextDouble();
        double m5 = sc.nextDouble();
        double total = (m1 + m2 + m3 + m4 + m5);
        double per = (total / 500) * 100;
        if (per > 60) {
            System.out.println("First Division");
        } else if (per > 50) {
            System.out.println("Second Division");
        } else if (per > 40) {
            System.out.println("Third Division");
        } else if (per < 40 && per > 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Enter valid marks");
        }
    }
}
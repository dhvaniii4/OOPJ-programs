import java.util.Scanner;

public class ArrayOfObjects1 {
    public static void main(String[] args) {
        Student[] stud = new Student[1000]; // stack memory so won't be wasted
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stud.length; i++) {
            System.out.println("Roll " + (i + 101));
            int temp = sc.nextInt();
            if (temp == -1) { // for new batch attendance
                int nextRollNo = ((((i + 101) / 100) + 1) * 100) + 1;
                i = nextRollNo;
                System.out.println(i + " Testing");
                continue;
            } else if (temp == -2) { // Attendance finish!
                break;
            }
            stud[i] = new Student(i + 101, temp);
        }
        for (i = 0; i < stud.length; i++) {
            if (stud[i] != null && stud[i].present == 1) {
                System.out.println(stud[i].rollNo + " ,");
            }
        }
    }
}

class Student {
    int rollNo;
    int present;

    public Student(int rollNo, int present) {
        this.rollNo = rollNo;
        present = 0;
    }

}
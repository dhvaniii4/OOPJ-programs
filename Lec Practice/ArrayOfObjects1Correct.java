import java.util.Scanner;

class Student {
    int rollNo;
    int present;

    public Student(int rollNo, int present) {
        this.rollNo = rollNo;
        present = 0;
    }
}

public class ArrayOfObjects1Correct {
    public static void main(String[] args) {
        Student[] stu = new Student[1000];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stu.length; i++) {
            System.out.println("Roll No. " + (i + 101));
            int temp = sc.nextInt();
            if (temp == -1) {
                int nextRollNo = ((((i + 101) / 100) + 1) * 100);
                i = nextRollNo - 101;
                continue;
            } else if (temp == -2) {
                break;
            }
            stu[i] = new Student(i + 101, temp);

        }
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null && stu[i].present == 0) {
                System.out.print(stu[i].rollNo + ", ");
            }
        }
        System.out.println("Is attendance ok? (please enter 1 for ok)");
        int aOk = sc.nextInt();
        if (aOk != 1) {
            while (true) {
                System.out.println("Enter roll no to change: ");
                int rollTemp = sc.nextInt();
                if (rollTemp < 0) {
                    for (int i = 0; i < stu.length; i++) {
                        if (stu[i] != null && stu[i].present == 0) {
                            System.out.println(stu[i].rollNo + ", ");
                        }
                    }
                }
                System.out.println("enter 1 for present and 0 for absent: ");
                int presentTemp = sc.nextInt();

            }
        }
    }
}

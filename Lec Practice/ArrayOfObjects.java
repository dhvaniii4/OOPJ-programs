import java.util.*;

class Student {
    String name;
    int perc;

    public Student(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of " + i + " student: ");
        name = sc.nextLine();
        System.out.println("Percentsge: ");
        perc = sc.nextInt();
    }

    public void printStudentDetails() {
        System.out.println(name + " got " + perc + " ");
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] stu = new Student[5];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student(i + 1);

        }
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].perc > 80) {
                stu[i].printStudentDetails();
            }
        }
    }
}

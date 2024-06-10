import java.util.Scanner;
public class Lab6First {
    public static void main(String[] args) {
        Grade ob[] = new Grade[3];
        for(int i=0;i<3;i++){
            ob[i] = new Grade();
            ob[i].inputGrade();
        }
        for(int i=0;i<3;i++){
            ob[i].outputGrade();
        }
    }
}

class Student {
    Scanner sc = new Scanner(System.in);
    int id_no;
    int no_of_subjects;
    int subject_code;
    int subject_credits;
    Student(){
        id_no = 0;
        no_of_subjects = 0;
        subject_code = 0;
        subject_credits = 0;
    }
    protected void input(){
        System.out.println("Enter ID no: ");
        id_no = sc.nextInt();
        System.out.println("Enter No. of Subjects: ");
        no_of_subjects = sc.nextInt();
        System.out.println("Enter Subject Code: ");
        subject_code = sc.nextInt();
        System.out.println("Enter Subject Credits: ");
        subject_credits = sc.nextInt();
    }
    protected void output(){
        System.out.println("Id: "+id_no+" No. Of Subjects: "+no_of_subjects+" Subject Code: "+subject_code+" Subject Credits: "+subject_credits);
    }
}
class Grade extends Student{
    Scanner sc = new Scanner(System.in);
    int spi;
    String grade_obtained;
    Grade(){
       // super();
       spi = 0;
       grade_obtained = null;
    }
    void inputGrade(){
        super.input();
        System.out.println("Enter SPI: ");
        spi = sc.nextInt();
        System.out.println("Enter Grade: ");
        grade_obtained = sc.nextLine();
    }
    public void outputGrade(){
        super.output();
        System.out.println("SPI: "+spi+" Grade: "+grade_obtained);
    }
}
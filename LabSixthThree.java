public class LabSixthThree{
    public static void main(String[] args){
        Employee e = new Employee("Ram",21,34467,"address",1000,"Typing");
        e.printSalary();
        Manager m = new Manager("shiv",21,76696,"address",1000,"accounting");
        m.printSalary();
    }
}
class Member{
    String name; 
    int age; 
    int phone_no;
    String address;
    int Salary;
    Member(String name, int age, int phone_no, String address, int Salary){
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.Salary = Salary;   
    }
    void printSalary(){
        System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nPhone Number: "+this.phone_no+"\nAddress: "
        +this.address+"\nSalary: "+this.Salary);
    }
}
class Employee extends Member{
    String specialization;
    Employee(String name, int age, int phone_no, String address, int Salary,String specialization){
        super(name,age,phone_no,address,Salary);
        this.specialization = specialization;
    }
    void printSalary(){
        super.printSalary();
        System.out.println("Specialization: "+this.specialization);
    }
}
class Manager extends Member{
    String department;
    Manager(String name, int age, int phone_no, String address, int Salary,String department){
        super(name,age,phone_no,address,Salary);
        this.department = department    ;
    }
    void printSalary(){
        super.printSalary();
        System.out.println("Department: "+this.department);
    }
}
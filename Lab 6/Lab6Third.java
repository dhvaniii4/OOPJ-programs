/*Learnt use of super keyword*/

public class Lab6Third {
    public static void main(String[] args) {
        Employee e = new Employee("Ram", 19, 343544, "dodjin", 20000, "Backend");
        e.printEmployeeDetails();
        Manager m = new Manager("Shiv", 20, 3493820, "jhhiwef", 15000, "cse");
        m.printManagerDetails();

    }
}

class Member {
    String name;
    int age;
    int phone_no;
    String address;
    int salary;

    Member(String name, int age, int phone_no, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Name : " + this.name + "\nAge : " + this.age + "\nPhone Number: " + this.phone_no
                + "\nAddress : " + this.address + "\nSalary : " + this.salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, int phone_number, String address, int salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }

    void printEmployeeDetails() {
        super.printSalary();
        System.out.println("Specialization : " + this.specialization);
    }
}

class Manager extends Member {
    String department;

    Manager(String name, int age, int phone_number, String address, int salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }

    void printManagerDetails() {
        super.printSalary();
        ;
        System.out.println("Department : " + this.department);
    }
}
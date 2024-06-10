public class LabSevenTwo{
    public static void main(String[] args){
        B b1 = new B();
        b1.methA();
        b1.methA1();
        b1.methA2();
        b1.methA12();
        b1.methB();
    }
}
interface A{
    int a = 20;
   public void methA();
}
interface A1 extends A{
    float b = 10;
 public void methA1();
}
interface A2 extends A{
    long c = 1000000l;
    public void methA2();
}
interface A12 extends A1,A2{
    int d = 100;
    public void methA12();
}
class B implements A12{
    int e = 50;
    public void methA(){
        System.out.println("Hello from A "+a);
    }
    public void methA1(){
        System.out.println("Hello from A1 "+b);
    }
    public void methA2(){
        System.out.println("Hello from A2 "+c);
    }
    public void methA12(){
        System.out.println("Hello from A12 "+d);
    }
    public void methB(){
        System.out.println("Hello from B "+e);
    }
}
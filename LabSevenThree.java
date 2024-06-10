public class LabSevenThree{
    public static void main(String[] args){
        Animal a[] = new Animal[4];
        a[0] = new Tiger();
        a[1] = new Camel();
        a[2] = new Deer();
        a[3] = new Donkey();
        for (int i =0;i<4;i++) {
            Animal ob = a[i];
            ob.deliver();
        }
        
    }
}
interface Transport{
    public void deliver();
}
abstract class Animal{
    public void deliver(){};
}
class Tiger extends Animal{
    public void deliver(){};
}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Hello from Camel Class");
    }
}
class Deer extends Animal{
    public void deliver(){};
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Hello from Donkey Class");
    }
}

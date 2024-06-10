public class Lab9Second{
    public static void main(String[] args){
        Thread even = new Num(2,1000);
        Thread odd = new Num(1,2000);
        even.start();
        odd.start();
    }
}
class Num extends Thread{
    int start;
    int delay;
    
        public Num(int start,int delay){
        this.start = start;
        this.delay = delay;
    }
    public void run(){
        try{
        for(int i = start; i<=20; i+=2){
            System.out.println(i);
            Thread.sleep(delay);
        }
    }catch(Exception e){
    e.printStackTrace();
}
    }
}
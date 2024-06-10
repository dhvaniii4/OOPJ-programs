public class Lab9First{
    public static void main(String[] args){
        Thread t1 = new Message("Good Morning",1000);
        Thread t2 = new Message("Good Afternoon",3000);
        t1.start();
        t2.start();
    }
}
class Message extends Thread{
    String msg; 
    int delay;
    Message(String msg, int delay){
        this.msg = msg;
        this.delay = delay;
    }
    public void run(){
        try{
            while(true){
                System.out.println(msg);
                Thread.sleep(delay);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    };
}
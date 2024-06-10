public class Lab9Second{
    public static void main(String[] args){
        Thread even = new PrintNo(2);
        Thread odd = new PrintNo(1);
        even.start();
        odd.start();
    }
}
class PrintNo extends Thread{
    int start;
    PrintNo(int start){
        this.start = start; 
    }
    public void run(){
        try{
            for(int i = start; i<=20;i+=2){
                System.out.println(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
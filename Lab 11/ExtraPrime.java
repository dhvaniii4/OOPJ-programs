public class ExtraPrime{
    public static void main(String[] args){
        int min = 1008;
        int max = 9008;
        int flag = 0;
        for(int n=min;n<=max;n++){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag = 1;
                    break;
                }
                if(flag == 0){
                System.out.println(n+" ");
            }
        }
    }
    }
}
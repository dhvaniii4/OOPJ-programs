public class Lab6Fourth{
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(1,1);
        double ans = p2.distance(p1);
        System.out.println(ans);
        ThreeDPoint t1 = new ThreeDPoint();
        ThreeDPoint t2 = new ThreeDPoint(10,30,25.5);
        double ans1 = t2.distance(t1);
        System.out.println(ans1);
    }
}
class MyPoint{
    double x,y;
    MyPoint(){
        x = 0;
        y = 0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint p2){
        double dist = Math.sqrt(Math.pow(p2.x - this.x,2)+Math.pow(p2.y - this.y,2));
        return dist;
    }
}

class ThreeDPoint extends MyPoint{
    double x,y,z;
    ThreeDPoint(){
        x = 0;
        y = 0;
        z = 0;
    }
    ThreeDPoint(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;        
    }
    public double distance(ThreeDPoint p2){
        double dist = Math.sqrt(Math.pow(p2.x - this.x, 2)+Math.pow(p2.y - this.y, 2)+Math.pow(p2.z - this.z, 2));
        return dist;
    }
    public double distance(double x, double y, double z){
        double dist = Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)+Math.pow(z-this.z,2));
        return dist;
    }
}
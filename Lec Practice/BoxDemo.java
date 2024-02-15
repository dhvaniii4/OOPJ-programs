import java.util.Scanner;

class Box {
    int w;
    int b;
    int h;

    public void printVolume() {
        int vol = w * b * h;
        System.out.println("Volume: " + vol);
    }

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        w = sc.nextInt();
        System.out.println("Enter breadth: ");
        b = sc.nextInt();
        System.out.println("Enter height: ");
        h = sc.nextInt();
    }
}

public class BoxDemo {
    public static void main(String[] args) { // aakha program ma ek j "public" class hovi joie
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setData();
        myBox1.printVolume();

        myBox2.setData();
        myBox2.printVolume();

        // instead of writing print statements multiple times we create method

    }
}

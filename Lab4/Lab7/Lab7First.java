public class Lab7First {
    public static void main(String[] args) {
        Vegetable v1;
        v1 = new Potato();
        v1.display("Brown");
        v1 = new Brinjal();
        v1.display("Purple");
        v1 = new Tomato();
        v1.display("Red");
    }
}

abstract class Vegetable {
    abstract void display(String color);
}

class Potato extends Vegetable {
    void display(String color) {
        System.out.println("Color of Potato is: " + color);
    }
}

class Brinjal extends Vegetable {
    void display(String color) {
        System.out.println("Color of Brinjal is: " + color);
    }

}

class Tomato extends Vegetable {
    void display(String color) {
        System.out.println("Color of Tomato is: " + color);
    }

}
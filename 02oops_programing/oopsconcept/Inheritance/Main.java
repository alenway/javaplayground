class Parent {
    void display() {
        System.out.println("this is parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("this is child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        c1.display();
    }
}

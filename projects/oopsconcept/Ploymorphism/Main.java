// class MathOperation {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }
// }

class Animal {
    void sound() {
        System.out.println("this is method from animal class.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("this is method from dog class");
    }
}

public class Main {
    public static void main(String[] args) {
        // MathOperation sum = new MathOperation();
        // System.out.println(sum.add(3, 5));
        // System.out.println(sum.add(23.45, 4.98));
        // System.out.println(sum.add(2, 3.5));
        Animal tiger = new Animal();
        Dog shampu = new Dog();
        Animal jimmy = new Dog();
        tiger.sound();
        shampu.sound();
        jimmy.sound();

    }
}

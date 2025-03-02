// interface Moves {
//     void movement();

//     void action();
// }

// abstract class Toy implements Moves {
//     protected String name;
//     int speed;

//     Toy(String name) {
//         this.name = name;
//     }

//     public abstract void movement();

//     public abstract void action();

//     void play() {
//         System.out.println("abstract play method. and this is name: " + name + " this is his speed: " + speed);
//     }

//     abstract void turnOn();
// }

// class Car extends Toy {
//     Car(String name) {
//         super(name);
//         this.name = name;
//     }

//     public void movement() {
//         System.out.println("movement method from abstract toy in the interface.");
//     }

//     public void action() {
//         System.out.println("action method from abstract toy in the interface.");
//     }

//     void turnOn() {
//         System.out.println("the car is ready.");
//     }

//     void dash() {
//         System.out.println("car is drifting.");
//     }
// }

// interface Candy {
//     void taste();

//     void texture();
// }

// class DairyMilkChocklet implements Candy {
//     public void taste() {
//         System.out.println("taste sweet.");
//     }

//     public void texture() {
//         System.out.println("texture is dark brown.");
//     }
// }

abstract class Toy {
    void move() {
        System.out.println("Move method in abstract class toy.");
    }

    abstract void sound();
}

class Car extends Toy {
    public void sound() {
        System.out.println("makind sound of a car. from car class");
    }
}

public class Main {
    public static void main(String[] args) {
        // abstraction
        // syntax
        // abstractClassName instancename = (new)keyword classname
        Toy myCar = new Car();
        myCar.move();
        myCar.sound();
        // Toy t1 = new Car("lightning");
        // t1.play();
        // t1.turnOn();
        // t1.dash();

        // interface
        // Candy c1 = new DairyMilkChocklet();
        // c1.taste();
        // c1.texture();
    }
}

class Animal {
    private String name;

    // default constructor
    Animal() {
        this.name = "unknown name";
    }

    public String getName(String name) {
        return name;
    }

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("This animal eats food.");
        System.out.println("Name of the animal is " + name);
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

class Puppy extends Dog {
    Puppy(String name) {
        super(name);
    }

    void cry() {
        System.out.println("Puppy cry alot.");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy jimmy = new Puppy(null);
        jimmy.cry();
        jimmy.bark();
        jimmy.eat();
    }
}

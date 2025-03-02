class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.printf("%s can eat food.%n", name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bard() {
        System.out.printf("%s barks.%n", name);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.printf("%s meow %n", name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog jimmy = new Dog("jimmy");
        jimmy.bard();
        jimmy.eat();

        Cat pussy = new Cat("pussy");
        pussy.meow();
        pussy.eat();
    }
}

// Абстрактный класс Animal
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void speak();
    abstract void move();
}

// Интерфейс Flyable
interface Flyable {
    void fly();
}

// Класс Bird наследует Animal и реализует интерфейс Flyable
class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " sings");
    }

    @Override
    void move() {
        System.out.println(name + " flies");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars through the sky");
    }
}

// Класс Mammal наследует Animal
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " makes a sound");
    }

    @Override
    void move() {
        System.out.println(name + " walks");
    }
}

// Класс Fish наследует Animal
class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " bubbles");
    }

    @Override
    void move() {
        System.out.println(name + " swims");
    }
}

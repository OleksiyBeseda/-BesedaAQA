class A {
    void method() {
        System.out.println("Метод из класса A");
    }
}

class B extends A {
    @Override
    void method() {
        super.method();
        System.out.println("Метод из класса B");
    }
}

class C extends B {
    @Override
    void method() {
        super.method();
        System.out.println("Метод из класса C");
    }
}

public class Main {
    public static void main(String[] args) {
        C objC = new C();
        objC.method();
    }
}

public class Car {
    private String engine;
    private String transmission;

    // Конструктор класса
    public Car(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    // Методы getters и setters для переменных
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    // Метод toString для вывода информации об объекте
    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    // Переписанный метод equals для сравнения объектов по одному полю (например, engine)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    public static void main(String[] args) {
        // Создание двух объектов класса Car
        Car car1 = new Car("V6", "Automatic");
        Car car2 = new Car("V4", "Manual");

        // Сравнение объектов с помощью метода equals
        System.out.println("Сравнение по всем полям:");
        System.out.println("car1.equals(car2): " + car1.equals(car2));

        // Сравнение объектов только по полю engine
        System.out.println("\nСравнение по полю engine:");
        System.out.println("car1.getEngine().equals(car2.getEngine()): " + car1.getEngine().equals(car2.getEngine()));

        // Вывод объектов на консоль с использованием метода toString
        System.out.println("\nВывод объектов на консоль:");
        System.out.println("car1: " + car1);
        System.out.println("car2: " + car2);
    }
}

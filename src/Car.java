public class Car {
    private String engine;
    private String color;

    public Car(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        if (engine != null && !engine.isEmpty()) {
            this.engine = engine;
        } else {
            throw new IllegalArgumentException("Двигатель должен быть непустой строкой");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Цвет должен быть непустой строкой");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("V8", "Red");

        System.out.println("Двигатель: " + myCar.getEngine());
        System.out.println("Цвет: " + myCar.getColor());

        myCar.setEngine("V12");
        myCar.setColor("Blue");

        System.out.println("Новый двигатель: " + myCar.getEngine());
        System.out.println("Новый цвет: " + myCar.getColor());
    }
}

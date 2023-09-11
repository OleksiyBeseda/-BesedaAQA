import java.util.ArrayList;
import java.util.LinkedList;

class CarException extends Exception {
    public CarException(String message) {
        super(message);
    }
}

public class Car {
    private String make;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) throws CarException {
        if (make == null || make.isEmpty()) {
            throw new CarException("Марка автомобиля не может быть пустой");
        }
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws CarException {
        if (year < 1886) {
            throw new CarException("Год выпуска автомобиля не может быть раньше 1886 года");
        }
        this.year = year;
    }

    public static void main(String[] args) {
        try {
            // Создание объекта Car
            Car car = new Car();

            // Установка марки, вызывает исключение
            car.setMake("");

            // Установка неправильного года, вызывает исключение
            car.setYear(1800);
        } catch (CarException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        // Создание ArrayList и LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление 10 значений
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Удаление 3 элементов на выбор
        arrayList.remove(2);
        arrayList.remove(4);
        arrayList.remove(6);

        // Изменение элемента по индексу
        arrayList.set(1, 99);

        // Вывод ArrayList и LinkedList
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}

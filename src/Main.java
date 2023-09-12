import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем список с объектами Dog
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

        // Создаем множество с объектами Animal
        Set<Animal> animalSet = new HashSet<>();
        animalSet.add(new Animal());
        animalSet.add(new Animal());

        // Вызываем метод, передавая коллекции
        processCollection(dogList);
        processCollection(animalSet);
    }

    // Создаем класс с дженериком и методом для обработки коллекций
    public static <T> void processCollection(Iterable<T> collection) {
        for (T item : collection) {
            System.out.println(item.toString()); // Просто выводим элементы коллекции
        }
    }
}

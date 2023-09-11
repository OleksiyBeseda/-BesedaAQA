import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список с повторяющимися числами
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 4, 3, 2, 1, 2, 3, 5));

        // Вызываем метод для подсчета повторений числа 2
        int count = countOccurrences(numbers, 2);

        // Выводим результат
        System.out.println("Количество повторений числа 2: " + count);
    }
    public static int countOccurrences(List<Integer> list, int number) {
        // Используем Collections.frequency для подсчета повторений числа
        return Collections.frequency(list, number);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем список с повторяющимися значениями
        List<String> list = Arrays.asList("Java", "Python", "Perl", "C++", "Java", "C++", "C#");

        // Создаем множество для хранения уникальных значений
        Set<String> uniqueList = new HashSet<>(list);


        // Выводим уникальные значения
        for (String uniqueValue : uniqueList) {
            System.out.println(uniqueValue);
        }
    }
}

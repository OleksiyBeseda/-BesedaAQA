import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserOperations {
    public static void main(String[] args) {
        // Создаем список пользователей
        List<User> users = new ArrayList<>();
        users.add(new User("John", "Doe", 30, "john.doe@example.com"));
        users.add(new User("Alice", "Smith", 25, "alice.smith@example.com"));
        users.add(new User("Bob", "Johnson", 35, "bob.johnson@example.com"));
        users.add(new User("Eva", "Brown", 25, "eva.brown@example.com"));

        // 1. Отфильтруем и выведем уникальные фамилии на экран
        List<String> uniqueSurnames = users.stream()
                .map(User::getSurname)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Уникальные фамилии: " + uniqueSurnames);

        // 2. Отфильтруем по длине фамилии и выведем первое имя или выбросим исключение
        Optional<String> firstNameWithShortSurname = users.stream()
                .filter(user -> user.getSurname().length() < 8)
                .map(user -> user.getSurname()) // Используем доступ к полю name напрямую
                .findFirst();

        firstNameWithShortSurname.ifPresentOrElse(
                name -> System.out.println("Первое имя с короткой фамилией: " + name),
                () -> { throw new RuntimeException("Нет пользователей с короткой фамилией."); }
        );

        // 3. Отфильтруем по длине почты и выведем год рождения пользователей
        List<Integer> birthYears = users.stream()
                .filter(user -> user.getEmail().length() >= 10)
                .map(User::getAge)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Годы рождения пользователей с длиной почты >= 10 символов: " + birthYears);
    }
}

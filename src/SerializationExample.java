import java.io.*;

class Cat implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient double weight;

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Создаем объект Cat
        Cat cat = new Cat("Whiskers", 3, 4.5);

        // Записываем объект в файл
        try (FileOutputStream fos = new FileOutputStream("cat.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(cat);
            System.out.println("Объект Cat записан в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Считываем объект из файла и выводим на экран
        try (FileInputStream fis = new FileInputStream("cat.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Cat restoredCat = (Cat) ois.readObject();
            System.out.println("Восстановленный объект Cat: " + restoredCat);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

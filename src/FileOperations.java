import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        // Создаем папку
        File folder = new File("myFolder");
        boolean folderCreated = folder.mkdir();
        if (folderCreated) {
            System.out.println("Папка создана.");
        } else {
            System.out.println("Папка уже существует.");
        }

        // Создаем два файла в папке
        File file1 = new File("myFolder/file1.txt");
        File file2 = new File("myFolder/file2.txt");

        try {
            // Записываем фразу в первый файл
            FileWriter writer = new FileWriter(file1);
            writer.write("Java World");
            writer.close();

            // Читаем фразу из первого файла
            Scanner scanner = new Scanner(file1);
            String content = scanner.nextLine();
            scanner.close();

            // Записываем считанную фразу во второй файл
            FileWriter writer2 = new FileWriter(file2);
            writer2.write(content);
            writer2.close();

            System.out.println("Фраза успешно скопирована во второй файл.");

            // Удаляем оба файла
            if (file1.delete() && file2.delete()) {
                System.out.println("Оба файла удалены.");
            } else {
                System.out.println("Ошибка при удалении файлов.");
            }

            // Удаляем папку
            if (folder.delete()) {
                System.out.println("Папка удалена.");
            } else {
                System.out.println("Ошибка при удалении папки.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

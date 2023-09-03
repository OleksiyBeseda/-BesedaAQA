import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Определение размера массива с помощью Scanner
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание массива целых чисел (Integer)
        int[] array = new int[size];

        // Заполнение массива данными с использованием цикла for
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Вывод всех значений массива на экран с использованием цикла for
        System.out.println("Значения массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Закрываем Scanner, когда он больше не нужен !
        scanner.close();

        // Таблица умножения наоборот с использованием вложенного цикла for
        System.out.println("\nТаблица умножения наоборот:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= 1; j--) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }

        // Примеры использования циклов while и do-while
        int count = 0;
        System.out.println("\nПример цикла while:");
        while (count < 5) {
            System.out.println("Это цикл while, шаг " + count);
            count++;
        }

        count = 0;
        System.out.println("\nПример цикла do-while:");
        do {
            System.out.println("Это цикл do-while, шаг " + count);
            count++;
        } while (count < 5);

        // Создание и заполнение двумерного массива
        int[][] twoDimArray = new int[4][8];
        int value = 1;

        System.out.println("\nДвумерный массив:");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                twoDimArray[row][col] = value;
                value++;
                System.out.print(twoDimArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}

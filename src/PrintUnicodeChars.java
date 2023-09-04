public class PrintUnicodeChars {
    public static void main(String[] args) {
        // Вывод 3 символов из таблицы UnicodeExample (в отдельном файле)
        printUnicodeChars();

        // Перегруженные методы getSum
        System.out.println("getSum(int a) = " + getSum(5));
        System.out.println("getSum(int a, int b) = " + getSum(5, 10));
        System.out.println("getSum(double a, double b) = " + getSum(3.5, 2.7));
        System.out.println("getSum(int a, int b, int c) = " + getSum(5, 10, 20));
        System.out.println("getSum(double a, double b, double c) = " + getSum(3.5, 2.7, 1.2));
        System.out.println("getSum(int a, int b, int c, int d) = " + getSum(5, 10, 20, 30));
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("getSum(int[] numbers) = " + getSum(numbers));

        // Метод, возвращающий куб числа
        int number = 4;
        int cubeResult = cube(number);
        System.out.println("Куб числа " + number + " равен " + cubeResult);

        // Основные функции калькулятора
        int operand1 = 10;
        int operand2 = 5;
        System.out.println("Сумма: " + add(operand1, operand2));
        System.out.println("Разность: " + subtract(operand1, operand2));
        System.out.println("Произведение: " + multiply(operand1, operand2));
        System.out.println("Частное: " + divide(operand1, operand2));
    }

    public static void printUnicodeChars() {
        char[] unicodeChars = { '\u2600', '\u2713', '\u274C' };
        for (char c : unicodeChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static int getSum(int a) {
        return a;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSum(double a, double b, double c) {
        return a + b + c;
    }

    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double getSum(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static int getSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на ноль недопустимо.");
            return Double.NaN;
        }
    }
}

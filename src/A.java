public class A {
    public static class B {
        // Конструктор класса B
        public B() {
            System.out.println("Объект класса B создан");
        }
    }

    public static void main(String[] args) {
        // Создание объекта класса B
        B b = new B();

        // Пример использования перечисления Time
        Time time = Time.BREAKFAST;
        switch (time) {
            case BREAKFAST:
                System.out.println("Time to breakfast");
                break;
            case LUNCH:
                System.out.println("Time to lunch");
                break;
            case DINNER:
                System.out.println("Time to dinner");
                break;
            default:
                System.out.println("Unknown time");
        }

        // Пример использования перечисления Calc
        double num1 = 5.0;
        double num2 = 2.0;
        Calc operation = Calc.ADDITION;

        switch (operation) {
            case ADDITION:
                System.out.println("Результат сложения: " + (num1 + num2));
                break;
            case SUBTRACTION:
                System.out.println("Результат вычитания: " + (num1 - num2));
                break;
            case MULTIPLICATION:
                System.out.println("Результат умножения: " + (num1 * num2));
                break;
            case DIVISION:
                if (num2 != 0) {
                    System.out.println("Результат деления: " + (num1 / num2));
                } else {
                    System.out.println("Деление на ноль невозможно");
                }
                break;
            case EXPONENTIATION:
                System.out.println("Результат возведения в степень: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}

enum Time {
    BREAKFAST,
    LUNCH,
    DINNER
}

enum Calc {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    EXPONENTIATION
}

public class FindMiddle {
    public static void main(String[] args) {
        String str = "Concatenation";
        int length = str.length();

        // Найти индекс среднего символа
        int middleIndex = length / 2;

        // Извлечь средний символ (если строка имеет четную длину, взять два средних символа)
        String middle;
        if (length % 2 == 0) {
            middle = str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            middle = str.substring(middleIndex, middleIndex + 1);
        }

        System.out.println("Среднее значение: " + middle);
    }
}

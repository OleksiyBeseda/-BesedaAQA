public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Способ 1: Используя оператор "+"
        String result1 = str1 + str2;

        // Способ 2: Используя метод concat()
        String result2 = str1.concat(str2);

        // Способ 3: Используя StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String result3 = sb.toString();

        System.out.println("Способ 1: " + result1);
        System.out.println("Способ 2: " + result2);
        System.out.println("Способ 3: " + result3);
    }
}

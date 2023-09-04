public class UnicodeExample {
    public static void main(String[] args) {
        String unicode1 = "&#916;";
        String unicode2 = "&#917;";
        String unicode3 = "&#918;";

        String char1 = unescapeHtml4(unicode1);
        String char2 = unescapeHtml4(unicode2);
        String char3 = unescapeHtml4(unicode3);

        System.out.println(char1); // Выведет символ Δ
        System.out.println(char2); // Выведет символ Ε
        System.out.println(char3); // Выведет символ Ζ
    }

    public static String unescapeHtml4(String input) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int length = input.length();

        while (index < length) {
            char c = input.charAt(index);
            if (c == '&') {
                int semicolonIndex = input.indexOf(';', index);
                if (semicolonIndex != -1) {
                    String entity = input.substring(index, semicolonIndex + 1);
                    result.append(unescapeEntity(entity));
                    index = semicolonIndex + 1;
                } else {
                    result.append(c);
                    index++;
                }
            } else {
                result.append(c);
                index++;
            }
        }

        return result.toString();
    }

    public static String unescapeEntity(String entity) {
        // Здесь вы можете реализовать логику раскодирования различных HTML-сущностей
        // Ваш код может быть более сложным, чтобы обрабатывать больше сущностей
        if (entity.equals("&#916;")) {
            return "Δ";
        } else if (entity.equals("&#917;")) {
            return "Ε";
        } else if (entity.equals("&#918;")) {
            return "Ζ";
        } else {
            // Если неизвестная сущность, вернуть исходную строку
            return entity;
        }
    }
}

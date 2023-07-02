@@ -1,43 +1,85 @@
        import java.util.Arrays;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte byteVar = 11;
        short shortVar = 22;
        int intVar = 33;
        long longVar = 444;

        float floatVar = 55.5f;
        double doubleVar = 66.6;

        char charVar = 'A';
        boolean booleanVar = true;
        String stringVar = "Hello";

        // Примеры стандартных операторов
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(48/2);
        System.out.println(48%2);


        // Примеры операций над переменными
        int sum = byteVar + shortVar; // Неявное преобразование: byte преобразуется в short
        long product = multiply(intVar, longVar); // Неявное преобразование: int преобразуется в long
        double division = divide(floatVar, doubleVar); // Неявное преобразование: float преобразуется в double

        // Явное преобразование (кастинг)
        int explicitCast = (int) longVar; // Явное преобразование long в int
        byte byteSum = (byte) (byteVar + shortVar); // Явное преобразование: результат суммы приводится к типу byte

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Explicit cast: " + explicitCast);
        System.out.println("Byte sum: " + byteSum);
    }
    public static int add(byte a, short b) {
        return a + b;
    }
}
        /*
        0 ->  1 -> 2 -> 3 -> 4
        12   13   14   15   16
         */


//        int [] array = new int[10];
//
//        int array2 [] = new int[11];
//
//        int array3 [] = {1, 2, 3, 4, 5, 6};
//
//        int array4 [] = new int[] {1, 2, 3, 4, 5, 6};

//        int [][] arr = new int[3][3];

//        arr[0][0] = 2;
//        arr[0][1] = 3;
//        arr[0][2] = 4;
//
//        arr[1][0] = 5;
//        arr[1][1] = 6;
//        arr[1][2] = 7;
//
//        arr[2][0] = 8;
//        arr[2][1] = 9;
//        arr[2][2] = 10;
//
//        System.out.println(arr[1][1]);

    int[] arr3 = new int[10];

        for (int i = 0; i < arr3.length; i++) {
        arr3[i] = i +1;
        }

        System.out.println(Arrays.toString(arr3));

        /*
         * arr - Array [] []
         * [
         * [2, 3, 4]
         * [5, 6, 7]
         * [8, 9, 10]
         * ]
         *
         */



        }
        }






//
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//
//       int b = a > 10  ? 15 : 22;
//
//       System.out.println("B =" + b);


//        String s = "Hello";

//        if (a > b) {
//            System.out.println("a > b");
//
//        if (c > d) {
//            System.out.println("c > d");
//        }
//        }
//    }
//}
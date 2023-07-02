@@ -0,0 +1,40 @@
        import java.util.Arrays;

public class loops {
    public static void main(String[] args) {

//        int [] array = new int[10];
//
//        int array2 [] = new int[11];
//
//        int [] array3  = {1, 2, 3, 4, 5, 6};
//
//        int [] array4 = new int[] {1, 2, 3, 4, 5, 6};
//
//        int [] [] array5 = new int[5][5];

        /*
        [
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        [1, 2, 3, 4, 5]
        ]
         */

//        int[] arr3 = {1, 2, 3, 4, 5};
//
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i + 1;
//        }
//        System.out.println(Arrays.toString(arr3));

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
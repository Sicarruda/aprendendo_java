package first_java.algoritmos.selection_sort;

import java.util.Arrays;

public class Selection_sort {

    public static void main(String[] args) {
        int[] test_array = { 2, 6, 8, 4, 5, 9, 7, 0, 1, 3 };

        System.out.println(selection_sort(test_array));
    }

    public static String selection_sort(int[] array_num) {
        int len_array = array_num.length;

        for (int i = 0; i < len_array - 1; i++) {

            for (int j = i + 1; j < len_array; j++) {
                if (array_num[i] > array_num[j]) {
                    int bigger = array_num[i];
                    array_num[i] = array_num[j];
                    array_num[j] = bigger;
                }
            }
        }
        return Arrays.toString(array_num);
    }
}

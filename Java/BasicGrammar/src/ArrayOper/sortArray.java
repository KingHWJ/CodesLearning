package ArrayOper;

import java.lang.reflect.Array;
import java.util.Arrays;

// 数组排序
public class sortArray {
    public static void main(String[] args) {
        int[] array = {10, 6, 13, 2, 4, 1, 54, 12};
        int[] array2 = {111, 21, 31, 14, 16, -2, -54, 102};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));

        System.out.println("冒泡排序：");
        System.out.println("排序前：");
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] > array2[j]) {
                    int temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array2));

    }
}

package ArrayOper;

import java.util.Arrays;

/*
数组操作
- 排序
- 遍历
- 多维数组

数组创建后，不可以更改长度
 */
public class aArray {
    public static void main(String[] args) {
        System.out.println("创建数组的三种方式：");

        System.out.println("方式 1");
        int[] array1 = new int[5];      // 指定数组大小和类型，初始值都是0 或false 或null
        printArray(array1);

        System.out.println("\n方式2");
        int[] array2 = new int[]{10, 20, 30, 40, 50};   // 不指定具体长度，直接添加数组内容，建好后，无法更改长度
        printArray(array2);

        System.out.println("\n方式3");
        int[] array3 = {1, 2, 3, 4, 5};     // 不指定具体大小，直接初始化数组的值，方式2的简化方法，不需要new int[] 直接添加{}
        printArray(array3);

        System.out.println("for each 遍历数组");
        for (int num:array2) {
            System.out.println(num);
        }

        System.out.println("Arrays.toString方法可以直接遍历数组");
        System.out.println(Arrays.toString(array2));
    }


    public static void printArray(int[] array) {
        System.out.println("遍历数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

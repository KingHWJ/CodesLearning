package ArrayOper;

import java.util.Arrays;

// 多维数组
public class nArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = 12;
            }
        }
        // [[I@f6f4d33, [I@23fc625e, [I@3f99bd52, [I@4f023edb, [I@3a71f4dd]
        // 多维数组不能直接打印，否则只能打印最外面的数组，内部还是数组对象
//        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }
}

package DataType;

// 自动类型转换
public class DataConvert {
    public static void main(String[] args) {
        /*
        byte、short -> int -> long - double
         */

        byte b1 = 10;
        int i1 = b1 + 20;
        System.out.println(i1);

        short s1 = 200;
        int i2 = s1 + 233;
        System.out.println(i2);

        // java: 不兼容的类型: 从int转换到byte可能会有损失
        // int i3 = 12345;
        // byte b2 = i3 + 12;
        // System.out.println(b2);

    }
}

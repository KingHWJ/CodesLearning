package DataType;

/*
基本数据类型
整型：byte short int long
浮点型：float double
字符型：char
布尔型：boolean
 */
public class Basiss {
    public static void main(String[] args) {

        byte b1 = 10;
        System.out.println(b1);

        System.out.println(Byte.MAX_VALUE);         // 最大数值 127
        System.out.println(Short.MAX_VALUE);        // 最大数值 32767
        System.out.println(Integer.MAX_VALUE);      // 最大数值 2147483647
        System.out.println(Long.MAX_VALUE);         // 最大数值 9223372036854775807

        System.out.println(Byte.MIN_VALUE);         // 最小数值 -128
        System.out.println(Short.MIN_VALUE);        // 最小数值 -32768
        System.out.println(Integer.MIN_VALUE);      // 最小数值 -2147483648
        System.out.println(Long.MIN_VALUE);         // 最小数值 -9223372036854775808

        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.TYPE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);

        char c1 = 'a';
        byte r =  'a' + 30;
        System.out.println(c1);
        System.out.println(c1 /2);     // 字符型在遇到数字，做运算时，是先转换为int型计算，再做对应的运算
        System.out.println(c1 + '\t');
        System.out.println(c1 + "\t"); // 字符型和字符串拼接时，会被转换成字符串类型
        System.out.println(c1 - '\t');
        System.out.println(r);


    }

}


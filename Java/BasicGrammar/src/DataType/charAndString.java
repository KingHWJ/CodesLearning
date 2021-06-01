package DataType;

// 字符和字符串
public class charAndString {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);

        int a1 = c1;
        int a2 = c2;
        System.out.println(a1);     // 65
        System.out.println(a2);     // 20013

        System.out.println('\u0041');

    }
}

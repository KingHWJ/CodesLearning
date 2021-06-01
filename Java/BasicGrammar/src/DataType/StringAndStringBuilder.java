package DataType;

public class StringAndStringBuilder {

    public static void main(String[] args) {
        StringTest();

        int i = 'A';
        System.out.println(i);  // 空格的ASCII码是32

        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;
        int b = 105;
        int c = 65281;
        System.out.println(a + b + c);                              // 65458
        System.out.println((char) a + (char) b + (char) c);         // 65458
        System.out.println(' ' + (char) a + (char) b + (char) c);   // 65490
        System.out.println("" + (char) a + (char) b + (char) c);    // Hi!
    }

    public static void StringTest() {
        String s1 = "";

        for (int i = 0; i < 123; i++) {
            System.out.println("" + i+ (char)i);
        }

        System.out.println(s1);

    }

}


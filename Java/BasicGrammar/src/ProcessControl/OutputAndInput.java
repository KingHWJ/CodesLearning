package ProcessControl;


import java.util.Scanner;

public class OutputAndInput {
    public static void main(String[] args) {
        // 输出
        System.out.println("A,");
        System.out.println("B,");
        System.out.println("C,");
        System.out.println("D,");

        // 格式化输出
        String name = "hwj";
        System.out.printf("你好，%s\n",name);

        char c = 'a';
        System.out.printf("hello,%s\n",c);

        int a = 100;
        double d = 100;
        System.out.printf("one number,%d\n",a);     // 整数显示
        System.out.printf("one number,%x\n",a);     // 十六进制显示
        System.out.printf("one number,%e\n",d);     // 科学计数法显示
        // 输入
        Scanner scanner = new Scanner(System.in);   // 创建scanner对象
        System.out.println("Input your name!");
        String str = scanner.nextLine();            // 获取字符串
        System.out.println("输入的字符串是：" +str);
        int i = scanner.nextInt();
        System.out.println("输入的数字是：" + i);      // 获取数字
    }
}

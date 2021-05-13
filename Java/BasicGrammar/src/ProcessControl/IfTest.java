package ProcessControl;

import java.util.Scanner;

// if判断
public class IfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int i = scanner.nextInt();
        if(i >= 90){
            System.out.println("优秀了");
        } else if(i >= 80)
            System.out.println("良好");
        else if(i >= 60){
            System.out.println("及格了");
        }else{
            System.out.println("没及格");
        }
        // 判断引用类型是否相等
        String s1 = "hello";
//        String s1 = null;
        String s3 = s1;
        String s2 = "HELLO".toLowerCase();  // hello
        /*
        对于值类型的变量，== 判断值是否相等
        对于引用类型的变量，== 判断是否是同一个对象，若想判断引用类型变量的值是否相等，要使用equals方法
         */
        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }
        if(s1 == s3){
            System.out.println("s1 == s3");
        }else{
            System.out.println("s1 != s3");
        }
        if(s1.equals(s2)){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }
    }

}

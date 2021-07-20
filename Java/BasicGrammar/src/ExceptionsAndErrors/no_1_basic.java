package ExceptionsAndErrors;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class no_1_basic {

    @Test
    public void test1(){
        // 编译型错误
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);    // FileNotFoundException
//
//        int data = fis.read();
//        while (data != -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//
//        fis.close();
    }


    @Test
    public void main(){
        // main();                                      // StackOverflowError 1.栈溢出
        Integer[] arr = new Integer[1024*1024*1024];    // OutOfMemoryError   2.堆溢出
    }

    //******************以下是运行时异常***************************
    //ArithmeticException   算术异常
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);

        scanner.close();
    }

    //NumberFormatException
    @Test
    public void test4(){

        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);

    }

    //ClassCastException
    @Test
    public void test30(){
        Object obj = new Date();
        String str = (String)obj;
    }

    //IndexOutOfBoundsException
    @Test
    public void test20(){
        //ArrayIndexOutOfBoundsException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
        //StringIndexOutOfBoundsException
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    //NullPointerException
    @Test
    public void test10(){

//		int[] arr = null;
//		System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));

    }

    @Test
    public void test2(){
        String str = "123";
        String str2 = "abc";
        try{
            int i = Integer.parseInt(str2);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("格式转换错误异常");
        }
        catch (Exception e){
            System.out.println("发现一个错误");
        }

        System.out.println("继续执行");
    }

    @Test
    public void test3(){


        int num = method();
        System.out.println(num);

    }

    public int method(){
        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
            return 1;
        }catch (ArithmeticException e){
            System.out.println("分母不能为0");
            return 2;
        }finally {
            System.out.println("这段代码一定会被执行");
            return 3;
        }
    }


}




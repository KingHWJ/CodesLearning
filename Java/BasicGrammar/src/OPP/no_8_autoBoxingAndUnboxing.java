package OPP;

import org.junit.Test;

import java.util.Vector;

/*
  基本数据类型和包装类之间的转换
  int     Integer
  byte    Byte
  short   Short
  long    Long
  float   Float
  double  Double
  char    Character
  boolean Boolean

*/
public class no_8_autoBoxingAndUnboxing {
    @Test
    public void test1(){
        byte b1 = 10;
        int i1 = 100;
        short s1 = 123;
        long l1 = 23L;
        float f1 = 3.12f;
        double d1 = 3.33;
        char c1 = 'a';
        boolean bo1 = true;

        Byte byte1 = new Byte(b1);
        Byte byte2 = new Byte("1");
        Integer integer1 = new Integer(i1);

        System.out.println(byte1);
        System.out.println(integer1);

        // 包装类--基本数据类型      通过 xxxValue方法
        byte b = byte1.byteValue();
        System.out.println(b);
    }

    // 从java 5.0 之后，基本数据类型 --- 包装类之间相互转换，通过自动装箱拆箱
    @Test
    public void autoBoxing(){
        Integer i1 = 10;
        double d1 = 23.22;
        Double dd = d1;
        System.out.println(i1);
        System.out.println(dd);
    }

    // 自动拆箱
    @Test
    public void autoUnboxing(){
        Integer integer = 1000;
        System.out.println(integer + 23);
    }

    // 基本类型/包装类 --> 字符串
    @Test
    public void tostring(){

        Integer i1 = 234;
        float f2 = 123.4f;

        String s = String.valueOf(i1);
        String s1 = String.valueOf(f2);
        System.out.println(s);
        System.out.println(s1);

        System.out.println(s.getClass());
        System.out.println(s.getClass().getSuperclass());

    }

    // 字符串 ---> 基本类型/包装类
    @Test
    public void toBase(){
        String s1 = "123";
        Integer i = Integer.parseInt(s1);
        double d = Double.parseDouble(s1);
        System.out.println(i);
        System.out.println(d);

        System.out.println(i.getClass());

        String s2 = "a1111";        // NumberFormatException 必须是标准的数字格式的字符串，否则会报错
//        Integer i2 = Integer.parseInt(s2);
        boolean bb = Boolean.parseBoolean(s2);  // 布尔类型，只要不是true，全部都是false
        System.out.println(bb);
    }
    @Test
    public void test4(){
        // 在自动装箱和拆箱时，Integer类中定义了个Integercache缓存的东西，存储了[-128，127]的数，超过了这个数据，会重新new一个，用于提高效率
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);
        System.out.println(m.equals(n));

        Integer i = 128;
        Integer j = 128;
        System.out.println(i == j);

        
    }
}


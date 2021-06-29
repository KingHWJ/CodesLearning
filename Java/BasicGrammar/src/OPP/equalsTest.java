package OPP;

import java.util.Objects;

// equals（） 和 == 方法比较
public class equalsTest {

    public static void main(String[] args) {
        // 基本数据类型  == 比较的是值
        int i1 = 10;
        int i2 = 10;
        double d1 = 10.0;
        char c1 = 10;
        System.out.printf("i1 == i2 %b\n",i1==i2);
        System.out.printf("i1 == d1 %b\n",i1==d1);
        System.out.printf("i1 == c1 %b\n",i1==c1);  // char型数据，底层存储的是数字

        // 引用数据类型  == 比较的是地址值
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.printf("s1 == s2 %b\n",s1==s2);  // false

        String s3 = "hello";
        String s4 = "hello";
        System.out.printf("s3 == s4 %b\n",s3==s4);  // true

        /*
        以上两种创建字符串的区别
        - 通过new 创建的字符串对象，会在堆内存中开辟一个对象来存储,同时会将值放入常量池
        - 直接通过"" 创建的对象，会在常量池中寻找地址赋值，如果没有，则会在常量池中创建，然后把地址进行赋值
         */

        // equals方法  String 类中重写了object类中的equals方法
        System.out.printf("s1.equals(s2) %b\n",s1.equals(s2));  // true

        // 自定义类
        Customer cust1 = new Customer("hwj",12);
        Customer cust2 = new Customer("hwj",12);
        System.out.printf("cust1 == cust2 %b\n",cust1==cust2);              // false
        System.out.printf("cust1.equals(cust2) %b\n",cust1.equals(cust2));  // true

        System.out.println(cust1.toString());
        System.out.println(cust1);
        System.out.println(cust1.getClass());
        System.out.println(cust1.getClass().getSuperclass());



    }


}

class Customer{
    private String name;
    private int age;

    public Customer(){
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 自己重写的equals方法
//    public boolean equals(Object obj){
//        if (this == obj){
//            return true;
//        }
//        if(obj instanceof Customer){
//            Customer cust = (Customer)obj;
//            return this.age == cust.age && this.name.equals(cust.name);
//        }
//        return false;
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
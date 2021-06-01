package OPP;

public class no_2_construct_method {
    public static void main(String[] args) {
        Student s1 = new Student("孙悟空");

        System.out.println(s1.name);
        System.out.println(s1.isMale);
        System.out.println(s1.age);

    }

}

/*
1.当我们没有写构造方法时，编译器会 为我们自己添加一个空白的构造方法，无参数只有一个{}
2.当我们手动添加构造方法时，编译器不会再自动添加一个空白的构造方法
3.在对字段定义时，进行初始化后，最终的结果取决于构造方法中是否有新的内容
    java代码执行时，先执行字段初始化，然后在对构造方法的代码进行初始化
 */
class Student{
    String name = "张三";
    boolean isMale;
    int age = 20;

    // 构造方法
    public Student(String name,boolean isMale,int age){
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    public Student(String name) {
//        this.name = name;
        this();     // 一个构造方法，可以调用其他的构造方法
        this.name = name;
        System.out.println("现在我的年龄：" +  this.age);
    }

    public Student() {
        System.out.println("我先初始化");
        System.out.println("我的年龄：" + this.age);
        this.age = 500;
    }
}
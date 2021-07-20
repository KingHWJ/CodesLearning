package OPP;

// 代码执行顺序
/*
   1、父类的静态变量和静态块赋值（按照声明顺序）
　　2、自身的静态变量和静态块赋值（按照声明顺序）
　　3、main方法
　　3、父类的成员变量和块赋值（按照声明顺序）
　　4、父类构造器赋值
　　5、自身成员变量和块赋值（按照声明顺序）
　　6、自身构造器赋值
　　7、静态方法，实例方法只有在调用的时候才会去执行
 */
public class no_12_codeOrder {
    public static void main(String[] args) {
        System.out.println("开始执行");
        Leaf leaf = new Leaf();
        System.out.println(leaf.num);

        /*
        开始执行
        我是root 静态代码块
        我是mid 静态代码块
        我是leaf 静态代码块

        我是root 普通代码块
        我是root 的构造器

        我是mid 普通代码块
        我是mid 的无参构造器
        我是mid 的有参构造器 参数为：test

        我是leaf 普通代码块
        我是leaf 的无参构造器
         */
    }
}

class Root{
    static {
        System.out.println("我是root 静态代码块");
    }
    {
        System.out.println("我是root 普通代码块");
    }
    public Root(){
        System.out.println("我是root 的构造器");
    }

}

class Mid extends Root{

    static {
        System.out.println("我是mid 静态代码块");
    }
    {
        System.out.println("我是mid 普通代码块");
    }

    public Mid(){
        System.out.println("我是mid 的无参构造器");
    }

    public Mid(String name){
        this();
        System.out.println("我是mid 的有参构造器 参数为："+name);
    }
}

class Leaf extends Mid{
    int num = 10;

    {
        num = 50;
    }

    static {
        System.out.println("我是leaf 静态代码块");
    }
    {
        System.out.println("我是leaf 普通代码块");
    }
    public Leaf(){
        super("test");
        System.out.println("我是leaf 的无参构造器");
    }
}

package OPP;

public class no_11_codeBlock {

    public static void main(String[] args) {
//        System.out.println(Chair.str);

//        Chair chair1 = new Chair();
//        Chair chair2 = new Chair();

    }


}






class Chair{
    String name;
    static String str = "你好啊，我是一个静态变量";

    public void show(){
        System.out.println("我是一个非静态方法");
    }

    public static void shout(){
        System.out.println("我是一个静态方法");
    }

    static {
        System.out.println("我是一个静态代码块");
        shout();
    }

    static {
        System.out.println("我是第二个静态代码块");
        shout();

    }

    {
        System.out.println("我是一个非静态代码块");
        shout();
    }
}
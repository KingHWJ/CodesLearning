package OPP;

//  方法重载
public class no_3_OverLoad {
    public static void main(String[] args) {
        String n = "孙悟空";
        Hello h = new Hello();
        h.hello();
        h.hello(n);
        h.hello(n,5);

        // String类的重载方法
        String test = "Test a sentence";
        System.out.println(test.indexOf(97));       // 根据Unicode码查找字符串索引，未找到显示-1
        System.out.println(test.indexOf("en"));      // 根据字符串
        System.out.println(test.indexOf(101,9));      // 根据字符查找,并从指定位置查找,字符可传对应Unicode码的整数
        System.out.println(test.indexOf("se",4));
    }

}

class Hello{

    public void hello(){
        System.out.println("hello");
    }

    public void hello(String name){
        System.out.println("hello,"+name);
    }

    public void hello(String name,int age){
        if(age > 18){
            System.out.println("hello,"+name);
        }else
            System.out.println("hi,"+name);
    }

}


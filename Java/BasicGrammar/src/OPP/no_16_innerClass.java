package OPP;

/*
内部类
1.成员内部类
2.局部内部类（方法内，代码块内，构造器内）
3.静态内部类
4.匿名内部类

 */
public class no_16_innerClass {

    public static void main(String[] args) {
        // 创建一个外部类的实例
        Outer out = new Outer("outClass");
        System.out.println(out);
//        System.out.println(Outer.Inner);

        // 创建一个内部类的实例
        Outer.Inner in = out.new Inner();
        Outer.Inner in2 = new Outer("test").new Inner();
        in.hello();
        System.out.println(in);

        // 调用静态内部类
        PersonTest p1 = new PersonTest();
        PersonTest.Dog dog = new PersonTest.Dog();
        dog.shout();

        // 调用非静态内部类
        PersonTest.Bird bird = p1.new Bird();
        bird.sing();
    }
}


class Outer {
    private String name;

    // 外部类的构造器
    public Outer(String name) {
        this.name = name;
    }

    // 内部类
    class Inner {
        public void hello() {
            System.out.println("hello," + name);
            System.out.println(this);
            System.out.println(Outer.this);
        }
    }
}

class PersonTest{

    // 静态内部类
    static class Dog{
        String name;
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void shout(){
            System.out.println("我是一只狗");
        }
    }

    // 非静态内部类
    class Bird{
        String name;
        public void sing(){
            System.out.println("鸟儿爱歌唱");
        }
    }


    public Test get(){
        class Outers implements Test{
            String name;
        }

        return new Outers();
    }
}

interface Test{}

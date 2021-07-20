package OPP;

// 接口中的静态方法默认方法调用
public class no_15_2_interface_default_method {
    public static void main(String[] args) {
        A a = new A();
        a.method3();
    }
}


// java8之后，接口中可以创建默认方法和静态方法
/*
1.接口中定义的静态方法，只能通过接口调用
2.通过实现类的对象，可以调用接口中的默认方法，可以重写该方法
3.如果子类（或实现类）继承的父类和实现的接口中继承了同名同参数方法，那么在子类没有重写该方法时，默认调用的是父类的同名同参数方法 ---> 类优先原则
4.如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，那么在实现类没有重写此方法的情况下，报错 --> 接口冲突，这就需要我们必须在实现类中重写此方法
5.如何在子类（或实现类）的方法中调用父类、接口中被重写的方法 接口名.super.方法
 */
interface Inter1{
    static void method1(){
        System.out.println("我是接口中的静态方法");
    }

    default void method2(){
        System.out.println("我是接口1中的默认方法");
    }

}

interface Inter2{
    default void method2(){
        System.out.println("我是接口2中的默认方法");
    }
}

class A implements Inter1,Inter2{
    public void method2(){
        System.out.println("我是实现类中的方法，我重写了接口中的方法");
    }

    public void method3(){
        method2();
        Inter1.super.method2();
        Inter2.super.method2();
    }
}

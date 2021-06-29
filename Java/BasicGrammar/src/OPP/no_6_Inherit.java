package OPP;

// 继承
public class no_6_Inherit {
    public static void main(String[] args) {
        Cat miao = new Cat();
        miao.shout();
        miao.eat();
        miao.sleep();

        miao.test();

    }

}


class Animal {

    String name;

    public void eat() {
        System.out.println("吃饭！");
        name = "小王八蛋";
    }

    public Animal() {
        System.out.println("我是一个生物");
    }

    public Object sleep() {
        System.out.println("睡觉！");
        return true;
    }

    private void test(){
        System.out.println("我是父类的一个方法");
    }
}

class Cat extends Animal {
    int age;

    public Cat() {
        super();
        System.out.println(super.name);
    }

    public void shout() {
        System.out.println("喵喵叫！");
    }

//    @Override
    public Boolean sleep(){             // 子类重写方法的返回值类型，是父类被重写方法的一样和子类
        System.out.println("小猫爱睡觉！");
        return true;
    }

    public void test(){
        System.out.println("这是子类的一个方法");
    }
}
package OPP;

// 继承
public class no_6_Inherit {
    public static void main(String[] args) {
        Cat miao = new Cat();
        miao.shout();
        miao.eat();
        miao.sleep();

        miao.test();

        Manager[] managers = new Manager[10];

        Employee[] staff = managers;

//        managers[0] = new Manager();
        staff[0] = new Employee();  // 子类引用指向父类是不行的，这个等价于 Manager[] managers = new Employee[]


        System.out.println(managers[0]);
        System.out.println(staff[0]);

//        staff[0].setBonus(100);

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

class Employee{


}

class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}



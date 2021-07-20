package OPP;

/*
单例模式
一个类只能有一个对象，创建步骤
1.私有化构造器
2.在类内部创建一个对象
4.有一个调用该对象的方法
4.若要用类调用该方法，则必须是静态方法，若要是静态方法，则创建对象的属性也是静态的
 */
public class no_10_singleton {
    public static void main(String[] args) {
        Bank bank =  Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank);
        System.out.println(bank2);

        Bank2 bank21 = Bank2.getInstance();
        Bank2 bank22 = Bank2.getInstance();
        System.out.println(bank21);
        System.out.println(bank22);
    }

}

// 饿汉式单例 坏处：对象加载时间过长 好处：线程安全的
class Bank{
    private Bank(){
    }
    private static Bank instance = new Bank();
    public static Bank getInstance() {
        return instance;
    }
}

// 懒汉式单例 好处：延长对象创建时间 目前坏处是线程不安全的
class Bank2{
    private Bank2(){

    }

    // 先设置对象为null
    private static Bank2 instance = null;

    public static Bank2 getInstance() {
        if(instance == null){
            instance = new Bank2();
        }
        return instance;
    }
}
package OPP;

// 模板方法的设计模式
// 不确定的方法，异变的方法抽象出来
public class no_14_templateDesign {
    public static void main(String[] args) {

        new calcNum().process();

    }

}

abstract class Utills{

    public void process(){
        long start = System.currentTimeMillis();
        code();     // 不确定会用到哪个方法
        long end = System.currentTimeMillis();
        System.out.println("程序总共用时：" + (end-start));
    }

    abstract void code();
}


class calcNum extends Utills{

    @Override
    void code() {
        long sum = 0l;
        for(int i = 0;i<10230000;i++){
            if(i%2==0){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
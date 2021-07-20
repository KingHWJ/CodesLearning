package OPP;

// 抽象类和抽象方法
public class no_13_abstract {
    public static void main(String[] args) {
        new Basketball().play();

        // 匿名类
        BallSport a = new  BallSport(){

            @Override
            public void howWin() {
                System.out.println("我是一个匿名类，咋赢啊");
            }
        };

        a.howWin();
        System.out.println(a.getClass());
        System.out.println(a.getClass().getSuperclass());
    }



}


abstract class Sport{
    String name;
    abstract void play();

    public void show(){
        System.out.println("运动使人年轻");
    }
}

abstract class BallSport extends Sport{

    @Override
    void play() {
        System.out.println("球类运动");
    }

    abstract void howWin();
}

class Basketball extends BallSport{

    void play(){
        System.out.println("打篮球");
    }

    @Override
    void howWin() {
        System.out.println("得分比对方多，就算赢了");
    }
}
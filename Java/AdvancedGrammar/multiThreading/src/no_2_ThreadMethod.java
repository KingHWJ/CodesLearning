// Thread中的方法
public class no_2_ThreadMethod {

    public static void main(String[] args) {
        subThread1 t1 = new subThread1("子线程-1");
        subThread2 t2 = new subThread2();
        t2.setName("子线程-2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        Thread.currentThread().setName("主线程");
        System.out.println(Thread.currentThread().getName());

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        System.out.println(t1.isAlive());
        System.out.println(Thread.currentThread().isAlive());
    }

}

class subThread1 extends Thread{

    public subThread1(String name){
        setName(name);
    }
    public subThread1(){

    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i %2 == 0)
                System.out.println(getName() + ":" + i);
//            if(i == 20){
//                super.yield();
//            }
//
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
}

class subThread2 extends Thread{

    public subThread2(String name){
        setName(name);
    }
    public subThread2(){

    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i %2 != 0)
                System.out.println(getName() + ":" + i);

//            if(i == 30){
//                try {
//                    join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }
}



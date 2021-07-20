package OPP;

// 接口
public class no_15_interface {
    public static void main(String[] args) {
        Computer cp = new Computer();

        // 1.接口的非匿名实现类的非匿名对象
        Mouse mouse = new Mouse();
        cp.use(mouse);

        // 2.接口的非匿名实现类的匿名对象
        cp.use(new Keyboard());

        // 接口的匿名实现类的非匿名对象
        Usb phone = new Usb() {
            @Override
            public void start() {
                System.out.println("打开手机");
            }

            @Override
            public void close() {
                System.out.println("关闭手机");

            }

            @Override
            public void use() {
                System.out.println("使用手机");
            }
        };
        cp.use(phone);

        // 接口的匿名实现类的匿名对象
        cp.use(new Usb() {
            @Override
            public void start() {
                System.out.println("打开mp3");
            }

            @Override
            public void close() {
                System.out.println("关闭mp3");

            }

            @Override
            public void use() {
                System.out.println("使用mp3");
            }
        });


    }
}

// usb接口
interface Usb {

    public static final String name = "你好";
    static final int age = 12;
    final boolean isMale = true;

    // public static final 都可以省略

    public abstract void start();   // 开始方法

    void close();                   // 结束方法

    void use();
}

class Computer {

    public void use(Usb obj) {
        obj.start();
        obj.use();
        obj.close();
    }
}


class Mouse implements Usb {

    @Override
    public void start() {
        System.out.println("插入鼠标");
    }

    @Override
    public void close() {
        System.out.println("拔出鼠标");
    }

    @Override
    public void use() {
        System.out.println("使用鼠标");
    }
}

class Keyboard implements Usb {

    @Override
    public void start() {
        System.out.println("插入键盘");
    }

    @Override
    public void close() {
        System.out.println("拔出键盘");
    }

    @Override
    public void use() {
        System.out.println("使用键盘");
    }
}

//class Uboard implements Usb {
//
//    @Override
//    public void start() {
//        System.out.println("插入U盘");
//    }
//
//    @Override
//    public void close() {
//        System.out.println("拔出U盘");
//    }
//
//    @Override
//    public void use() {
//        System.out.println("使用U盘");
//    }
//}
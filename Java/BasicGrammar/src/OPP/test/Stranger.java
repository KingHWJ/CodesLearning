package OPP.test;

import OPP.PermissionTest;
import org.junit.Test;

public class Stranger {
    public static void main(String[] args) {
        PermissionTest p = new PermissionTest();

        p.publicVar = 1;
//        new Test().getNum();
//        p.protectedVar = 1;  不同包，不同子类，只能使用public
//        p.defaultVar = 1;  不同包但是是子类，缺省权限无法使用
//        p.privateVar = 1;  private 只能在同一类使用
    }

    @Test
    public void test(){
//        System.out.println(1/0);
    }
}

//class Test{
//    public Test() {
//        int num = 10;
//    }
//
//    public void getNum(){
//        System.out.println(num);
//    }
//}

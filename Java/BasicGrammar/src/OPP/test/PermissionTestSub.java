package OPP.test;

import OPP.PermissionTest;


public class PermissionTestSub extends PermissionTest {
    public static void main(String[] args) {

        PermissionTestSub p = new PermissionTestSub();
        p.publicVar = 1;
        p.protectedVar = 1;
//        p.defaultVar = 1;  不同包但是是子类，缺省权限无法使用
//        p.privateVar = 1;  private 只能在同一类使用
    }
}

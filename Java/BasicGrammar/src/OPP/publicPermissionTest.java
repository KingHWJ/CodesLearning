package OPP;

// 与PermissionTest 同一个包
public class publicPermissionTest {

    public static void main(String[] args) {
        PermissionTest p = new PermissionTest();

        p.publicVar = 1;
        p.protectedVar = 1;
        p.defaultVar = 1;
//        p.privateVar = 1;  private 只能在同一类使用


    }
}

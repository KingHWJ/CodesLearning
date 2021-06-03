package OPP;

// 4种权限修饰符
/*
private 缺省 protected public
 */
public class no_5_Permission {
    public static void main(String[] args) {
        PermissionTest p  = new PermissionTest();

//        p.privateVar =  1;        private 只能类内部访问
        p.defaultVar = 1;
        p.protectedVar = 1;
        p.publicVar = 1;

//        p.methodPrivate();        private 只能类内部访问
        p.methodDefault();
        p.methodProtected();
        p.methodPublic();

    }
}



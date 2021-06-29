package Project.P2_CustomerInformationMange;

//  客户系统展示类
public class CustomerView {
    public static void main(String[] args) {
        new CustomerView().startInfo();
    }

    public void startInfo(){
        System.out.println("-------------------客户信息管理软件-----------------\n");
        System.out.println("                   1 添 加 客 户                   ");
        System.out.println("                   2 修 改 客 户                   ");
        System.out.println("                   3 删 除 客 户                   ");
        System.out.println("                   4 客 户 列 表                   ");
        System.out.println("                   5 退      出                   \n");
        System.out.println("                   请选择(1-5): _                \n");
    }

}

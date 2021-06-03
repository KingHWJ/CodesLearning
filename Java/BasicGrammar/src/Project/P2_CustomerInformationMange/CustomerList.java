package Project.P2_CustomerInformationMange;

// 客户列表类
public class CustomerList {

    private int count;      // 计算器

    public CustomerList() {
    }

    private Customer[] custArray = new Customer[100];

    // 添加客户
    public void add(Customer cust) {
        if (count >= custArray.length) {
            System.out.println("客户已存满，超出数组最大容量");
        } else {
            custArray[count] = cust;
        }
    }
    // 修改客户
    public void update(Customer cust){
        System.out.println("-----------------修改客户--------------------");
        System.out.println("-----------------修改完成--------------------");
    }

    // 删除客户
    public void delete(Customer cust){

    }

    // 展示客户列表
    public void showList() {
        System.out.println("-----------------客户列表--------------------");
        System.out.println("编号  姓名  性别  年龄  电话              邮箱              ");
        for (Customer cust : custArray) {
            System.out.printf("%d   %s  %s  %d  %s  %s\n", cust.getCustCode(), cust.getName(), cust.getIsMale(), cust.getAge(), cust.getPhoneNum(), cust.getEmail());
        }
        System.out.println("----------------客户列表完成-------------------");
    }

}

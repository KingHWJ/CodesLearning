package Project.P2_CustomerInformationMange;

// 客户类
public class Customer {

    public static void main(String[] args) {
        new Customer();

    }

    private int custCode;       // 客户编号
    private String name;        // 姓名
    private String isMale;         // 性别:0为男，1位女
    private int age;            // 年龄
    private String phoneNum;    // 电话号码
    private String email;       // 邮箱

    public Customer() {
    }

    public int getCustCode() {
        return custCode;
    }

    public void setCustCode(int custCode) {
        this.custCode = custCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsMale() {
        return isMale;
    }

    public void setIsMale(String isMale) {
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

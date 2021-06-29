package Project.P3_BankcountControl;

// 银行账号
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annuallnterestRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    // 返回月利率
    public double getMonthlyInterest(){
        return annuallnterestRate/12;
    }

    // 取款
    public void withdraw(double amount){
        if(balance == 0){
            System.out.println("您的余额为0");
        }else if(amount > balance){
            System.out.println("您的余额不足");
        }else{
            balance -= amount;
            System.out.printf("取款成功。取款%.2f元，余额：%.2f元\n",amount,balance);
        }
    }

    // 存款
    public void deposit(double amount){
        balance += amount;
        System.out.printf("存款成功。余额：%.2f元",balance);
    }

    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        System.out.println(account.getBalance());
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);

    }
}

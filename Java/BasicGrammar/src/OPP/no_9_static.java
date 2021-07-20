package OPP;

public class no_9_static {
    public static void main(String[] args) {
        Account account = new Account();
        Account account2 = new Account();
        System.out.println(account2.getAccount_num());
        System.out.println(account);
    }
}


class Account{
    private static int id = 10001;                  // 编号
    private String account_num;             // 账号
    private String password;                // 密码
    private double balance;                 // 存款余额
    private static double rate;             // 利率
    private double min_balance;             // 最小余额

    @Override
    public String toString() {
        return "Account{" +
                "account_num='" + account_num + '\'' +
                ", balance=" + balance +
                ", min_balance=" + min_balance +
                ", rate=" + rate +
                '}';
    }

    public Account(){
        account_num = String.valueOf(id++);
    }

    public String getAccount_num() {
        return account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Account.rate = rate;
    }

    public double getMin_balance() {
        return min_balance;
    }

    public void setMin_balance(double min_balance) {
        this.min_balance = min_balance;
    }
}
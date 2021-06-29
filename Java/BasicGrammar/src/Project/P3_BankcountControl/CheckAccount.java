package Project.P3_BankcountControl;

public class CheckAccount extends Account {

    private double overdraft;   // 可透支限额

    public CheckAccount(int id, double balance, double annuallnterestRate, double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            double next_amount = getBalance() - amount;
//            super.withdraw(amount);       // 方式2
            setBalance(next_amount);        // 方式1
            System.out.printf("取款成功。取款%.2f元，余额：%.2f元，可透支额度：%.2f元\n", amount, next_amount, overdraft);
        } else {
            if (amount < getBalance() + overdraft) {
                overdraft -= (amount - getBalance());
                setBalance(0);
                System.out.printf("使用透支额度，取款成功。取款%.2f元，余额：0元，可透支额度：%.2f元\n", amount, overdraft);
            } else {
                System.out.println("超过可透支额的限额，取款失败！");
            }
        }
    }

    public static void main(String[] args) {
        CheckAccount c = new CheckAccount(1122, 20000, 0.045, 5000);
        c.withdraw(5000);
        c.withdraw(18000);
        c.withdraw(3000);
    }
}


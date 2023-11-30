public class Bank extends Account {

    String name, id;
    int age;
    double minimumBalance, maximumWithdrawl;

    public Bank(String name, String accountId, int age, double minimumBalance, double maximumWithdrawal, double balance,
            double accountType, String dailyWithdrawalLimit) {
    }

    public Bank(String name, String id, int age, double minimumBalance, double maximumWithdrawl, double balance,
            String accountType, double dailyWithdrawalimit) {
        super(balance, accountType, dailyWithdrawalimit);
        this.name = name;
        this.id = id;
        this.age = age;
        this.minimumBalance = minimumBalance;
        this.maximumWithdrawl = maximumWithdrawl;
        this.accountType = accountType;
    }

    public void withdraw(double value) {
        if (value <= maximumWithdrawl && value <= dailyWithdrawalimit) {
            if (balance - value >= minimumBalance) {
                balance -= value;
                System.out.println("Withdrawal Successful. Balance left is: " + balance);
            } else {
                System.out.println("Withdrawal Failed. Below minimum balance");
            }
        } else {
            System.out.println("Withdrawal failed. Amount higher than withdrawal limit");
        }
    }

    public void deposit(double value) {
        balance += value;
        System.out.println("Amount deposited successfully. Balance is " + balance);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Daily Withdrawal Limit : " + dailyWithdrawalimit);
    }

}

public abstract class Account {
    public double balance;
    public String accountType;

    public double dailyWithdrawalimit;

    public Account() {

    }

    public Account(double balance, String accountType, double dailyWithdrawalimit) {
        this.balance = balance;
        this.accountType = accountType;
        this.dailyWithdrawalimit = dailyWithdrawalimit;
    }

    // getter and setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // getter and setter for account type
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getDailyWithdrawalimit() {
        return dailyWithdrawalimit;
    }

    public void setDailyWithdrawalimit(double dailyWithdrawalimit) {
        this.dailyWithdrawalimit = dailyWithdrawalimit;
    }

    public abstract void withdraw(double value);

    public abstract void deposit(double value);

    public abstract void display();

}

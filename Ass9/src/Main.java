import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        double maximumWithdrawal;
        Customer customer=null;
       Bank bankAccount;

        System.out.println("\nWelcome to My Banks Corporate Ltd\n");
        System.out.println("Create Account");
        System.out.println("Enter your name: ");
        String name=sc.next();

        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        while(age<18){
            System.out.println("ERROR. Minimum age should be 18 to create an account.");
            System.out.println("Please enter valid age: ");
            age=sc.nextInt();
        }

        customer=new Customer(name, age);

        System.out.println("Enter your account Id: ");
        String accountId = sc.next();

        System.out.println("Enter your account type: ");
        String accountType = sc.next();

        System.out.println("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter minimum balance: ");
        double minimumBalance = sc.nextDouble();

        System.out.println("Enter maximum Withdrawl limit: ");
        maximumWithdrawal = sc.nextDouble();

        System.out.println("Enter Daily Withdrawal Limit :");
        double dailyWithdrawalLimit = sc.nextDouble();

        bankAccount = new Bank(name, accountId, age, minimumBalance, maximumWithdrawal, dailyWithdrawalLimit,balance,accountType);
        System.out.println("Your Account Has Been Created.Thankyou.");

        while (true){

            System.out.println("\n1. Display Account\n2. Check Balance\n3. Deposit Amount\n4. Withdraw Amount\n5.Change Withdrawal Limit\n6.Daily Withdrawal Limitn\n7. Exit\nEnter your choice: ");
            int ch = sc.nextInt();
            int sol =1;
            switch (ch){


                case 1:
                    if(bankAccount != null){

                        bankAccount.display();
                    }
                    else{
                        System.out.println("No Such Account Found In Records");
                    }
                    break;

                case 2:
                    if(bankAccount != null) {
                        System.out.println("Balance is: " + bankAccount.getBalance());
                    }
                    else{
                        System.out.println("No Such Account Found In Records");
                    }
                    break;

                case 3:
                    if(bankAccount != null){
                        System.out.println("Enter the amount you want to deposit: ");
                        double depositAmount = sc.nextDouble();
                        bankAccount.deposit(depositAmount);
                    }
                    else{
                        System.out.println("Account not created yet.");
                    }
                    break;

                case 4:
                    if(bankAccount != null){
                        System.out.println("Enter the amount you want to withdraw:");
                        double withdrawalAmount = sc.nextDouble();
                        bankAccount.withdraw(withdrawalAmount);
                    }
                    else{
                        System.out.println("Account not created yet.");
                    }
                    break;
                case 5:
                    System.out.println("Enter New Withdrawal Limit : ");
                    double newWithdrawalLimit = sc.nextDouble();
                    maximumWithdrawal = newWithdrawalLimit;
                    System.out.println("Your Withdrawal Limit is Changed.\nNew Withdrawal Limit is:"+ maximumWithdrawal);
                    break;
                case 6:
                    System.out.println("Your Daily Wihtdrawal limit is: "+bankAccount.dailyWithdrawalimit);
                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.print("Do you want to perform more actions? (yes/no): ");
            choice = sc.next();
            if(choice=="no") {
                break;
            }
        }
    }

}
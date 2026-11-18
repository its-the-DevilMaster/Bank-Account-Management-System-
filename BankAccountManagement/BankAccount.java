public class BankAccount {
 //Data members
    int accountNumber;
    String accountHolderName;
    double balance;

    //Parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;        
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    //Deposit Method
    void deposit(double amount){
        if(amount>0){
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    //Withdraw Method
    void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount.");
        }else if(amount<=balance){
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }else{
            System.out.println("Insufficient balance!");
        }
    }
    //Check Balance Method
    void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
    //Display Account Details Method
    void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

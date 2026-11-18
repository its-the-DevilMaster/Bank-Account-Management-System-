public class Main {
    public static void main(String[] args){
        //Creating two Bank Account objects
        BankAccount account1 = new BankAccount(101, "Disha", 5000.0);
        BankAccount account2 = new BankAccount(102, "Mannat", 8000.0);

        //Operations on Account 1
        System.out.println("Account 1 Details: ");
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.checkBalance();

        //Operations on Account 2
        System.out.println("\nAccount 2 Details: ");
        account2.deposit(3000);
        account2.withdraw(2000);
        account2.checkBalance();

        //Display final account details
        System.out.println("\nFinal Account Details: ");
        System.out.println("\nAccount 1 Details:  ");
        account1.displayDetails();
        System.out.println("\nAccount 2 Details: ");
        account2.displayDetails();
    }
}

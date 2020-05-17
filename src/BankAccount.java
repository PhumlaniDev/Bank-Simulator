import java.util.Scanner;

public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;

    public BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    public void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("Deposited " + previousTransaction);
        }

        else if (previousTransaction < 0){
            System.out.println("Withdrawn " + Math.abs(previousTransaction));
        }

        else{
            System.out.println("No transactions occurred");
        }
    }

    public void showMenu(){

        int options = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome " + customerName + " to World Bank");
        System.out.println("Your bank ID is " + customerID);
        System.out.println();

        do {
            System.out.println("--------------------------");
            System.out.println("Enter an option");
            System.out.println("--------------------------");
            System.out.println();
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Previous Transactions");
            System.out.println("5. Exit");
            options = scanner.nextInt();
            System.out.println();

            switch (options){
                case 1:
                    System.out.println("--------------------------");
                    System.out.println("Balance " + balance);
                    System.out.println("--------------------------");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("--------------------------");
                    System.out.println("Enter an amount");
                    System.out.println("--------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("--------------------------");
                    System.out.println("Enter an amount");
                    System.out.println("--------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("--------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("************************");
                    break;

                default:
                        System.out.println("Invalid option. Please try again.");
                        break;
            }
        } while (options != 5);
            System.out.println("Thanks for using World bank");
    }
}

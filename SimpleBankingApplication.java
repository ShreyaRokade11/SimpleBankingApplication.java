import java.util.Scanner;

public class SimpleBankingApplication
 {
    private static double balance = 0; // Initial balance

    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        System.out.println("Welcome to Simple Banking Application!");

        while (!quit)
       {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice)
           {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Thank you for using Simple Banking Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } 
       else
       {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw(Scanner scanner)
     {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0) 
        {
            if (balance >= amount)
          {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } 
            else
           {
                System.out.println("Insufficient funds.");
            }
        } 
       else
        {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void checkBalance()
   {
        System.out.println("Your current balance is: $" + balance);
    }
}

package lesson_06_Java.CreditCard;

public class CreditCard {
    public String accountNumber;
    public int currentAccountBalance;

    // Creating a constructor with two properties
    public CreditCard(String accountNumber, int currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    // Creating a method for a depositing money into the account
    public int depositingAnAmountIntoInAccount(int depositAmount) {
        return this.currentAccountBalance + depositAmount;
    }

    // Creating a method for withdrawing money from the account
    public int withdrawalOfTheAmountFromTheAccount(int withdrawalAmount) {
        if (this.currentAccountBalance < withdrawalAmount) {
            System.out.println("You cannot withdraw money from the account!");
            return this.currentAccountBalance;
        } else {
            return this.currentAccountBalance - withdrawalAmount;
        }
    }

    // Creating a method for displaying information on the screen
    public void displayingAccountInformation() {
        System.out.println("Account number: " + this.accountNumber + ". " +
                "Current balance: " + this.currentAccountBalance + ".");
    }
}

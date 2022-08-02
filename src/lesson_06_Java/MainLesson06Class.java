package lesson_06_Java;

import lesson_06_Java.CreditCard.CreditCard;
import lesson_06_Java.Computer.Computer;
import lesson_06_Java.Computer.RandomAccessMemoryInformation;
import lesson_06_Java.Computer.HardDiskDriveInformation;
import lesson_06_Java.CashMachine.CashMachine;

/**
 * 1. Create a class CreditCard with fields account number, current amount on the account.
 *    Add a method that allows you to charge an amount to a credit card.
 *    Add a method that allows you to withdraw some amount from the card.
 *    Add a method that displays the current information about the card.
 *    Write a program that creates three objects of class CreditCard given an account number and an initial amount.
 *
 *    Test script to check: put money on the first two cards and withdraw from the third.
 *
 * 2. Create a class to describe the computer, this class should contain fields: cost, model (string type), RAM and HDD.
 *    You should create your own classes for the RAM and HDD fields. Classes for RAM and HDD must have a default
 *    constructor and a constructor with all parameters.
 *    The RAM class has "name" and "capacity" fields.
 *    The HDD class has the fields "name", "capacity" and "type" (external or internal).
 *    The Computer class must have two constructors:
 *        - the first one - with cost and model parameters,
 *        - the second - with all fields.
 *    When creating a computer object using the first constructor, the RAM and HDD fields must be created using the
 *    default constructors. In each of the classes, provide methods for displaying complete information
 *    (displaying all fields and all values).
 *
 *    Test script to check:
 *        create an object "computer 1" using the first constructor and display information on the screen;
 *        create an object "computer 2" using the second constructor and display information on the screen.
 *
 * 3. Create a class that describes the ATM.
 *    The set of banknotes in the ATM must be specified by three properties: the number of banknotes of
 *    20, 50 and 100 denominations.
 *    Make a method for adding money to an ATM.
 *    Make a function that withdraws money, which takes the amount of money, and returns a boolean value -
 *    the success of the operation.
 *    When withdrawing money, the function should print how many bills of what denomination the amount is issued.
 *    Create a constructor with three parameters - the number of banknotes of each denomination.
 */
public class MainLesson06Class {
    public static void main(String[] args) {

        /*
            1. CreditCard class
        */
        // Creating three class objects
        CreditCard account1 = new CreditCard("BY00 0000 1234 5678", 1000);
        CreditCard account2 = new CreditCard("BY11 1111 8765 4321", 500);
        CreditCard account3 = new CreditCard("BY22 2222 0987 1234", 100);

        // First CreditCard test case
        outputSourceInformation(account1);
        accrualInformationOutput(account1);

        //Second CreditCard test case
        outputSourceInformation(account2);
        accrualInformationOutput(account2);

        // Third CreditCard test case
        outputSourceInformation(account3);
        withdrawalInformationOutput(account3);

        // Line to separate
        System.out.println("--------------------------------------------------\n");

        /*
            2. Computer class
        */
        // First object creation
        Computer computer1 = new Computer(1000, "HP");

        RandomAccessMemoryInformation memory1 = new RandomAccessMemoryInformation();
        memory1.memoryName = "Kingston";
        memory1.memorySpace = 16;

        HardDiskDriveInformation disk1 = new HardDiskDriveInformation();
        disk1.diskName = "Toshiba";
        disk1.diskSpace = 1024;
        disk1.diskType = "Internal";

        // Second object creation
        RandomAccessMemoryInformation memory2 = new RandomAccessMemoryInformation("Samsung", 32);
        HardDiskDriveInformation disk2 = new HardDiskDriveInformation("Seagate", 512, "External");
        Computer computer2 = new Computer(2000, "DELL", memory2, disk2);

        // First Computer test case
        computer1.displayingComputerInformation();

        // Second Computer test case
        computer2.displayingComputerInformation();

        // Line to separate
        System.out.println("--------------------------------------------------\n");

        /*
            3. CashMachine class
        */
        // Object creation
        CashMachine cashMachine = new CashMachine(1, 2, 3);

        // First CashMachine test case
        cashMachine.addMoney(10, 20, 50);
        System.out.println(cashMachine);
        System.out.println(cashMachine.withdrawMoney(1440));


    }

    /*
        Methods for class CreditCard
    */
    // Random generation of the amount to be deposited or withdrawn from the account
    public static int generationOfDepositOrWithdrawalAmount() {
        return (int) (Math.random() * 1000);
    }

    // Method for displaying source information
    public static void outputSourceInformation(CreditCard account) {
        account.displayingAccountInformation();
    }

    // Method for displaying information with depositing amounts
    public static void accrualInformationOutput(CreditCard account) {
        int accrualAmount = generationOfDepositOrWithdrawalAmount();
        System.out.println("You deposit: " + accrualAmount);
        System.out.println("Account balance: " + account.depositingAnAmountIntoInAccount(accrualAmount) + "\n");
    }

    // Method for displaying information with withdrawing amount
    public static void withdrawalInformationOutput(CreditCard account) {
        int withdrawalAmount = generationOfDepositOrWithdrawalAmount();
        System.out.println("You withdraw: " + withdrawalAmount);
        System.out.println("Account balance: " + account.withdrawalOfTheAmountFromTheAccount(withdrawalAmount));
    }
}

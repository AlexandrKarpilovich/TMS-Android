package lesson_06_Java.CashMachine;

public class CashMachine {
    int numberOfBanknotesDenomination20;
    int numberOfBanknotesDenomination50;
    int numberOfBanknotesDenomination100;

    // Constructor with all parameters
    public CashMachine(int denomination20, int denomination50, int denomination100) {
        this.numberOfBanknotesDenomination20 = denomination20;
        this.numberOfBanknotesDenomination50 = denomination50;
        this.numberOfBanknotesDenomination100 = denomination100;
    }

    // Method for adding the number of bills
    public void addMoney(int addMoney20, int addMoney50, int addMoney100) {
        this.numberOfBanknotesDenomination20 += addMoney20;
        this.numberOfBanknotesDenomination50 += addMoney50;
        this.numberOfBanknotesDenomination100 += addMoney100;
    }

    // Withdrawal method
    public boolean withdrawMoney(int withdrawAmount) {
        int numberDenomination20 = 0;
        int numberDenomination50 = 0;
        int numberDenomination100 = 0;

        // If the requested amount is incorrect, then false is returned
        if ((withdrawAmount % 50 != 0) && (withdrawAmount % 20 != 0)) {
            return false;
        }

        // If the amount can be issued, then the number of banknotes of each denomination is calculated
        if (withdrawAmount >= 100) {
            numberDenomination100 = withdrawAmount / 100;
            withdrawAmount -= numberDenomination100 * 100;
        }
        if (withdrawAmount >= 50) {
            numberDenomination50 = withdrawAmount / 50;
            withdrawAmount -= numberDenomination50 * 50;
        }
        if (withdrawAmount >= 20) {
            numberDenomination20 = withdrawAmount / 20;
        }
        System.out.println("Number of banknotes denomination 20: " + numberDenomination20 + ";" +
                "\t" + "Number of banknotes denomination 50: " + numberDenomination50 + ";" +
                "\t" + "Number of banknotes denomination 100: " + numberDenomination100);
        return true;
    }

    @Override
    public String toString() {
        return "CashMachine: {" +
                "Number of banknotes denomination 20: " + numberOfBanknotesDenomination20 +
                ", Number of banknotes denomination 50: " + numberOfBanknotesDenomination50 +
                ", Number of banknotes denomination 100: " + numberOfBanknotesDenomination100 +
                '}';
    }
}

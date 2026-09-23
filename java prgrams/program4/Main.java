class Account {
    String name;
    int accountNumber;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displaySavings() {
        System.out.println("Account Type: Savings Account");
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displayCurrent() {
        System.out.println("Account Type: Current Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    PremiumSavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displayPremium() {
        System.out.println("Account Type: Premium Savings Account");
    }
}

public class Main {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("Vinothini", 101);
        CurrentAccount c = new CurrentAccount("Subashree", 102);
        PremiumSavingsAccount p = new PremiumSavingsAccount("Vino", 103);

        System.out.println("Savings Account");
        s.displayDetails();
        s.displaySavings();

        System.out.println("\nCurrent Account");
        c.displayDetails();
        c.displayCurrent();

        System.out.println("\nPremium Savings Account");
        p.displayDetails();
        p.displayPremium();
    }
}
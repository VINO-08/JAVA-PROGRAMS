class Payment {

    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount);
    }

    void makePayment(double amount, String receiver) {
        System.out.println("Payment of Rs." + amount +
                           " to " + receiver);
    }

    void makePayment(String receiver, double amount, String note) {
        System.out.println("Payment of Rs." + amount +
                           " to " + receiver +
                           " for " + note);
    }
}

class UPIPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("UPI Payment of Rs." + amount + " successful");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p = new Payment();

        p.makePayment(500);
        p.makePayment(1000, "Arun");
        p.makePayment("Priya", 750, "Shopping");

        System.out.println();

        Payment upi = new UPIPayment();
        upi.makePayment(2000);
    }
}
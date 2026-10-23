class Printer {
    synchronized void printDocument() {
        System.out.println(Thread.currentThread().getName()
                + " is printing the document");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(Thread.currentThread().getName()
                + " finished printing");
    }
}

class UserThread extends Thread {
    Printer p;

    UserThread(Printer p, String name) {
        super(name);
        this.p = p;
    }

    public void run() {
        System.out.println(getName() + " started");

        p.printDocument();

        System.out.println(getName() + " terminated");
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Printer p = new Printer();

        UserThread t1 = new UserThread(p, "User-1");
        UserThread t2 = new UserThread(p, "User-2");

        System.out.println("Initial state: " + t1.getState());

        t1.start();
        t2.start();

        Thread.sleep(100);

        System.out.println("Current state: " + t1.getState());

        t1.join();
        t2.join();

        System.out.println("Final state: " + t1.getState());

        System.out.println(
                "Deadlock prevention: Single shared lock used");
    }
}
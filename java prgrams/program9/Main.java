class ReservationThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Reservation status: Ticket reservation "
                    + i + " completed.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation thread interrupted.");
            }
        }
    }
}

class StatusThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Confirmation status: Ticket confirmation "
                    + i + " completed.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status thread interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ReservationThread reservation = new ReservationThread();

        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);

        reservation.start();
        confirmation.start();
    }
}

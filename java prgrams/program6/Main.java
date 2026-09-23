interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    String brand = "Samsung";
    String model = "Smart TV";
    boolean status = false;

    @Override
    public void turnOn() {
        status = true;
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println("Smart TV is turned OFF");
    }

    @Override
    void displayAppliance() {
        System.out.println("Appliance: " + brand + " " + model);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Smart Home Appliance System");

        Appliance appliance = new SmartTV();

        appliance.displayAppliance();

        SmartTV tv = (SmartTV) appliance;

        tv.turnOn();
        tv.displayAppliance();

        tv.turnOff();
        tv.displayAppliance();

        System.out.println("Program stopped.");
    }
}
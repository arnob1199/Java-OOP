public class Car {

    String owner;
    String brand;
    String serialNumber;
    boolean isRunning;
    int fuelLevel;

    public Car (String owner, String brand, String serialNumber, int fuelLevel) {

        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    public void startCar() {

        if (fuelLevel > 0) {

            isRunning = true;
            System.out.println("Car started");
        }
        else {

            System.out.println("Fuel is empty. Cyannot start car");
        }
    }

    public void stopCar() {

        isRunning = false;
        System.out.println("Car stopped");
    }

    public void checkFuel() {

        System.out.println("Fuel level: " + fuelLevel + " litres");
    }

    public static void main(String[] args) {
        
        Car myCar = new Car("Arnob", "Toyota", "ABCD1234", 10);

        System.out.println("Owner name: " + myCar.owner);
        System.out.println("Brand name: " + myCar.brand);
        System.out.println("Serial number: " + myCar.serialNumber);
        myCar.startCar();
        System.out.println("Car status: " + (myCar.isRunning ? "Running" : "Stopped"));
        myCar.stopCar();
        System.out.println("Car status: " + (myCar.isRunning ? "Running" : "Stopped"));
        myCar.checkFuel();
    }
}


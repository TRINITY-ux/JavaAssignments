// Car.java
class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Error: Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    // Custom method to display car details
    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

// Main.java
public class CarAttributes {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2018, 18000.0);
        Car car3 = new Car("Ford", "Mustang", 2022, 35000.0);


        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Display original car details");
            System.out.println("2. Modify car attributes");
            System.out.println("3. Display modified car details");
            System.out.println("4. Attempt to set a negative price");
            System.out.println("5. Exit");

           int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.println("Original Car Details:");
                    System.out.println("Car 1 Details:");
                    car1.displayCarDetails();
                    System.out.println();

                    System.out.println("Car 2 Details:");
                    car2.displayCarDetails();
                    System.out.println();

                    System.out.println("Car 3 Details:");
                    car3.displayCarDetails();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Modify car attributes:");
                    System.out.println("Enter new year for Car 1:");
                    int newYear = Integer.parseInt(System.console().readLine());
                    car1.setYear(newYear);

                    System.out.println("Enter new price for Car 1:");
                    double newPrice = Double.parseDouble(System.console().readLine());
                    car1.setPrice(newPrice);

                    System.out.println("Enter new make for Car 2:");
                    String newMake = System.console().readLine();
                    car2.setMake(newMake);
                    break;

                case 3:
                    System.out.println("Modified Car Details:");
                    System.out.println("Car 1 Details:");
                    car1.displayCarDetails();
                    System.out.println();

                    System.out.println("Car 2 Details:");
                    car2.displayCarDetails();
                    System.out.println();

                    System.out.println("Car 3 Details:");
                    car3.displayCarDetails();
                    System.out.println();
                    break;

                case 4:
                    car1.setPrice(1000.0);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
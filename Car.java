public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor with four parameters
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Constructor with three parameters
    public Car(String make, String model, int year) {
        this(make, model, year, 0.0);
    }

    // Constructor with two parameters
    public Car(String make, String model) {
        this(make, model, 0, 0.0);
    }

    // Constructor with no parameters
    public Car() {
        this("Cephas", "Roys", 110, 20.0);
        this.printDetails();
    }

    // print details 
    public void printDetails(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

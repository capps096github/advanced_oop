package immutability;

public class MutableCar {
  // fields are not final so the values of the instance variables can be changed thus this is a mutable class
  public String make;
  private String model;
  public int year;
  public double price;

  // constructor for the mutable car
  public MutableCar(String make, String model, int year, double price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  // print details
  public void printDetails() {
    System.out.println("Make: " + make);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Price: " + price);
  }

  // instance method to change the make of the car
  public void changeMake(String newMake) {
    this.make = newMake; // this line will not throw an error because the value of the instance variable make can be changed
  }

  // get make since its private
  public String getMake() {
    return this.make;
  }

  // main method
  public static void main(String[] args) {
    // mutable car instance
    MutableCar mutableCar = new MutableCar("Cephas", "Roys", 110, 20.0);

    System.out.println("\n\nOriginal Mutable Car Details");
    // print the details of the car
    mutableCar.printDetails();

    // change the make of the car
    mutableCar.changeMake("Cephas Roys");

    System.out.println("\n\nNew Mutable Car Details");
    // print the details of the new car
    mutableCar.printDetails();

    // get the make of the car
    System.out.println("\n\nMake of the car: " + mutableCar.getMake());
  }
}

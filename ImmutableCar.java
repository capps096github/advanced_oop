public class ImmutableCar {
  // with the final keyword, the values of the instance variables cannot be changed which makes the class immutable
  final public String make;
  final public String model;
  final public int year;
  final public double price;

  // constructor for the immutable car
  public ImmutableCar(String make, String model, int year, double price) {
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
    // this.make = newMake; // this line will throw an error because the value of the instance variable make cannot be changed
  }

  // so to change the make of the car, we can create a new instance of the class and pass the new make as a parameter
  public ImmutableCar withNewMake(String newMake) {
    return new ImmutableCar(newMake, this.model, this.year, this.price);
  }

  
  // main method
  public static void main(String[] args) {
    // create an instance of the immutable car class
    ImmutableCar immutableCar = new ImmutableCar("Cephas", "Roys", 110, 20.0);
    // print the details of the car
    immutableCar.printDetails();


    // change the make of the car
    // immutableCar.changeMake("Cephas Roys"); // this line will throw an error because the value of the instance variable make cannot be changed

    // so to change the make of the car, we can create a new instance of the class and pass the new make as a parameter
    ImmutableCar newImmutableCar = immutableCar.withNewMake("Cephas Roys");
    // print the details of the new car
    newImmutableCar.printDetails();

  }
}

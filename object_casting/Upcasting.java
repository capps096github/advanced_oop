package object_casting;

class Animal {
  // type, for domestic or wild
  public String type;

  // constructor
  public Animal(String type) {
    this.type = type;
  }

  // print Details
  public void printDetails() {
    System.out.println("Type: " + type);
  }
}

// dog class inherits from animal class
class Dog extends Animal {
  // constructor
  public Dog(String type) {
    super(type);
  }
}

/**
 * Upcasting
 */
public class Upcasting {
  // this involves converting a subclass object to a superclass object

  public static void main(String[] args) {
    // create an instance of the animal class
    Animal animal = new Dog("Domestic Animal");

    // print details of the animal
    animal.printDetails();
  }
}

// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound();  // Abstract method implementation
        myDog.sleep();      // Inherited regular method
    }
}

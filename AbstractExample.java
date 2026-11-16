/**
 * Abstract classes: an abstract class can declare methods without a body
 * that every subclass must implement.
 */
public class AbstractExample {

    // Abstract class
    abstract static class Animal {
        // Abstract method (no body)
        abstract void makeSound();

        // Regular method
        void sleep() {
            System.out.println("Animal is sleeping...");
        }
    }

    // Subclass (inherits from Animal)
    static class Dog extends Animal {
        // Providing implementation for abstract method
        @Override
        void makeSound() {
            System.out.println("Dog says: Woof Woof!");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound();  // Abstract method implementation
        myDog.sleep();      // Inherited regular method
    }
}

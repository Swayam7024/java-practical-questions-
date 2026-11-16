/**
 * Interfaces: a class implements an interface by providing
 * a body for each of its methods.
 */
public class InterfaceExample {

    // Define an interface
    interface Animal {
        void makeSound();  // abstract method
    }

    // Implement the interface in a class
    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog says: Woof Woof!");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}

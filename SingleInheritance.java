/**
 * Single inheritance: a child class reuses the methods of one parent class
 * and adds its own.
 */
public class SingleInheritance {

    // Parent class
    static class Animal {
        void sound() {
            System.out.println("This is an animal sound.");
        }
    }

    // Child class inherits from Animal
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks: Woof Woof!");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound(); // inherited from Animal
        myDog.bark();  // defined in Dog
    }
}

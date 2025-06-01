// Define an interface
interface Animal {
    void makeSound();  // abstract method
}

// Implement the interface in a class
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}

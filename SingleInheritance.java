// Parent class
class Animal {
    void sound() {
        System.out.println("This is an animal sound.");
    }
}

// Child class inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.sound(); // inherited from Animal
        myDog.bark();  // defined in Dog
    }
}

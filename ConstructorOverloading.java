class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();                  // uses default constructor
        Student s2 = new Student("Alice");           // uses one-parameter constructor
        Student s3 = new Student("Bob", 20);         // uses two-parameter constructor

        s1.display();
        s2.display();
        s3.display();
    }
}

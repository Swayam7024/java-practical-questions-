<div align="center">

# ☕ Java Practical Questions

**Self-contained Java programs covering core programming and OOP concepts, each runnable on its own**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Swing%20%7C%20JavaFX-5382A1?style=for-the-badge)
![Programs](https://img.shields.io/badge/Programs-14-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

[Programs](#-programs) · [Getting Started](#-getting-started) · [Project Structure](#-project-structure)

</div>

---

## 📖 Overview

A collection of Java practical programs written to practise problem solving and object-oriented programming. Each file is self-contained (helper classes are nested inside it), so you can compile and run any program on its own or compile them all together.

## 📋 Programs

### Object-Oriented Programming
| Program | Concept |
|---|---|
| [`AbstractExample.java`](AbstractExample.java) | Abstract classes and abstract methods |
| [`InterfaceExample.java`](InterfaceExample.java) | Defining and implementing an interface |
| [`SingleInheritance.java`](SingleInheritance.java) | Single inheritance: a child class reusing parent methods |
| [`ConstructorOverloading.java`](ConstructorOverloading.java) | Multiple constructors with different parameters |

### Problem Solving (console input with `Scanner`)
| Program | What it does |
|---|---|
| [`ArraySum.java`](ArraySum.java) | Sums the elements of an array |
| [`CountCharacters.java`](CountCharacters.java) | Counts characters in a string |
| [`Factorial.java`](Factorial.java) | Calculates the factorial of a number |
| [`FibonacciSeries.java`](FibonacciSeries.java) | Prints the Fibonacci series |
| [`LinearSearch.java`](LinearSearch.java) | Searches an array with linear search |
| [`MergeArrays.java`](MergeArrays.java) | Merges two arrays into one |
| [`PalindromeCheck.java`](PalindromeCheck.java) | Checks whether input is a palindrome |
| [`ReverseNumber.java`](ReverseNumber.java) | Reverses the digits of a number |

### GUI Applications
| Program | What it does |
|---|---|
| [`LoginForm.java`](LoginForm.java) | Swing login window with username/password check (demo credentials `admin` / `1234`) |
| [`TemperatureConverter/`](TemperatureConverter) | JavaFX Celsius ⇄ Fahrenheit converter with input validation ([details](TemperatureConverter/README.md)) |

## 🚀 Getting Started

**Prerequisites:** JDK 17 or newer (`java -version`). The Temperature Converter also needs the [JavaFX SDK](https://openjfx.io/).

```bash
git clone https://github.com/Swayam7024/java-practical-questions-.git
cd java-practical-questions-

# Run any single program (Java 11+ can run a source file directly)
java Factorial.java

# Or compile everything and run by class name
javac -d out *.java
java -cp out FibonacciSeries
```

**Temperature Converter (JavaFX):**
```bash
cd TemperatureConverter
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls -d bin src/TemperatureConverter.java
java  --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls -cp bin TemperatureConverter
```

## 📁 Project Structure

```
java-practical-questions-/
├── AbstractExample.java        # OOP examples
├── InterfaceExample.java
├── SingleInheritance.java
├── ConstructorOverloading.java
├── ArraySum.java ... ReverseNumber.java   # problem-solving programs
├── LoginForm.java              # Swing GUI
└── TemperatureConverter/       # JavaFX app
    ├── src/TemperatureConverter.java
    └── README.md
```

## 🎯 Objectives

- Practise core Java syntax, control flow and arrays
- Understand OOP: abstraction, interfaces, inheritance and constructor overloading
- Build simple desktop GUIs with Swing and JavaFX

## 🤝 Contributing

Suggestions and improvements are welcome. Open an issue or submit a pull request.

## 👤 Author

**Swayam Khantwal**, MCA student
[![GitHub](https://img.shields.io/badge/GitHub-Swayam7024-181717?style=flat-square&logo=github)](https://github.com/Swayam7024)

## 📄 License

Released under the [MIT License](LICENSE).

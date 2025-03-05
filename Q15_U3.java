// Rohan is learning about inheritance and polymorphism in Java. He has created a base class Animal and two subclasses Dog and Cat, each with their own implementation of the makeSound() method. Rohan wants to write a program that:



// Creates Dog and Cat objects based on user input.
// Demonstrates polymorphism by using an Animal reference to call the makeSound() method for each object.
// Calculates and displays the total number of animals created.
// Note:

// The makeSound() method in the Animal class should output "Some sound".
// The overridden makeSound() method in Dog should output "Bark".
// The overridden makeSound() method in Cat should output "Meow".


// Help Rohan implement this program.

// Input format :
// The first line of input contains an integer n, the number of Dog objects.

// The second line contains an integer m, the number of Cat objects.

// Output format :
// The output should display the sounds made by all Animals, Dog and Cat objects, one per line.

// The last line prints the total number of animals.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 0 ≤ n, m ≤ 100

// Sample test cases :
// Input 1 :
// 3
// 2
// Output 1 :
// Some sound
// Bark
// Some sound
// Bark
// Some sound
// Bark
// Some sound
// Meow
// Some sound
// Meow
// Total animals: 5
// Input 2 :
// 1
// 2
// Output 2 :
// Some sound
// Bark
// Some sound
// Meow
// Some sound
// Meow
// Total animals: 3


    // Base class
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclass for Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass for Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of Dog objects
        int numberOfDogs = scanner.nextInt();
        // Input the number of Cat objects
        int numberOfCats = scanner.nextInt();

        // Total number of animals
        int totalAnimals = numberOfDogs + numberOfCats;

        // Array to store Animal references
        Animal[] animals = new Animal[totalAnimals];

        // Create Dog objects
        for (int i = 0; i < numberOfDogs; i++) {
            animals[i] = new Dog();
        }

        // Create Cat objects
        for (int i = numberOfDogs; i < totalAnimals; i++) {
            animals[i] = new Cat();
        }

        // Output sounds for all animals
        for (Animal animal : animals) {
            animal.makeSound(); // Demonstrates polymorphism
        }

        // Display total number of animals
        System.out.println("Total animals: " + totalAnimals);

        scanner.close();
    }
}

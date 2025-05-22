// You are implementing a Car Rental System program in Java. The program involves two classes: Vehicle and Car. The Car class is a subclass of the Vehicle class. Each car has its maximum speed, which can be set during the car's initialization.



// The Vehicle class has an attribute maxSpeed, which is set to 120 by default. The Car class extends the Vehicle class and has its attribute maxSpeed, which is set by the user during the car's initialization.



// Your task is to implement the program, where the user provides the maximum speed of the car they want to rent. The program then creates a Car object with the given maximum speed, using the super() keyword to call the default constructor of the base class Vehicle. It then displays both the maximum speed from the base class Vehicle using super.maxSpeed and the maximum speed from the subclass Car using maxSpeed.

// Input format :
// The input consists of an integer representing the maximum speed of the car the user wants to rent.

// Output format :
// The first line of output prints " Maximum Speed from Base class (Vehicle): " followed by the value of maxSpeed from the base class Vehicle.

// The second line of output prints " Maximum Speed from Subclass (Car):" followed by the value of max speed from the subclass Car.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 0 < maxSpeed ≤ 300

// Sample test cases :
// Input 1 :
// 12
// Output 1 :
// Maximum Speed from Base class (Vehicle): 120
// Maximum Speed from Subclass (Car): 12
// Input 2 :
// 56
// Output 2 :
// Maximum Speed from Base class (Vehicle): 120
// Maximum Speed from Subclass (Car): 56




class Vehicle {
    protected int maxSpeed; // Default max speed

    // Default constructor initializing maxSpeed to 120
    public Vehicle() {
        this.maxSpeed = 120;
    }
}

// Derived class: Car
class Car extends Vehicle {
    private int maxSpeed; // Car-specific max speed

    // Constructor to initialize the Car's max speed
    public Car(int maxSpeed) {
        super(); // Calls the Vehicle's constructor
        this.maxSpeed = maxSpeed;
    }

    // Method to display max speed from both base and subclass
    public void display() {
        System.out.println("Maximum Speed from Base class (Vehicle): " + super.maxSpeed);
        System.out.println("Maximum Speed from Subclass (Car): " + this.maxSpeed);
    }
}

class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carSpeed = scanner.nextInt();

        Car rentalCar = new Car(carSpeed);

 
        rentalCar.display();

        scanner.close();
    }
}
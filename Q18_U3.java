// Ashok is writing a program that focuses on calculating and displaying the calories burned during a workout for a fitness enthusiast. He has certain specifications as follows.



// Implement a class structure with a base class Person and a derived class FitnessEnthusiast that inherits from Person. The program should take user input for the fitness enthusiast's name, workout duration (in minutes), and calorie burn rate (calories burned per minute).



// Create a constructor for the FitnessEnthusiast class to initialize the name, workout duration, and calorie burn rate. Utilize the super keyword to invoke the constructor of the superclass. 



// Implement a method that calculates the calories burned during the workout using the formula (workout duration * calories burn rate). Display the calculated calories burned.



// Help Ashok to complete the program. 

// Input format :
// The first line of input consists of a string, representing the name.

// The second line consists of an integer, representing the workout duration in minutes.

// The third line consists of a double value, representing the calorie burn rate.

// Output format :
// The output prints "Calories Burned: X calories", where X is a double value, representing the calories burned, rounded off to one decimal place.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ workout duration ≤ 1200

// 1.00 ≤ calorie burn rate ≤ 50.00

// Sample test cases :
// Input 1 :
// Dinesh
// 30
// 9.7
// Output 1 :
// Calories Burned: 291.0 calories
// Input 2 :
// Sharon
// 120
// 28.14
// Output 2 :
// Calories Burned: 3376.8 calories




class Person {
    protected String name;
    
    public Person(String name) {
        this.name = name;
    }
}

// Derived class FitnessEnthusiast
class FitnessEnthusiast extends Person {
    private int workoutDuration;
    private double calorieBurnRate;
    
    public FitnessEnthusiast(String name, int workoutDuration, double calorieBurnRate) {
        super(name);
        this.workoutDuration = workoutDuration;
        this.calorieBurnRate = calorieBurnRate;
    }
    
    public double calculateCaloriesBurned() {
        return workoutDuration * calorieBurnRate;
    }
}

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String enthusiastName = scanner.nextLine();
       int workoutDuration = scanner.nextInt();
       double caloriesBurnRate = scanner.nextDouble();
       
       FitnessEnthusiast fitnessEnthusiast = new FitnessEnthusiast(enthusiastName, workoutDuration, caloriesBurnRate);
       System.out.printf("Calories Burned: %.1f calories", fitnessEnthusiast.calculateCaloriesBurned());
       
       scanner.close();
   }
}
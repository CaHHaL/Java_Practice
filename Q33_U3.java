// Jeevan is developing a fitness-tracking application to monitor daily physical activity.



// The application incorporates a FitnessTracker class that implements two interfaces: StepCounter for tracking the number of steps taken and CalorieCalculator for estimating total calories burned based on total steps.



// Jeevan needs your help creating a program.



// Note

// The calorie calculation formula is: Total caloriesBurned = (total steps / 100.0) * 20.0.

// Input format :
// The first line of input is an integer n, representing the number of days Jeevan wants to input data.

// The second line of input consists of space-separated integers, representing the number of steps Jeevan took on each day.

// Output format :
// The output displays the two lines in the following format:



// "Total Steps: <totalSteps>"

// where '<totalSteps>' is the sum of steps (integer) taken over 'n' days.



// "Calories Burned: <caloriesBurned>"

// where '<caloriesBurned>' is the estimated total calories (double-point number) burned based on the total steps taken rounded off to two decimal places.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, The test cases will fall under the following constraints:

// 1 ≤ n ≤ 10

// 1 ≤ steps ≤ 1000

// Sample test cases :
// Input 1 :
// 3
// 340 234 987
// Output 1 :
// Total Steps: 1561
// Calories Burned: 312.20
// Input 2 :
// 5
// 234 567 123 657 389
// Output 2 :
// Total Steps: 1970
// Calories Burned: 394.00



interface StepCounter {
    void countSteps(int steps);
    int getTotalSteps();
}

// Interface for calculating calories
interface CalorieCalculator {
    double calculateCaloriesBurned(int totalSteps);
}

// Class implementing both interfaces
class FitnessTracker implements StepCounter, CalorieCalculator {
    private int totalSteps;
    
    @Override
    public void countSteps(int steps) {
        totalSteps += steps;
    }
    
    @Override
    public int getTotalSteps() {
        return totalSteps;
    }
    
    @Override
    public double calculateCaloriesBurned(int totalSteps) {
        return (totalSteps / 100.0) * 20.0;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FitnessTracker tracker = new FitnessTracker();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int steps = scanner.nextInt();
            tracker.countSteps(steps);
        }

        int totalSteps = tracker.getTotalSteps();
        System.out.println("Total Steps: " + totalSteps);

        double caloriesBurned = tracker.calculateCaloriesBurned(totalSteps);
        System.out.printf("Calories Burned: %.2f%n", caloriesBurned);

        scanner.close();
    }
}
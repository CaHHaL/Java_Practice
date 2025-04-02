// Akash is learning programming and wants to understand the concept of the final keyword. His friend Roshini gave him a task to calculate the area of a rhombus using the final keyword.



// Create a base class named Shape with a method calculateArea() that can be overridden by subclasses. Then, create a final class Rhombus that extends Shape and contains private final member variables diagonal1 and diagonal2, representing the lengths of the diagonals. Implement a constructor to initialize these values and override the calculateArea() method to compute the area.



// Formula: 

// area = (0.5 * diagonal1 * diagonal2).

// Input format :
// The input consists of two space-separated double values, representing the length of the diagonals.

// Output format :
// The output prints a double value representing the area of the rhombus, rounded off to two decimal places.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1.0 ≤ diagonals ≤ 170.0

// Sample test cases :
// Input 1 :
// 15.3 12.5
// Output 1 :
// 95.63
// Input 2 :
// 1.0 8.6
// Output 2 :
// 4.30
// Input 3 :
// 159.3 170.0
// Output 3 :
// 13540.50



class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

// Final class Rhombus extending Shape
final class Rhombus extends Shape {
    private final double diagonal1;
    private final double diagonal2;

    // Constructor to initialize diagonals
    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * diagonal1 * diagonal2;
    }
}









public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diagonal1 = scanner.nextDouble();
        double diagonal2 = scanner.nextDouble();

        Rhombus rhombus = new Rhombus(diagonal1, diagonal2);

        double area = rhombus.calculateArea();

        System.out.printf("%.2f\n", area);

        scanner.close();
    }
}
// John, a software developer, is tasked with implementing a basic calculator in Java for a project. The team opts for an abstract class named "Calculator" as the foundation, featuring abstract methods for addition and multiplication.



// John extends this class with "BasicCalculator", providing implementations for addition and multiplication. He also creates a user-friendly interface for input and result display.

// Input format :
// The first line of input is an integer, num1.

// The second line of input is an integer, num2.

// Output format :
// The first line of output displays "Calculator Initialized", which is printed during the initialization of the abstract class.

// The second line of output displays "BasicCalculator Initialized," which is printed during the initialization of the concrete class.

// The third line of output displays the result of adding num1 and num2.

// The second line of output displays the result of multiplying num1 and num2.

// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// -100000 ≤ num1, num2 ≤ 100000

// Sample test cases :
// Input 1 :
// 2
// 3
// Output 1 :
// Calculator Initialized
// BasicCalculator Initialized
// 5
// 6
// Input 2 :
// -5
// 8
// Output 2 :
// Calculator Initialized
// BasicCalculator Initialized
// 3
// -40
// Input 3 :
// -9
// -2
// Output 3 :
// Calculator Initialized
// BasicCalculator Initialized
// -11
// 18





abstract class Calculator {
    public Calculator() {
        System.out.println("Calculator Initialized");
    }
    
    abstract int add(int a, int b);
    abstract int multiply(int a, int b);
}

// Concrete class implementing the calculator operations
class BasicCalculator extends Calculator {
    public BasicCalculator() {
        System.out.println("BasicCalculator Initialized");
    }
    
    @Override
    int add(int a, int b) {
        return a + b;
    }
    
    @Override
    int multiply(int a, int b) {
        return a * b;
    }
}


public class Main {
    public static void main(String args[]) {
        BasicCalculator calculator = new BasicCalculator();
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = calculator.add(num1, num2);
        System.out.println(sum);
        int product = calculator.multiply(num1, num2);
        System.out.println(product);
        scanner.close();
    }
}
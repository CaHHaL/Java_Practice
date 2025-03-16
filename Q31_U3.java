// John is developing a car loan calculator and has structured his program using two interfaces, Principal and InterestRate, defining methods for principal and interest rate retrieval.



// The Loan class implements these interfaces, taking principal and annual interest rates as parameters. User input is solicited for these values, and the program ensures their validity before performing calculations. If input values are invalid (less than or equal to zero), an error message is displayed.



// Note: Total interest = (principal * interest rate * years) / 100

// Input format :
// The first line of input consists of a double value P, representing the principal.

// The second line consists of an integer value R, representing the annual interest rate.

// The third line consists of an integer value N, representing the loan duration in years.

// Output format :
// If the input values are valid, print "Total interest paid: Rs. " followed by a double value, representing the total interest paid, rounded off to two decimal places.

// If the input values are invalid (negative or zero values for principal, annual interest rate, or loan duration), print "Invalid input values!".



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 0.00 < P < 10,00,000.00

// 1 ≤ R ≤ 100

// 0 < N < 25

// Sample test cases :
// Input 1 :
// 20000.00
// 5
// 5
// Output 1 :
// Total interest paid: Rs.5000.00
// Input 2 :
// 45000.25
// 0
// 2
// Output 2 :
// Invalid input values!




interface Principal {
    double getPrincipal();
}

interface InterestRate {
    double getInterestRate();
}

class Loan implements Principal, InterestRate {
    private double principal;
    private double interestRate;
    
    public Loan(double principal, double interestRate) {
        this.principal = principal;
        this.interestRate = interestRate;
    }
    
    @Override
    public double getPrincipal() {
        return principal;
    }
    
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    
    public double calculateTotalInterest(int years) {
        return (principal * interestRate * years) / 100;
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double carPrice = scanner.nextDouble();

        double annualInterestRate = scanner.nextDouble();

        int loanDuration = scanner.nextInt();

        if (carPrice <= 0 || annualInterestRate <= 0 || loanDuration <= 0) {
            System.out.println("Invalid input values!");
            return;
        }

        Loan carLoan = new Loan(carPrice, annualInterestRate);
        double totalInterest = carLoan.calculateTotalInterest(loanDuration);

        System.out.printf("Total interest paid: Rs.%.2f%n", totalInterest);
    }
}
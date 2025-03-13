// In ABC Company, Developers are tasked with developing a robust financial calculator system. The system consists of an abstract class FinancialCalculator with three key methods: calculateCompoundInterest, calculateFutureValue, and calculateMonthlyLoanPayment. The system includes two subclasses, InvestmentCalculator and LoanCalculator. 



// Users are prompted to input the principal amount, annual interest rate, and duration. Based on their choice between 1. Investment or a 2. loan, the system performs the relevant financial calculations and displays the results. 



// Note:

// Compound Intrest = P(1+Rate/100)n - P

// Future Value = P(1+Rate/100)n

// Loan/Month = (Loan Amount * Monthly Interest)/(1-(1+Monthly Interest)n

// Input format :
// The first line of input consists of a double value, representing the principal amount.

// The second line of input consists of a double value, representing the interest rate.

// The third line of input consists of an integer, representing the duration in years.

// The fourth line of input consists of an integer(1 or 2), representing the Investment Calculator / Loan Calculator.

// Output format :
// If the choice is the Investment Calculator, the output displays double values, representing compound interest and future value.

// If the choice is the Loan Calculator, the output displays double value, representing Monthly loan payments.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ choice ≤ 2

// 1 ≤ Principal Amount ≤ 109

// 1 ≤ Rate of Interest ≤ 99

// 1 ≤ Duration ≤ 50﻿

// Sample test cases :
// Input 1 :
// 10000
// 5
// 3
// 1
// Output 1 :
// Compound Interest: 1576.2500000000018
// Future Value: 11576.250000000002
// Input 2 :
// 25000.98
// 9.7
// 1
// 2
// Output 2 :
// Monthly Loan Payment: 2194.4965487873383
// Input 3 :
// 500000
// 8.7
// 5
// 3
// Output 3 :
// Invalid choice

abstract class FinancialCalculator {
    public abstract double calculateCompoundInterest(double principal, double rate, int years);
    public abstract double calculateFutureValue(double principal, double rate, int years);
    public abstract double calculateMonthlyLoanPayment(double principal, double rate, int years);
}

// Subclass for investment calculations
class InvestmentCalculator extends FinancialCalculator {

    @Override
    public double calculateCompoundInterest(double principal, double rate, int years) {
        double futureValue = calculateFutureValue(principal, rate, years);
        return futureValue - principal; // Compound Interest = Future Value - Principal
    }

    @Override
    public double calculateFutureValue(double principal, double rate, int years) {
        return principal * Math.pow((1 + rate / 100), years); // Future Value Formula
    }

    @Override
    public double calculateMonthlyLoanPayment(double principal, double rate, int years) {
        // Not applicable for investment, returning 0
        return 0;
    }
}

// Subclass for loan calculations
class LoanCalculator extends FinancialCalculator {

    @Override
    public double calculateCompoundInterest(double principal, double rate, int years) {
        // Not applicable for loan, returning 0
        return 0;
    }

    @Override
    public double calculateFutureValue(double principal, double rate, int years) {
        // Not applicable for loan, returning 0
        return 0;
    }

    @Override
    public double calculateMonthlyLoanPayment(double principal, double rate, int years) {
        double monthlyRate = rate / (12 * 100); // Monthly interest rate
        int months = years * 12; // Total number of months
        return (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months)); // Loan Payment Formula
    }
} 
class FinancialCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        int duration = scanner.nextInt();

        FinancialCalculator calculator;
        int choice = scanner.nextInt();

        if (choice == 1) {
            calculator = new InvestmentCalculator();
        } else if (choice == 2) {
            calculator = new LoanCalculator();
        } else {
            System.out.println("Invalid choice");
            return;
        }
        if (calculator instanceof InvestmentCalculator) {
            System.out.println("Compound Interest: " +
                    calculator.calculateCompoundInterest(principal, rate, duration));
            System.out.println("Future Value: " +
                    calculator.calculateFutureValue(principal, rate, duration));
        } else if (calculator instanceof LoanCalculator) {
            System.out.println("Monthly Loan Payment: " +
                    calculator.calculateMonthlyLoanPayment(principal, rate, duration));
        }
        scanner.close();
    }
}

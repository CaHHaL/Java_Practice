// A bank offers two types of deposit schemes: Fixed Deposits (FD) and Recurring Deposits (RD). Customers want to know the interest they can earn based on their chosen scheme.



// Create a Java program using inheritance to calculate the interest for FD and RD. The program should contain the following:



// An abstract class Account with attributes accountHolder and principalAmount, and an abstract method calculateInterest().
// A subclass FixedDeposit to calculate interest for FD.
// A subclass RecurringDeposit to calculate interest for RD.


// Formulas Used:

// Interest for FD: (principal amount * duration in years * rate of interest) / 100

// Interest for RD:  (maturity amount * duration in months * rate of interest) / (12 * 100), where maturity amount = monthly deposit * duration in months.

// Input format :
// The first line of input consists of the choice (1 for FD, 2 for RD).

// If the choice is 1, the following lines consist of account holder (string), principal amount (double), duration in years (int), and rate of interest (double).

// If the choice is 2, the following lines consist of account holder (string), monthly deposit (int), duration in months (int), and rate of interest (double).

// Output format :
// The output prints the calculated interest with one decimal place.



// Refer to the sample output for formatting specifications.

// Code constraints :
// Choice will be either 1 or 2.

// Sample test cases :
// Input 1 :
// 1
// Alice
// 50000.56
// 5
// 6.5
// Output 1 :
// Interest for FD: 16250.2
// Input 2 :
// 2
// Bob
// 2000
// 12
// 7.5
// Output 2 :
// Interest for RD: 1800.0




abstract class Account {
    protected String accountHolder;
    protected double principalAmount;
    
    public Account(String accountHolder, double principalAmount) {
        this.accountHolder = accountHolder;
        this.principalAmount = principalAmount;
    }
    
    public abstract double calculateInterest();
}

// FixedDeposit subclass
class FixedDeposit extends Account {
    private int durationInYears;
    private double rateOfInterest;
    
    public FixedDeposit(String accountHolder, double principalAmount, int durationInYears, double rateOfInterest) {
        super(accountHolder, principalAmount);
        this.durationInYears = durationInYears;
        this.rateOfInterest = rateOfInterest;
    }
    
    @Override
    public double calculateInterest() {
        return (principalAmount * durationInYears * rateOfInterest) / 100;
    }
}

// RecurringDeposit subclass
class RecurringDeposit extends Account {
    private int monthlyDeposit;
    private int durationInMonths;
    private double rateOfInterest;
    
    public RecurringDeposit(String accountHolder, double principalAmount, int monthlyDeposit, int durationInMonths, double rateOfInterest) {
        super(accountHolder, principalAmount);
        this.monthlyDeposit = monthlyDeposit;
        this.durationInMonths = durationInMonths;
        this.rateOfInterest = rateOfInterest;
    }
    
    @Override
    public double calculateInterest() {
        double maturityAmount = monthlyDeposit * durationInMonths;
        return (maturityAmount * durationInMonths * rateOfInterest) / (12 * 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();
                String fdName = sc.nextLine();
                double fdPrincipal = sc.nextDouble();
                int fdDuration = sc.nextInt();
                double fdRate = sc.nextDouble();

                FixedDeposit fd = new FixedDeposit(fdName, fdPrincipal, fdDuration, fdRate);
                System.out.printf("Interest for FD: %.1f" ,fd.calculateInterest());
                break;

            case 2:
                sc.nextLine();
                String rdName = sc.nextLine();
                int rdDeposit = sc.nextInt();
                int rdDuration = sc.nextInt();
                double rdRate = sc.nextDouble();

                RecurringDeposit rd = new RecurringDeposit(rdName, 0, rdDeposit, rdDuration, rdRate);
                System.out.printf("Interest for RD: %.1f" ,rd.calculateInterest());
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
// In an organization, there are employees with different roles and salaries. Your task is to create a program that helps calculate the net salary of employees, including tax deductions and benefits. You have a class hierarchy, including Employee, Engineer, and SoftwareEngineer classes, to represent different roles and their respective salary components.

// Note:

// Gross Salary Calculation:

// Gross Salary = Base Salary + Bonus



// Tax Calculation:

// Tax = Gross Salary * 10% (Fixed tax rate for engineers)

// Tax = Gross Salary * 15% (Fixed tax rate for software engineers)



// Benefit Calculation:

// Benefit = $100 (Fixed benefit for engineers)

// Benefit = $150 (Fixed benefit for software engineers)



// Net Salary Calculation:

// Net Salary = Gross Salary - Tax + Benefit

// Input format :
// The first line of the input consists of a string name representing the employee's name.

// The second line of the input consists of a double baseSalary representing the base salary of the employee.

// The third line of the input consists of a double bonus representing the bonus for the employee.

// The fourth line of the input consists of an integer employeeType (1 for Engineer, 2 for Software Engineer).

// Output format :
// The first line of the output consists of a double representing the net salary of the employee, calculated after deducting taxes and adding benefits.



// Refer to the sample output for format specification

// Code constraints :
// 1 ≤ |name| ≤ 100

// 0 ≤ baseSalary ≤ 1,000,000

// 0 ≤ bonus ≤ 1,000,000

// Sample test cases :
// Input 1 :
// John
// 50000
// 10000
// 1
// Output 1 :
// 54100.0
// Input 2 :
// Alice
// 60000
// 12000
// 2
// Output 2 :
// 61350.0
// Input 3 :
// Dave
// 60000
// 10000
// 3
// Output 3 :
// Invalid


class Employee {
    String name;
    double baseSalary;
    double bonus;

    // Constructor for Employee class
    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Method to calculate net salary (to be overridden in subclasses)
    public double calculateNetSalary() {
        return 0.0;
    }
}

class Engineer extends Employee {
    private static final double TAX_RATE = 0.10; // 10% tax for engineers
    private static final double BENEFIT = 100; // Fixed benefit for engineers

    // Constructor for Engineer class
    public Engineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    // Overriding the method to calculate net salary for an engineer
    @Override
    public double calculateNetSalary() {
        double grossSalary = baseSalary + bonus;
        double tax = grossSalary * TAX_RATE;
        return grossSalary - tax + BENEFIT;
    }
}

class SoftwareEngineer extends Engineer {
    private static final double TAX_RATE = 0.15; // 15% tax for software engineers
    private static final double BENEFIT = 150; // Fixed benefit for software engineers

    // Constructor for SoftwareEngineer class
    public SoftwareEngineer(String name, double baseSalary, double bonus) {
        super(name, baseSalary, bonus);
    }

    // Overriding the method to calculate net salary for a software engineer
    @Override
    public double calculateNetSalary() {
        double grossSalary = baseSalary + bonus;
        double tax = grossSalary * TAX_RATE;
        return grossSalary - tax + BENEFIT;
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double baseSalary = scanner.nextDouble();

        double bonus = scanner.nextDouble();

        int employeeType = scanner.nextInt();

        Employee employee;
        if (employeeType == 1) {
            employee = new Engineer(name, baseSalary, bonus);
        } else if (employeeType == 2) {
            employee = new SoftwareEngineer(name, baseSalary, bonus);
        } else {
            System.out.println("Invalid");
            return;
        }

        double netSalary = employee.calculateNetSalary();
        System.out.println(netSalary);
    }
}

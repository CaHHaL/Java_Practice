// Raj is a software developer tasked with creating a train ticket pricing system for a local railway company using method overriding. The system needs to consider different pricing rules for regular passengers and senior citizens. Senior citizens, aged 60 and above, are eligible for a 10% discount on the regular ticket price.



// The calculatePrice method in the SeniorCitizenTicket class overrides the same method in the Ticket class to provide a different implementation for senior citizens.



// Formula:

// regular price = distance * 0.05

// senior discounted price = regular price * 0.9



// Example



// Input:

// 120 65

// Output:

// Senior Citizen Ticket Price: 5.4

// Explanation:

// Since the passenger's age is 65, which is greater than 60, the person is a senior citizen. The regular ticket price is calculated as 120 * 0.05 = 6.0. The discounted price is then calculated as 90% of the regular price, i.e., 6.0 * 0.9 = 5.4

// Input format :
// The input consists of two space-separated integers, representing the distance and age respectively.

// Output format :
// The output prints a double value, representing the ticket price by specifying whether it is a regular or senior citizen ticket.

// Round off the price to one decimal place.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ distance ≤ 300

// 30 ≤ age ≤ 100

// Sample test cases :
// Input 1 :
// 120 65
// Output 1 :
// Senior Citizen Ticket Price: 5.4
// Input 2 :
// 50 30
// Output 2 :
// Regular Passenger Ticket Price: 2.5
// Input 3 :
// 300 100
// Output 3 :
// Senior Citizen Ticket Price: 13.5




class Ticket {
    public double calculatePrice(int distance) {
        return distance * 0.05;
    }
}

// Derived class for senior citizens
class SeniorCitizenTicket extends Ticket {
    @Override
    public double calculatePrice(int distance) {
        return super.calculatePrice(distance) * 0.9;
    }
}



class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int age = scanner.nextInt();

        Ticket ticketUtility;
        if (age >= 60) {
            ticketUtility = new SeniorCitizenTicket();
        } else {
            ticketUtility = new Ticket();
        }

        double ticketPrice = ticketUtility.calculatePrice(distance);

        if (age < 60) {
            System.out.printf("Regular Passenger Ticket Price: %.1f" ,ticketPrice);
        } else {
            System.out.printf("Senior Citizen Ticket Price: %.1f" ,ticketPrice);
        }
    }
}
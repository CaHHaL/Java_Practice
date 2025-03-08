// Rithish is developing a straightforward pizza ordering system. To achieve this, he needs a Pizza class with a constructor for the base price and topping cost, along with a calculatePrice method overriding. He also wants a DiscountedPizza class that inherits from Pizza, applying a 10% discount for more than three toppings.



// The program prompts the user for inputs, creates instances of both classes, calculates regular and discounted prices, and displays them formatted appropriately.



// Example 1



// Input:

// 9.5

// 1.25

// 3

// Output: 

// Price without discount: Rs.13.25

// Price with discount: Rs.13.25

// Explanation:

// Rithish orders a pizza with a base price of Rs. 9.5, a topping cost of Rs. 1.25, and selects 3 toppings. The price is calculated as 9.5 + (1.25 * 3) = 13.25. The regular and discounted prices are both Rs. 13.25, as no discount has been applied.



// Example 2



// Input:

// 11.0

// 2.0

// 7

// Output: 

// Price without discount: Rs.25.00

// Price with discount: Rs.22.50

// Explanation:

// Rithish orders another pizza with a higher base price of Rs. 11.0, a topping cost of Rs. 2.0, and chooses 7 toppings. 

// Regular Price: 11.0 + (2.0 * 7) = Rs. 25.00.

// Discounted Price: The discounted price is calculated as 90% of the regular price, i.e., 0.9 * 25.00 = Rs.22.50. 

// Input format :
// The first line of input consists of a double value, representing the base price of the pizza.

// The second line consists of a double value, representing the cost per topping.

// The third line consists of an integer, representing the number of toppings chosen for the pizza.

// Output format :
// The first line of output prints the price without discount, rounded off to two decimal places.

// The second line prints the price with the discount, rounded off to two decimal places.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The base price and the cost per topping should be greater than zero.

// 1.0 ≤ price of the pizza ≤100.0

// 1.0 ≤ cost per topping ≤100.0

// 1 ≤ number of toppings ≤ 10

// Sample test cases :
// Input 1 :
// 9.5
// 1.25
// 3
// Output 1 :
// Price without discount: Rs.13.25
// Price with discount: Rs.13.25
// Input 2 :
// 11.0
// 2.0
// 7
// Output 2 :
// Price without discount: Rs.25.00
// Price with discount: Rs.22.50



class Pizza {
    double basePrice;
    double toppingCost;

    // Constructor for Pizza class
    public Pizza(double basePrice, double toppingCost) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
    }

    // Method to calculate the price of the pizza
    public double calculatePrice(int numberOfToppings) {
        return basePrice + (toppingCost * numberOfToppings);
    }
}

class DiscountedPizza extends Pizza {
    
    // Constructor for DiscountedPizza class
    public DiscountedPizza(double basePrice, double toppingCost) {
        super(basePrice, toppingCost);
    }

    // Overriding the calculatePrice method to apply a 10% discount for more than 3 toppings
    @Override
    public double calculatePrice(int numberOfToppings) {
        double regularPrice = super.calculatePrice(numberOfToppings);
        if (numberOfToppings > 3) {
            return regularPrice * 0.9;  // Applying a 10% discount
        }
        return regularPrice;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = scanner.nextDouble();
        double toppingCost = scanner.nextDouble();
        int numberOfToppings = scanner.nextInt();

        Pizza pizza = new Pizza(basePrice, toppingCost);
        DiscountedPizza discountedPizza = new DiscountedPizza(basePrice, toppingCost);

        DecimalFormat df = new DecimalFormat("#.00");

        double regularPrice = pizza.calculatePrice(numberOfToppings);
        double discountedPrice = discountedPizza.calculatePrice(numberOfToppings);

        System.out.println("Price without discount: Rs." + df.format(regularPrice));
        System.out.println("Price with discount: Rs." + df.format(discountedPrice));

        scanner.close();
    }
}
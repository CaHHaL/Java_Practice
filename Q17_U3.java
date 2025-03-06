Suppose you have two cars, a "Regular Car" and an "Eco Car." You want to calculate the driving range for each of them based on their fuel amount and mileage. If the calculated range is below 50 miles, you must issue a "Low Range Warning!" for both cars. The "Eco Car" has a special feature that adds 20 miles to the range in eco mode except in low fuel conditions. 



Write a program to calculate and display the driving range for both cars, considering the low range warning, based on user-provided fuel amount and mileage for each car. 

Input format :
The first line of the input has two space-separated integers 'f' representing the fuel amount (in gallons) and 'm' representing the mileage (in miles per gallon) of a Regular Car.

The second line of the input has two space-separated integers 'f' representing the fuel amount (in gallons) and 'm' representing the mileage (in miles per gallon) of an Eco Car.

Output format :
If the range of both cars is less than 50 miles, then the "Low Range Warning" is displayed above "Regular Car Range" and "Eco Car Range".

If any one of the cars has a range of less than 50 miles, then the "Low Range Warning" is displayed for the particular car range.

Else the first line of the input displays "Regular Car Range: XX miles".

The second line of the input displays "Eco Car Range: XX miles".



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

0 ≤ f ≤1000

0 ≤ m ≤1000

Sample test cases :
Input 1 :
10.0 25.0
10.0 25.0
Output 1 :
Regular Car Range: 250.0 miles
Eco Car Range: 270.0 miles
Input 2 :
8.5 30.0
12.0 22.0
Output 2 :
Regular Car Range: 255.0 miles
Eco Car Range: 284.0 miles
Input 3 :
6.0 2.0
8.0 2.0
Output 3 :
Low Range Warning!
Regular Car Range: 12.0 miles
Low Range Warning!
Eco Car Range: 16.0 miles





public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double regularFuel = scanner.nextDouble();
        double regularMileage = scanner.nextDouble();

        double ecoFuel = scanner.nextDouble();
        double ecoMileage = scanner.nextDouble();

        CarUtility car = new CarUtility();
        double regularRange = car.calculateRange(regularFuel, regularMileage);
        System.out.println("Regular Car Range: " + regularRange + " miles");

        EcoCarUtility ecoCar = new EcoCarUtility();
        double ecoRange = ecoCar.calculateRange(ecoFuel, ecoMileage);
        System.out.println("Eco Car Range: " + ecoRange + " miles");

        scanner.close();
    }
}

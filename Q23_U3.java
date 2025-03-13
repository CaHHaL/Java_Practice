// Rufus is tasked with developing a Carbon Footprint Calculator to estimate the environmental impact of electricity usage and transportation emissions. 



// Your task is to guide Rufus to complete the program, following the given instructions.



// EnvironmentalMetrics Class

// Contains two protected fields:

// electricityUsage: This represents the electricity usage in kilowatt-hours (kWh).
// transportationEmissions: Represents the transportation emissions in kilograms of carbon dioxide (kgCO2).


// CarbonFootprintCalculator Class

// A final class that extends the EnvironmentalMetrics class.
// Contains two final fields:
// electricityEmissionFactor: This represents the emission factor for electricity usage in kgCO2 per kWh. The final field is set to 0.4.
// transportationEmissionFactor: Represents the emission factor for transportation emissions in kgCO2 per kgCO2. The final field is set to 2.5.
// Constructor:
// Accepts parameters for electricity usage and transportation emissions and initializes the corresponding fields.
// Method:
// estimateCarbonEmissions(): Calculates and displays the carbon footprint estimates for electricity and transportation, and the total carbon footprint.


// Create an instance of CarbonFootprintCalculator with the input values in the main class. Call the estimateCarbonEmissions method to display the calculated carbon footprint.



// Formulas

// carbon footprint estimate(electricityCarbon) = electricityUsage * electricityEmissionFactor
// total carbon footprint = electricityCarbon + transportationEmissions
// Input format :
// The first line of input consists of a double value representing the electricity usage in kWh.

// The second line consists of a double value, representing the transportation emissions in kgCO2.

// Output format :
// The first line of output prints a double value rounded off to two decimal places with formatting string, "Electricity: [electricityCarbon] kgCO2": The calculated carbon emissions from electricity usage.



// The second line prints a double value rounded off to two decimal places with formatting string, "Transportation: [transportationEmissions] kgCO2": The provided transportation emissions.



// The third line prints a double value rounded off to two decimal places with formatting string, "Total: [totalCarbonFootprint] kgCO2": The sum of electricity and transportation emissions, representing the total carbon footprint.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1.0 ≤ electricity ≤ 250.0

// 1.0 ≤ transportation emissions ≤ 250.0

// Sample test cases :
// Input 1 :
// 6.2
// 3.4
// Output 1 :
// Electricity: 2.48 kgCO2
// Transportation: 3.40 kgCO2
// Total: 5.88 kgCO2
// Input 2 :
// 35.7
// 25.4
// Output 2 :
// Electricity: 14.28 kgCO2
// Transportation: 25.40 kgCO2
// Total: 39.68 kgCO2
// Input 3 :
// 145.3
// 126.9
// Output 3 :
// Electricity: 58.12 kgCO2
// Transportation: 126.90 kgCO2
// Total: 185.02 kgCO2


class EnvironmentalMetrics {
    protected double electricityUsage;
    protected double transportationEmissions;

    public EnvironmentalMetrics(double electricityUsage, double transportationEmissions) {
        this.electricityUsage = electricityUsage;
        this.transportationEmissions = transportationEmissions;
    }
}

final class CarbonFootprintCalculator extends EnvironmentalMetrics {
    private final double electricityEmissionFactor = 0.4;
    private final double transportationEmissionFactor = 2.5;

    public CarbonFootprintCalculator(double electricityUsage, double transportationEmissions) {
        super(electricityUsage, transportationEmissions);
    }

    public double getElectricityCarbon() {
        return electricityUsage * electricityEmissionFactor;
    }

    public double getTransportationEmissions() {
        return transportationEmissions;
    }

    public double getTotalCarbonFootprint() {
        return getElectricityCarbon() + getTransportationEmissions();
    }
}




public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double electricityUsage = scanner.nextDouble();
       double transportationEmissions = scanner.nextDouble();

       CarbonFootprintCalculator carbonCalculator = new CarbonFootprintCalculator(electricityUsage, transportationEmissions);
       
       System.out.printf("Electricity: %.2f kgCO2\n", carbonCalculator.getElectricityCarbon());
       System.out.printf("Transportation: %.2f kgCO2\n", carbonCalculator.getTransportationEmissions());
       System.out.printf("Total: %.2f kgCO2", carbonCalculator.getTotalCarbonFootprint());

       scanner.close();
   }
}
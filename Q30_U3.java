// Oliver is working on a project that involves dealing with file sizes. He needs a Java program that can convert file sizes from bytes to kilobytes (KB), megabytes (MB), gigabytes (GB), and vice versa.

// You are required to design a Java program with an interface FileSizeConverter that includes static methods for the following conversions:

// convertFromBytes(long bytes, String targetUnit): This method should convert a given file size in bytes to the specified unit (KB, MB, or GB).
// convertToBytes(double size, String sourceUnit): This method should convert the given file size in KB, MB, or GB to bytes.
// Input format :
// The first line consists of a long integer fileSize, representing the file size to be converted

// The second line consists of a string fromUnit, representing the current unit of the file size

// The third line consists of a string toUnit, representing the target unit for the conversion.

// Output format :
// The output prints a single line containing the converted file size followed by the unit of measurement (e.g., "256 KB").



// Refer to the sample output formatting specifications

// Code constraints :
// 1 ≤ fileSize ≤ 10^18

// Sample test cases :
// Input 1 :
// 1024
// bytes
// KB
// Output 1 :
// 1 KB
// Input 2 :
// 2048
// KB
// MB
// Output 2 :
// 2 MB
// Input 3 :
// 2
// KB
// bytes
// Output 3 :
// 2048 bytes


interface FileSizeConverter {
    static double convertFromBytes(long bytes, String targetUnit) {
        switch (targetUnit.toUpperCase()) {
            case "KB": return bytes / 1024.0;
            case "MB": return bytes / (1024.0 * 1024);
            case "GB": return bytes / (1024.0 * 1024 * 1024);
            default: throw new IllegalArgumentException("Invalid target unit");
        }
    }
    
    static long convertToBytes(double size, String sourceUnit) {
        switch (sourceUnit.toUpperCase()) {
            case "KB": return (long) (size * 1024);
            case "MB": return (long) (size * 1024 * 1024);
            case "GB": return (long) (size * 1024 * 1024 * 1024);
            default: throw new IllegalArgumentException("Invalid source unit");
        }
    }
}


public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       long fileSize = scanner.nextLong();
       scanner.nextLine();
       String fromUnit = scanner.nextLine().trim();
       String toUnit = scanner.nextLine().trim();
       
       long bytes;
       if (fromUnit.equalsIgnoreCase("bytes")) {
           bytes = fileSize;
       } else {
           bytes = FileSizeConverter.convertToBytes(fileSize, fromUnit);
       }
       
       double result;
       if (toUnit.equalsIgnoreCase("bytes")) {
           result = bytes;
       } else {
           result = FileSizeConverter.convertFromBytes(bytes, toUnit);
       }
       
       if (toUnit.equalsIgnoreCase("bytes")) {
           System.out.printf("%.0f %s%n", result, "bytes");
       } else {
           System.out.printf("%.0f %s%n", result, toUnit.toUpperCase());
       }
       
       scanner.close();
   }
}
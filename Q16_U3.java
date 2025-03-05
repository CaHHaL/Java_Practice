// You are developing a program to help analyze scores in a competition by determining the highest value from a given set of numbers. The program should allow the user to input the total number of elements and then enter the values one by one. To achieve this, you need to implement a class structure using inheritance. 

// Create a base class that provides a method to find the maximum value in an array, and extend this class to a subclass that manages the input data. Additionally, override the toString() method to display the array contents in a readable format and the equals() method to compare two sets of data. The program should then compute and print the highest value from the input set.

// Input format :
// The first line of input consists of an interger 'n' representing the number of elements in the array.

// The second line of input consists of n space-separated integers representing the array elements.

// Output format :
// The output prints the maximum element in the given array.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 0 ≤ n ≤ 100

// Sample test cases :
// Input 1 :
// 5
// 1 6 9 8 7
// Output 1 :
// 9
// Input 2 :
// 3
// 1 6 5
// Output 2 :
// 6




// Base class to provide a method for finding the maximum value
class ArrayUtils {
    protected int[] array;

    public ArrayUtils(int[] array) {
        this.array = array;
    }

    // Method to find the maximum value in the array
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

// Subclass to manage input data and add more functionalities
class EnhancedArrayUtils extends ArrayUtils {

    public EnhancedArrayUtils(int[] array) {
        super(array);
    }

    // Override toString() to display array contents in readable format
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Override equals() to compare two sets of data
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnhancedArrayUtils other = (EnhancedArrayUtils) obj;
        if (this.array.length != other.array.length) {
            return false;
        }
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != other.array[i]) {
                return false;
            }
        }
        return true;
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayUtils utils = new ArrayUtils(array);

        System.out.println(utils.findMax(array));

        scanner.close();
    }
}

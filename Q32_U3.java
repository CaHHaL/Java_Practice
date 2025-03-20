// Wick is developing a real-time strategy game where the players command armies represented by square matrices. The game requires matrix operations to calculate army strength and overall battle outcomes. 



// Write a program to assist Wick that includes an abstract class MatrixOperation with an abstract method performOperation() and a class MatrixAddition. Calculate the army strength by adding all the elements in the given matrices. Display the matrix that represents the army's strength.

// Input format :
// The first line of input consists of an integer N, representing the number of rows and columns of a square matrix.

// The next N lines consist of N space-separated integers, representing the elements of the first matrix.

// The following N lines consist of N space-separated integers representing the elements of another matrix.

// Output format :
// The output prints the army strength, which is the addition of the given matrices.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 5

// 1 ≤ Array elements ≤ 100

// Sample test cases :
// Input 1 :
// 2
// 1 2
// 3 4
// 5 6
// 7 8
// Output 1 :
// 6 8 
// 10 12 
// Input 2 :
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// 10 11 12
// 13 14 15
// 16 17 18
// Output 2 :
// 11 13 15 
// 17 19 21 
// 23 25 27 




abstract class MatrixOperation {
    abstract int[][] performOperation(int[][] matrix1, int[][] matrix2);
}

// Concrete class implementing matrix addition
class MatrixAddition extends MatrixOperation {
    @Override
    int[][] performOperation(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
class Main {
    private static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        inputMatrix(matrix1, scanner);
        inputMatrix(matrix2, scanner);

        MatrixOperation addition = new MatrixAddition();
        int[][] resultAddition = addition.performOperation(matrix1, matrix2);

        displayMatrix(resultAddition);

        scanner.close();
    }
}
// Akash has been assigned the task of developing a program to determine whether three given lengths can form a valid triangle. A triangle is considered valid if the sum of any two sides is greater than the third side. To implement this, Akash needs to create a program that takes three integer inputs representing the side lengths and checks whether they satisfy the triangle inequality conditions: a + b > c, a + c > b, and b + c > a. 

// The solution should be designed using inheritance, incorporating features such as overriding the toString() and equals() methods, utilizing the instanceof operator, or using super and final keywords.

// Input format :
// The input consists of three space-separated integers, each representing the length of a side of a triangle.

// Output format :
// The output displays a single line indicating whether the given side lengths form a triangle or not.

// If the side lengths form a triangle, it prints "Triangle".

// If the side lengths do not form a triangle, it prints "Not a Triangle".



// Refer to the sample output for the formatting specifications.

// Code constraints :
// 1 ≤ side 1, side 2, side 3 ≤ 60

// Sample test cases :
// Input 1 :
// 3 4 5
// Output 1 :
// Triangle
// Input 2 :
// 5 12 30
// Output 2 :
// Not a Triangle
// Input 3 :
// 35 35 60
// Output 3 :
// Triangle

class Shape {
    protected int side1, side2, side3;
    
    public Shape(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }
    
    public void checkTriangle() {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("Triangle");
        } else {
            System.out.println("Not a Triangle");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        
        Triangle t = new Triangle(side1, side2, side3);
        t.checkTriangle(); // Checking if it forms a triangle

        input.close();
    }
}
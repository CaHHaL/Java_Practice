// Ashwin is assigned the task of implementing a program that utilizes the this keyword to initialize an object of the class Main based on user input. The class Main contains a single integer variable x, and the goal is to take an integer input from the user, use it to instantiate an object of the Main class, and then print the value of x to the console using the 'this' keyword.



// Help Ashwin with the task.

// Input format :
// The input contains a integer x , representing the value to initialize the object.

// Output format :
// The output displays the input value in the format "Value of x = X", where X is the input integer.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ x ≤ 100

// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// Value of x = 5
// Input 2 :
// 10
// Output 2 :
// Value of x = 10




// You are using Java
class MyClass {
    //type your code here
    int x;
    public MyClass(int x){
        this.x=x;
    }
}
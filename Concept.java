// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        byte rol=sc.nextByte();
        char gender=sc.next().charAt(0);
        float cgpa=sc.nextFloat();
        System.out.println("My name is "+name+" and my roll number is "+rol+" and I my gender is "+gender+" and my cgpa is "+cgpa);
    }
}




// You are using Java
class Main{
    int a=5;
    //instance variable
    static int b=10;
    //static variable
    void display(){
        int c=15;
        //local variable
        System.out.println(c);
    }
    public static void main(String args[]){
        Main obj=new Main();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //can be use without creating a object just by using the class name
        System.out.println(Main.b);
        obj.display();
        
    }
}


// You are using Java
class abc{
    enum primes{
        TWO(2),THREE(3),FOUR(4);
        int value;
        abc(int value){
            this.value=value;
        }
        int getValue(){
            return value;
        }
    }
    public static void main(String args[]){
        for(primes d:primes.values()){
            System.out.println(d.getValue());
        }
    }
}
//error in abc it should be same as enum



class abc{
    enum primes{
        TWO(2),THREE(3),FOUR(4);
        // 2,3,4;
        //we cant assign integer number to enum directly bcz it does not meann any thing
        
        int value;
        primes(int value){
            // value=value;
            //error bcz same parameter and same integer value not possible output might be zero or null or error 
            this.value=value;
        }
        int getValue(){
            return value;
        }
    }
    public static void main(String args[]){
        for(primes d:primes.values()){
            System.out.println(d.getValue());
        }
    }
}











// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        byte rol=sc.nextByte();
        sc.nextLine();
        String name=sc.nextLine();
        char gender=sc.next().charAt(0);
        float cgpa=sc.nextFloat();
        System.out.println("My name is "+name+" and my roll number is "+rol+" and I my gender is "+gender+" and my cgpa is "+cgpa);
    }
}


//error code 

//The error in your Java code is related to the handling of input with Scanner. Specifically, the problem is with the nextLine() method that you're using to read the name after reading the rol (which is a byte) and the gender (which is a char).

// When you read the rol using sc.nextByte() and gender using sc.next().charAt(0), the newline character (\n) from the previous inputs is still in the input buffer, which causes nextLine() to immediately consume that newline and return an empty string instead of waiting for the user to enter the name
//How to Fix It:
// You can fix this by adding an extra sc.nextLine() after reading the byte (for rol) and char (for gender) to consume the leftover newline character.

// Here is the corrected version of your code:




// Constructor overloading 

class Main{
    Main(int p){
        System.out.println("p="+p);
    }
    Main(int a,int b){
        this(2);
        System.out.println(a+" "+b);
    }
    Main(int a,int b,int c){
        this(2,5);
        System.out.println(a+" "+b+" "+c);
    }
    public static void main(String args[]){
        Main m=new Main(5,6,7);
    }
}

//use of this keyword for calling the current object 
class Main{
    void show(){
        System.out.println("Method 1");
    }
    void show1(){
        this.show();
        System.out.println("Method 2");
    }
    public static void main(String args[]){
        Main m=new Main();
        m.show1();
    }
}



//method overloading
// You are using Java
import java.util.*;
class Summation{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int c,int d,int e){
        return c+d+e;
    }
}
class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        Summation summation=new Summation();
        int sum1=summation.sum(a,b);
        int sum2=summation.sum(c,d,e);
        System.out.println("Sum of two integer ="+sum1);
        System.out.println("Sum of three integer ="+sum2);
    }
}



// You are using Java
//array concatenation using System.arraycopy()
import java.util.*;
class ArrayConcatenator{
    int[] thirdArray;
    ArrayConcatenator(int[] firstArray,int[] secondArray){
        int n=firstArray.length;        
        int m=secondArray.length;
        thirdArray=new int[n+m];
        System.arraycopy(firstArray,0,thirdArray,0,n);
        System.arraycopy(secondArray,0,thirdArray,n,m);
    }
    void printConcatenatedArray(){
        for(int i: thirdArray){
            System.out.println(i);
        }
        
    }

};
class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size1=scan.nextInt();
        int[] firstArray=new int[size1];
        for(int i=0;i<size1;i++){
            firstArray[i]=scan.nextInt();
        }
        int size2=scan.nextInt();
        int[] secondArray=new int[size2];
        for(int i=0;i<size2;i++){
            secondArray[i]=scan.nextInt();
        }
        ArrayConcatenator arrayConcatenator=new ArrayConcatenator(firstArray,secondArray);
        arrayConcatenator.printConcatenatedArray();
    }
}






class Test {
    Test() {
        System.out.println("Constructor Called");
    }

    void displayMessage() {
        System.out.println("This is a message from the Test object.");
    }
}

public class Main {
    public static void main(String[] args) {
        Test testObj = new Test(); 
        testObj.displayMessage(); 
    }
}
//output
// Constructor Called
// This is a message from the Test object.



// In Object-Oriented Programming, programs are divided into 
//output
// objects and classes



// The return statement is always used in the ________ block.
//output
// function and method




// You are using Java
import java.util.*;

class IntArrayCalculatator
{
    int[] a;
    int sum;
    double average;
    int max;
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            
        }
        find();
    }
    //the above data in the {} are the initilizer block it get executeed before the main block 
    //However static block has the highest priority and after thet initializer block and then the constructor
    void find(){
        sum=0;
        max=Integer.MIN_VALUE;
        for(int d:a){
            sum+=d;
            if(d>max){
                max=d;
            }
        }
        average=(double)sum/a.length;
        
    }
    void displayArrayOperations(){
        System.out.println(sum);
        System.out.println(average);
        System.out.println(max);
    }
    public static void main(String args[]){
        IntArrayCalculatator s=new IntArrayCalculatator();
        s.displayArrayOperations();
    }
}



class Example{
    Example(){
        System.out.println("Constructor is Executed");
    }
    {
        System.out.println("Initilizer block is executed");
    }
    static{
        System.out.println("Static block is executed");
    }
    public static void main(String args[]){
        Example s=new Example();
    }
}
//Output 
// Static block is executed
// Initilizer block is executed
// Constructor is Executed
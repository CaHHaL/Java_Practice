final class A 
{
    int i;
}    
class B extends A 
{
    int j;
    System.out.println(j + " " + i);  
}    
class inheritance {
    public static void main(String args[]) {
        B obj = new B();
        obj.display();     
    }
}

//compile time error



In a class hierarchy where class E extends D, D extends C, C extends B, and B extends A, which class constructor will be executed first when an object of class E or D is instantiated?
//In Java, when an object of a derived class is instantiated, the constructors of all its ancestor classes are executed in a top-down //order, starting from the base class (A in this case) to the most derived class.





class A {
    public int i;
    public int j;
    A()
    {
        i = 1;
        j = 2;
	}
}
class B extends A { 
    int a; 
	B()
    {
        super();
    }
}
class super_use {
    public static void main(String args[]) {
        B obj = new B();
        System.out.println(obj.i + " " + obj.j);
    }
} 
//output
//1 2






If both the superclass and subclass have a variable with the same name, which keyword should be used to access the variable in the superclass?
//super





What would happen if a class extends two interfaces, both of which have a method with the same name and signature, and the class does not implement that method?
//compile error




Multiple inheritance can be implemented using ________ in Java.

//interface



Parent class is the class being inherited from, also called as ___________________.
//base



Which of the following methods must be static during the start of the program's execution?
//main()


What does an interface contain?
//Method declarations AND DEFINATION


An abstract class cannot have a constructor.
//false


 What type of variable can be defined in an interface?
//public,static,final



In Java, which of the following is true about static blocks?
//"They execute when the class is loaded into memory"




What is the key difference between an abstract class and an interface in Java?
//An abstract class can have both abstract and non-abstract methods, while an interface can only have abstract methods."



interface Worm {
    int teeth=2;
}

class BookWorm implements Worm {
    int teeth=4;
    void show() {
        teeth= 5;
        System.out.println("Teeth: " + teeth);
    }
}

public class Main {
    public static void main(String[] args) {
        new BookWorm().show();
    }
}
//TEETH: 5





class A{
      public void printValue(){
            System.out.println("Value-A");
      }
}
class B extends A{
      public void printNameB(){
            System.out.println("Name-B");
      }
}
class C extends A{
      public void printNameC(){
            System.out.println("Name-C");
      }
}

public class Test{
       public static void main (String[] args){
             B b = new B();
             C c = new C();
             newPrint(b);
             newPrint(c);
       }
       public static void newPrint(A a){
             a.printValue();
      }
    }
//value A
value A





abstract class Calculator {
    abstract double square(double num);
    abstract double cube(double num);
}

class MathCalculator extends Calculator {
    double square(double num) {
        return num * num;
    }
    double cube(double num) {
        return num * num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();
        double num = 15.0;
        double squareResult = calculator.square(num);
        double cubeResult = calculator.cube(num);
        System.out.println(squareResult);
        System.out.print(cubeResult);
    }
}
//225.0
//3375.0







  class A 
    {
        public int i;
        protected int j;
    }    
    class B extends A 
    {
        int j;
        void display() 
        {
            super.j = 3;
            System.out.println(i + " " + j);
        }
    }    
    class Output 
    {
        public static void main(String args[])
        {
            B obj = new B();
            obj.i=1;
            obj.j=2;   
            obj.display();     
        }
   }
//1 2




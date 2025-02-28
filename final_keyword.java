// Final keyword in variable, method and class


// final class A{
//  cannot inherit from final A
final class A{
    // final void display(){
    //cant overide && this is the error display() in B cannot override display() in A 
     void display(){
       System.out.println("Class A"); 
    }
    
}
class B extends A{
    void display(){
         System.out.println("Class B"); 
    }
}

class Main{
    public static void main(String args[]){
       B s=new B();
       s.display();
       
       
       //variable
       final double PI=3.14;
        // cannot assign a value to final variable PI
        //can't be changed 
       PI++;
       System.out.println(PI);
    }
}
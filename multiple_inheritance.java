//Multiple inheritance and interface concept
interface a{
    void show();
}
class b{
    void show(){
         System.out.println("Base class B");
    }
    void display(){
        System.out.println("Base class B");
    }
}
class Main extends b implements a{
    public void show(){
        System.out.println("Dereived class show");
    }
    public static void main(String agrs[]){
        Main m= new Main();
        m.show();
        m.display();
    }
}










//to bypass the error we can use the default keyword but it will not print the method of the interface 
interface a{
    default void show(){
        System.out.println("ergfe");
    }
}
class b{
    void show(){
         System.out.println("Base class B");
    }
    void display(){
        System.out.println("Base class B");
    }
}
class Main extends b implements a{
    public void show(){
        System.out.println("Dereived class show");
    }
    public static void main(String agrs[]){
        Main m= new Main();
        m.show();
        m.display();
    }
}
//Static Nested class
// You are using Java
class outer{
    static int y=20;
    static private int z=30;
    static class innerClass{
        void display(){
            System.out.println("static "+y);
            System.out.println("private "+z);
            
        }
    }
}
class Main{
    public static void main(String args[]){ 
        outer.innerClass m=new outer.innerClass();
        m.display();
    }
}
//output
//static=20
//private=30





//Static Nested class
//with accesing non static variable 
class outer{
    int x=10;
    static int y=20;
    static private int z=30;
    static class innerClass{
        void display(){
            System.out.println("static "+y);
            System.out.println("private "+z);
            outer s=new outer();
            System.out.println("instance "+s.x);
        }
    }
}
class Main{
    public static void main(String args[]){
        outer.innerClass m=new outer.innerClass();
        m.display();
    }
}
//output
//static 20
//private 30
//instance 10






class outer{
    int x=10;
    static int y=20;
    // private int z=30;
    static class innerClass{
        void display(){
            
            System.out.println("static "+y);
            
        }
    }
}
class Main{
    public static void main(String args[]){
       outer s=new outer();
    //   System.out.println("private "+s.z);
            System.out.println("instance "+s.x);
        outer.innerClass m=new outer.innerClass();
        m.display();
    }
}
//output
//instance 10
//static 20




//error code
//output
//error code because we cannot make the outer class static 
static class outer{
    // int x=10;
    static int y=20;
    private int z=30;
    static class innerClass{
        void display(){
            System.out.println("static "+y);
            System.out.println("private "+z);
            // System.out.println("instance "+x);
        }
    }
}
class Main{
    public static void main(String args[]){
        
        outer.innerClass m=new outer.innerClass();
        m.display();
    }
}
//output
//error code because we cannot make the outer class static 
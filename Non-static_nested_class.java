//Innner class (NON-STATIC CLASS)
class outer{
    int x=10;
    static int y=20;
    private int z=30;
    class innerClass{
        void display(){
            System.out.println("static "+y);
            System.out.println("private "+z);
            System.out.println("instance "+x);
        }
    }
}
class Main{
    public static void main(String args[]){
        outer s=new outer();
        outer.innerClass m=s.new innerClass();
        m.display();
    }
}



//output
//static 20
//private 30
//instance 20


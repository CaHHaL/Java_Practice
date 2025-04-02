//local inner class
class a{
    int x=10;
    void display(){
        for(int i=0;i<x;i++){
        class b{
            void show(){
                System.out.println("Done= "+x);
            }
        }
        b m=new b();
        m.show();
        }
    }
}

class Main{
    public static void main(String args[]){
        a n=new a();
        n.display();
    }
}
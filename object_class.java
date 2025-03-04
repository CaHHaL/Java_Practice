class xyz{
    int x;
    xyz(int x){
        this.x=x;
    }
    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
class Main {
    public static void main(String args[]){
        xyz m=new xyz(6);
        System.out.println(m);
        System.out.println(m.toString());
    }
}
//prints the class name @ the addresss 
//output
//xyz@6ff3c5b5




//prints the class name @ the addresss 
class xyz{
    int x;
    xyz(int x){
        this.x=x;
    }
}
class Main {
    public static void main(String args[]){
        xyz m=new xyz(6);
        System.out.println(m);
    }
}
//output
//xyz@6ff3c5b5









//error code
public class xyz{
    int x;
    xyz(int x){
        this.x=x;
    }
}
class Main extends xyz{
    public static void main(String args[]){
        xyz m=new xyz(6);
        System.out.println(m);
    }
}

//lambda function inside method 
interface ab{
    void print();
    
}
class pqr{
    int a;
    pqr(int x){
        this.a=x;
    }
    void show(){
        ab m=()->{
          System.out.println("a="+a);  
        };
        m.print();
    }
     public static void main(String args[]){
        pqr ob=new pqr(10);
        ob.show();
    }
}

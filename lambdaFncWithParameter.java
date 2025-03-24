//lambda function with parameter in two ways
interface ab{
    int add(int a,int b);
}
class pqr{
     public static void main(String args[]){
       ab m=(a,b)->(a+b);
       System.out.println(m.add(110,110));
       ab z=(int a,int b)->{
           return (a+b);
       };
       System.out.println(z.add(110,100));
    }
}

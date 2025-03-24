//Anoymous class to acces interface
interface a{
    public void show();
}

class Main{
    public static void main(String args[]){
        a m=new a(){
            public void show(){
                System.out.println("Interface");
            }
        };
        m.show();
    }
}
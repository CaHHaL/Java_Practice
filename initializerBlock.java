// You are using Java
import java.util.*;

class IntArrayCalculatator
{
    int[] a;
    int sum;
    double average;
    int max;
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            
        }
        find();
    }
    //the above data in the {} are the initilizer block it get executeed before the main block 
    //However static block has the highest priority and after thet initializer block and then the constructor
    void find(){
        sum=0;
        max=Integer.MIN_VALUE;
        for(int d:a){
            sum+=d;
            if(d>max){
                max=d;
            }
        }
        average=(double)sum/a.length;
        
    }
    void displayArrayOperations(){
        System.out.println(sum);
        System.out.println(average);
        System.out.println(max);
    }
    public static void main(String args[]){
        IntArrayCalculatator s=new IntArrayCalculatator();
        s.displayArrayOperations();
    }
}
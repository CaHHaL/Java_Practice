import java.util.*;
enum color
{
RED,GREEN,YELLOW;    
}
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String input=s.next().toUpperCase();
        color type=color.valueOf(input);
        switch(type){
            case RED:
                System.out.println("STOP");
                break;
            case YELLOW:
                System.out.println("Wait");
                break;
            case GREEN:
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}





































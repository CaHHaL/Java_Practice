// You are using Java
import java.util.*;
enum color
{
RED,GREEN,YELLOW;    
}
class Main{
    public static void main(String args[]){
       color c=color.RED;
    //   System.out.println(c);
      for(color d: color.values()){
          System.out.println(d);
      }
    }
}
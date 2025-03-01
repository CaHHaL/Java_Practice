public class Main {
	public static void main(String[] args) {
    int sum = 0;
    for (char ch : "12345".toCharArray()) {
        sum += ch - '0';
    }
    System.out.println(sum);
	}
}

15



public class Main {
    public static void main(String[] args) {
      boolean balloonInflated = false;
      do{
        if(!balloonInflated)
        {
          balloonInflated = true;
          System.out.print("inflate-");
        }
      } while(!balloonInflated);
      System.out.println("done");
    }
}

inflate-done


public class Main {	
	public static void main(String[] args){
	    int i;
		for(i = 0 ; i < 10; i++){			
		}		
		System.out.println(i);
	}
}

10


public class Main {
	public static void main(String[] args) {
		for (char ch : "12345".toCharArray()) {
            if (ch == '3') {
                continue;
            }
            System.out.print(ch + " ");
        }
	}
}

1245



class Main {
    public static void main(String args[]) {
        do {
            int count = 0;
            do {
                count++;
            } while (count < 2);
            System.out.println(count);
            break;
        } while (true);
    }
}


2





public class Main {
  int a;
  
  public Main(int a) {
    this.a = a;
  }

  public static void main(String[] args) {
    Main obj = new Main(87);
    System.out.print(obj.a);
  }
}


87




// In Java, where can you use this keyword?
Inside both instance methods and constructors




// What is an initializer block in Java?
A block of code executed before constructors.


class Test {
    void display(int a, int b) {
        System.out.println("Method 1");
    }
    void display(double a, double b) {
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display(10, 10.0);
    }
}

//output
//Method 2


class Test {
    void show(int a) {
        System.out.println("Integer method");
    }
    void show(String s) {
        System.out.println("String method");
    }
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(null);
    }
}

//output
//String method



// Why do we use constructor overloading?
To initialize the object in different ways

public class Main {
    public static void main(String[] args) {
        int[] x = {120, 200, 164};
        for(int i = 0; i < 3; i++)
        System.out.print(x[i] + " ");
    }
}
120 200 164

Which of the following references the first and last element in a non-empty array?
// trains[0] and trains[trains.length-1]

class Main {
    public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	    int count = 0;
		for(int i = 0 ; i<5; i++ ) {
		    if(arr[i]%2==0)
		        count++;
		}
		System.out.print(count);
	}
}
2


Which option correctly demonstrates the legal declaration, construction, and initialization of an array?
// int [] arr = {};


public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;
        int element = 25;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}10 20 25 30 40 50



public class Main{  
    public static void main(String args[]){  
        StringBuilder obj=new StringBuilder("Programming");  
        obj.delete(1,3);  
        System.out.print(obj);
    }  
} 
//output
// Pgramming

Which of the following is true about the deleteCharAt(int index) method in StringBuilder?
// Deletes the character at the specified index



public class Main{  
    public static void main(String args[]){  
        StringBuilder sb=new StringBuilder("Stock");  
        sb.replace(1,3,"Market");  
        System.out.print(sb);
    }  
}  
//output
// SMarketck



class Main {   
    public static void main(String args[]) { 
        String s1 = "Hello i love java";
        String s2 = new String(s1);            		
        System.out.println((s1 == s2) + " " + s1.equals(s2));         	
    }    
}
//output
// false true 

public class Main {
    public static void main(String[] args) {
        String myStr = "The more he thought about it, the more he realized that he needed to make a decision.";
        System.out.println(myStr.lastIndexOf("he"));
        System.out.println(myStr.lastIndexOf("He"));
    }
}
// output
// 56
// -1




Select the default constructor for the string class.
// String s = new String();



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


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


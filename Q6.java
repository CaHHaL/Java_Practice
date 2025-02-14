// Lisa is working on a program to perform operations on an array of integers. 



// She wants to write a program to calculate and display the sum, average, and maximum value of the given array. Write class with an initializer block to initialize the array size and elements, and implement methods to calculate and display the array operations.



// Develop a program to assist Lisa in this task. 

// Input format :
// The first line of input consists of an integer N, representing the size of the array.

// The second line consists of N space-separated integers, representing the elements of the array.

// Output format :
// The first line of output prints an integer representing the sum of the array elements.

// The second line prints a double value representing the average of the array elements, rounded off to two decimal places.

// The third line prints an integer representing the maximum value among the array elements.



// Refer to the sample outputs for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 25

// -100 ≤ array elements ≤ 100

// Sample test cases :
// Input 1 :
// 5
// 1 2 3 4 5
// Output 1 :
// Sum: 15
// Average: 3.00
// Maximum Value: 5
// Input 2 :
// 10
// 5 8 7 9 4 5 -8 9 -4 -12
// Output 2 :
// Sum: 23
// Average: 2.30
// Maximum Value: 9
// Input 3 :
// 25
// -15 100 47 89 64 6 4 -23 -6 10 22 -44 75 68 -96 32 12 32 -11 42 37 45 56 -66 -21
// Output 3 :
// Sum: 459
// Average: 18.36
// Maximum Value: 100





class  IntArrayCalculator {
      //type your code here
        int n;
        int[] arr;
      {
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          arr=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=s.nextInt();
          }
          
          
      }
      void displayArrayOperations(){
          int sum=0;
          int MIN=Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
              sum+=arr[i];
              if(MIN<arr[i]){
                  MIN=arr[i];
              }
              
          }
          double avg=(double)sum/arr.length;
          System.out.println("Sum: "+sum);
          System.out.printf("Average: %.2f",avg);
          System.out.println("Maximum Value: "+MIN);
          
          
      }
}




// Ram wants to create a program that utilizes an enumeration GameLevel to assign difficulty levels to players based on their scores in a game. The difficulty levels are categorized as EASY, MEDIUM, and HARD.



// Your task is to implement a program to help Ram with the following requirements:

// Define an enumeration GameLevel with values: EASY, MEDIUM, HARD.
// Implement a program that takes a player's score as input and determines their difficulty level using the following criteria:
// If the player's score is between 0 and 50 (both inclusive), the difficulty level is EASY.
// If the player's score is greater than 50 and up to 75 (inclusive), the difficulty level is MEDIUM.
// If the player's score is greater than 75, the difficulty level is HARD.


// Help Ram with the implementation.

// Input format :
// The input consists of an integer S, representing the player's score.

// Output format :
// The output prints the assigned difficulty level for the player.



// Refer to the sample output for formatting specifications.

// Code constraints :
// enum type: EASY, MEDIUM, HARD

// 1 ≤ S ≤ 100

// Sample test cases :
// Input 1 :
// 45
// Output 1 :
// EASY
// Input 2 :
// 55
// Output 2 :
// MEDIUM
// Input 3 :
// 80
// Output 3 :
// HARD



//  You are using Java
import java.util.*;
enum GameLevel{
    EASY,MEDIUM,HARD;
}
class main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        switch(S/10){
            case 0: case 1: case 2: case 3: case 4: 
                System.out.println(GameLevel.EASY);
                break;
            case 5: case 6: 
                System.out.println(GameLevel.MEDIUM);
                break;
            default:
                System.out.println(GameLevel.HARD);
        }
    }
}
// Elon is developing a text-processing module for a messaging application. Users often input messages with consecutive and nonconsecutive characters, unintentionally or due to keyboard glitches. 



// Implement a function named removeDuplicates using the StringBuilder class that efficiently cleans up these messages by removing duplicate characters while maintaining the integrity of the original message.



// Write a program that takes user input, applies the removeDuplicates method, and outputs the cleaned message. Ensure that the program identifies lowercase and uppercase as different characters.

// Input format :
// The input consists of a string, representing the message.

// Output format :
// The output displays the message without repeated characters.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// The string contains both uppercase and lowercase with at most 50 characters.

// Sample test cases :
// Input 1 :
// aabBbaAa
// Output 1 :
// abBA
// Input 2 :
// abcd
// Output 2 :
// abcd


import java.util.Scanner;

class TextProcessor {
    public static String removeDuplicates(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            // Only add the character if it hasn't already been added
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        
        // Apply the removeDuplicates method
        String cleanedMessage = TextProcessor.removeDuplicates(message);
        
        // Print the cleaned message
        System.out.println(cleanedMessage);
    }
}

// A multiplayer word-guessing game is one where one player needs to input words and another player guesses the same word. 



// Write a class, WordEntry, with a String field to store player inputs. Override the equals() method in a way that compares the words while ignoring all spaces and cases. The program determines the winner of a word-guessing game, where player 2 wins upon successfully guessing the word entered by player 1, and player 1 emerges victorious if player 2 fails to guess the word.

// Input format :
// The first line of input consists of a string, representing the word entered by player 1.

// The second line consists of a string, representing the word entered by player 2.

// Output format :
// The output displays a string representing the winner of the game.



// Refer to the sample output for the exact text.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ length of the input strings ≤ 100 characters

// Sample test cases :
// Input 1 :
// Red Apple
// red apple
// Output 1 :
// Player 2 wins!
// Input 2 :
// Java Programming
// Programming Python 
// Output 2 :
// Player 1 wins!
// Input 3 :
// Laptop
// lap t o p
// Output 3 :
// Player 2 wins!




class WordEntry {
    private String word;
    
    public WordEntry(String word) {
        this.word = word;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        WordEntry other = (WordEntry) obj;
        
        // Normalize by removing spaces and ignoring case
        String normalizedThis = this.word.replaceAll("\\s", "").toLowerCase();
        String normalizedOther = other.word.replaceAll("\\s", "").toLowerCase();
        
        return normalizedThis.equals(normalizedOther);
    }
}


class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

   
        WordEntry word1 = new WordEntry(input1);
        WordEntry word2 = new WordEntry(input2);

        if (word1.equals(word2)) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }
}

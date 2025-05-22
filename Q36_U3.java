// Imagine Tim is developing a user authentication system for a secure application. 



// As part of the security checks, users need to enter two passphrases and the system VowelCountMatching class must verify if two entered passphrases have the same number of vowels. Provide the result as 'Access Granted' if true, or 'Access Denied' otherwise, along with the count of Vowels using the equals() method.



// Tim needs your assistance in completing the system. Help him by writing the code.

// Input format :
// The input consists of two strings, representing the passphrases, in separate lines.

// Output format :
// The first line of output displays whether two entered passphrases have the same number of vowels - 'Access Granted' or 'Access Denied'.

// The second line displays the vowel count of the first string.

// The third line displays the vowel count of the second string.



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ length of the input strings ≤ 50 characters

// Sample test cases :
// Input 1 :
// Username
// Password
// Output 1 :
// Access Denied
// First String: 4
// Second String: 2
// Input 2 :
// AEIOU
// aeiou
// Output 2 :
// Access Granted
// First String: 5
// Second String: 5




class VowelCountMatching {
    private String passphrase;

    // Constructor to initialize the passphrase
    public VowelCountMatching(String passphrase) {
        this.passphrase = passphrase;
    }

    // Method to count the number of vowels in a string
    public int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // Overriding the equals method to compare vowel counts
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VowelCountMatching) {
            VowelCountMatching other = (VowelCountMatching) obj;
            return this.countVowels(this.passphrase) == other.countVowels(other.passphrase);
        }
        return false;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        VowelCountMatching object1 = new VowelCountMatching(firstString);
        VowelCountMatching object2 = new VowelCountMatching(secondString);
        boolean result = object1.equals(object2);
        System.out.println(result ? "Access Granted" : "Access Denied");
        System.out.println("First String: " + object1.countVowels(firstString));
        System.out.println("Second String: " + object2.countVowels(secondString));
    }
}
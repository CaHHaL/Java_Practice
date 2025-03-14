// Jessica is tasked with designing a fantasy game character system. The system includes an abstract class named GameCharacter with two abstract methods: attack() and defend(). 



// Two subclasses, Warrior and Wizard, extend the GameCharacter class. 



// The program prompts the player to choose a character class (1. Warrior, 2. Wizard) and input their character's strength or magic power. The dynamic calculations involve tripling the strength (strength * 3) for the Warrior's attack and doubling the magic power(power * 2) for the Wizard's attack.



// Jessica needs your help in completing the program. Help her finish it.

// Input format :
// The first line of input consists of an integer, representing the choice of the character - 1 for Warrior and 2 for Wizard.

// If the choice is 1, the second line consists of an integer N, representing the strength.

// If the choice is 2, the second line consists of an integer M, representing the magic power.

// Output format :
// If the choice is 1, the output displays the actions of a warrior in the following format:

// "Warrior Actions:

// Attack: Powerful sword slash for [result] damage!

// Defend: Raises shield, defence boosted by [N]!"



// If the choice is 2, the output displays the actions of a wizard in the following format:

// "Wizard Actions:

// Attack: Casts spell, deals [result] magical damage!

// Defend: Creates magical barrier, defence boosted by [M]!"



// If any other choice is given, print "Invalid choice".



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ M, N ≤ 106

// Sample test cases :
// Input 1 :
// 1
// 68
// Output 1 :
// Warrior Actions:
// Attack: Powerful sword slash for 204 damage!
// Defend: Raises shield, defence boosted by 68!
// Input 2 :
// 2
// 998
// Output 2 :
// Wizard Actions:
// Attack: Casts spell, deals 1996 magical damage!
// Defend: Creates magical barrier, defence boosted by 998!
// Input 3 :
// 3
// 76
// Output 3 :
// Invalid choice



abstract class GameCharacter {
    abstract void attack(int value);
    abstract void defend(int value);
}

// Warrior class extending GameCharacter
class Warrior extends GameCharacter {
    @Override
    void attack(int strength) {
        System.out.println("Attack: Powerful sword slash for " + (strength * 3) + " damage!");
    }
    
    @Override
    void defend(int strength) {
        System.out.println("Defend: Raises shield, defence boosted by " + strength + "!");
    }
}

// Wizard class extending GameCharacter
class Wizard extends GameCharacter {
    @Override
    void attack(int magicPower) {
        System.out.println("Attack: Casts spell, deals " + (magicPower * 2) + " magical damage!");
    }
    
    @Override
    void defend(int magicPower) {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + magicPower + "!");
    }
}





class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int attributeValue = scanner.nextInt();
        GameCharacter character;
        if (choice == 1) {
            character = new Warrior();
        } else if (choice == 2) {
            character = new Wizard();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println((choice == 1 ? "Warrior" : "Wizard") + " Actions:");
         character.attack(attributeValue);
        character.defend(attributeValue);

        scanner.close();
    }
}
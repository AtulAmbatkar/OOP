import java.util.Scanner;
public class TextBasedGame {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Text Adventure Game!");
	        System.out.println("You wake up in a mysterious forest. You see a path to the left and a dark cave to the right.");

	        System.out.print("Which way would you like to go? (left/right): ");
	        String choice1 = scanner.next();

	        if (choice1.equalsIgnoreCase("left")) {
	            System.out.println("You follow the path and reach a river. Do you swim across or look for a bridge? (swim/bridge): ");
	            String choice2 = scanner.next();

	            if (choice2.equalsIgnoreCase("swim")) {
	                System.out.println("You swim across but encounter a strong current. You're swept away and lost. Game Over!");
	            } else if (choice2.equalsIgnoreCase("bridge")) {
	                System.out.println("You find a hidden bridge and cross the river safely. You encounter a treasure chest. Would you like to open it? (yes/no): ");
	                String choice3 = scanner.next();

	                if (choice3.equalsIgnoreCase("yes")) {
	                    System.out.println("Congratulations! You found the treasure and won the game!");
	                } else {
	                    System.out.println("You leave the treasure and wander through the forest. Game Over!");
	                }
	            } else {
	                System.out.println("Invalid choice. Game Over!");
	            }

	        } else if (choice1.equalsIgnoreCase("right")) {
	            System.out.println("You enter the dark cave. You find a lantern. Would you like to light it? (yes/no): ");
	            String choice2 = scanner.next();

	            if (choice2.equalsIgnoreCase("yes")) {
	                System.out.println("The lantern reveals hidden traps. You escape the cave and find your way home. Congratulations! You've won the game!");
	            } else if (choice2.equalsIgnoreCase("no")) {
	                System.out.println("You stumble in the darkness and fall into a pit. Game Over!");
	            } else {
	                System.out.println("Invalid choice. Game Over!");
	            }

	        } else {
	            System.out.println("Invalid choice. Game Over!");
	        }

	        scanner.close();
	    }
	}

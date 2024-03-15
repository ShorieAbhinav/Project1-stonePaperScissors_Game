/*
 * Author: Abhinav Shorie
 * Date: March 15,2024
 * Description: A simple rock-paper-scissors game implemented in Java.
 */

package stonePaperScissors;

import java.util.Scanner;
import java.util.Random;

public class stonePaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] moves = {"r", "p", "s"}; // Array representing possible moves
        String userMove;
        String input;
        String compMove;

        // Main game loop
        while (true) {
            // User input loop to ensure valid move
            do {
                System.out.println("Choose any one move: ");
                System.out.println("r for rock");
                System.out.println("p for paper");
                System.out.println("s for scissors\n");

                userMove = scanner.nextLine();

                if (!userMove.equals("r") && !userMove.equals("p") && !userMove.equals("s")) {
                    System.out.println(userMove + " is not a valid choice, please choose again\n");
                }
            } while (!userMove.equals("r") && !userMove.equals("p") && !userMove.equals("s"));

            System.out.println("User chose " + userMove + "\n");

            // Generate computer's move randomly
            compMove = moves[new Random().nextInt(moves.length)];

            // Determine the outcome of the game
            switch (userMove) {
                case "r":
                    switch (compMove) {
                        case "p":
                            System.out.println("Computer chose " + compMove + ". Computer Wins!");
                            break;
                        case "s":
                            System.out.println("Computer chose " + compMove + ". You Win!");
                            break;
                        case "r":
                            System.out.println("Computer also chose " + compMove + ". It's a Tie!");
                            break;
                    }
                    break;
                case "p":
                    switch (compMove) {
                        case "s":
                            System.out.println("Computer chose " + compMove + ". Computer Wins!");
                            break;
                        case "r":
                            System.out.println("Computer chose " + compMove + ". You Win!");
                            break;
                        case "p":
                            System.out.println("Computer also chose " + compMove + ". It's a Tie!");
                            break;
                    }
                    break;
                case "s":
                    switch (compMove) {
                        case "r":
                            System.out.println("Computer chose " + compMove + ". Computer Wins!");
                            break;
                        case "p":
                            System.out.println("Computer chose " + compMove + ". You Win!");
                            break;
                        case "s":
                            System.out.println("Computer also chose " + compMove + ". It's a Tie!");
                            break;
                    }
                    break;
            }
            
            // Prompt to play again
            System.out.println("\nDo you want to play again? (y/n)");

            // Input loop to ensure valid choice to play again
            do {
                input = scanner.nextLine();

                if (!input.equals("y") && !input.equals("n")) {
                    System.out.println(input + " is not a valid choice, please choose again\n");
                }
            } while (!input.equals("y") && !input.equals("n"));

            // If the user chooses not to play again, exit the loop
            if (input.equals("n")) {
                System.out.println("Thank you for playing this game.");
                break;
            }
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}

import java.util.Scanner;

public class Choices {
    public static void main(String args[]) {
        String question = "Which language is easier to learn?";
        String choiceOne = "Option A: Javascript";
        String choiceTwo = "Option B: Python";
        String choiceThree = "Option C: Java";

        String correctAnswer = "C";

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        System.out.println("Please answer A, B, or C.");
        // Retrieve the user's input
        Scanner input = new Scanner(System.in);
        String answer = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(answer == correctAnswer) {
            System.out.println("CONGRATULATIONS!!! You have solved the riddle");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Sorry, the correct answer was " + choiceThree);
        }
    }
}

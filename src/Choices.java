import java.util.Scanner;

public class Choices {
    public static void main(String args[]) {
        String question = "Which language is easier to learn?"+"\n"+"(Please answer A, B, or C)";
        String choiceOne = "Option A: Javascript";
        String choiceTwo = "Option B: Python";
        String choiceThree = "Option C: Java";

        String correctAnswer = "c";

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne +"\n"+ choiceTwo +"\n"+ choiceThree +"\n"+ "------------");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(correctAnswer.equals(input.toLowerCase())) {
            System.out.println("CONGRATULATIONS!!! You have solved the riddle");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Sorry, the correct answer was " + choiceThree);
        }
    }
}

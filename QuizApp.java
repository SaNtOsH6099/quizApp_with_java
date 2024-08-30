
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample questions and answers
        String[] questions = {
                "What is the capital of India?",
                "Which programming language is used for Android app development?",
                "Who painted the Mona Lisa?",
                "Which animal is known as the king of the jungle?",
                "What is the highest mountain in the world?"
        };

        String[][] options = {
                { "Delhi", "Mumbai", "Kolkata", "Chennai" },
                { "Python", "Java", "C++", "JavaScript" },
                { "Michelangelo", "Pablo Picasso", "Leonardo da Vinci", "Vincent van Gogh" },
                { "Lion", "Tiger", "Elephant", "Gorilla" },
                { "Mount Kilimanjaro", "Mount Denali", "Mount Aconcagua", "Mount Everest" }
        };

        int[] correctAnswers = { 0, 1, 2, 0, 3 };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Enter your choice (1-4): ");
            int userChoice = scanner.nextInt() - 1;

            if (userChoice >= 0 && userChoice < options[i].length && userChoice == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + options[i][correctAnswers[i]] + "\n");
            }
        }

        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
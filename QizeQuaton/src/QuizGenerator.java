
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGenerator {
    private List<Question> questions;

    public QuizGenerator() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(question.getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getAnswer());
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
        scanner.close();
    }

    public static void main(String[] args) {
        // Creating quiz questions
        Question q1 = new Question("What is the capital of France?", "Paris");
        Question q2 = new Question("Who is currnt prime minister of France", "Elisabeth Borne");
        Question q3 = new Question("How many golds India won in Olympics?", "10");

        // Creating a quiz
        QuizGenerator quiz = new QuizGenerator();
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Generator!");
        System.out.println("Press 'Y' to start the quiz, or any other key to exit: ");
        String startQuiz = scanner.nextLine();

        if (startQuiz.equalsIgnoreCase("Y")) {
            quiz.startQuiz();
        } else {
            System.out.println("Exiting the program.");
        }
        scanner.close();
    }
}

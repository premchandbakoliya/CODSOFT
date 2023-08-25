import java.util.Random;
import java.util.Scanner;

public class codsoft_taskno2 {
    public static void main(String[] args) {
        int min = 1; 
        int max = 100; 
        int maxAttempts = 5; 
        
        Scanner scanner = new Scanner(System.in);
        
        int score = 0; 
        
        boolean playAgain = true;
        
        while (playAgain) {
            Random random = new Random();
            int randomNumber = random.nextInt(max - min + 1) + min;
            
            int attempt = 1;
            boolean guessedCorrectly = false;
            
            System.out.println("New round! Guess the random number between " + min + " and " + max + ": ");
            
            while (!guessedCorrectly && attempt <= maxAttempts) {
                System.out.println("Attempt #" + attempt);
                int userGuess = scanner.nextInt();
                
                System.out.println("You guessed: " + userGuess);
                System.out.println("The random number was: " + randomNumber);
                
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
                
                attempt++;
            }
            
            if (guessedCorrectly) {
                score++; 
            } else {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }
            
            System.out.println("Your current score: " + score); 
            
            System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing! Your final score: " + score);
    }
}

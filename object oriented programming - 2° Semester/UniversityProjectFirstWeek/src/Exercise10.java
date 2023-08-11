import java.util.Scanner;
import  java.util.Random;

public class Exercise10 {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "orange", "strawberry", "grape",
                "umbrella", "heloise"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String wordSelected = words[random.nextInt(words.length)];
        int tries = 6;
        StringBuilder wordGuessed = new StringBuilder();
        for (int i = 0; i < wordSelected.length(); i++) {
            wordGuessed.append("_");
        }

        System.out.println("Welcome to the mato!");
        System.out.println("Try to guess the word!");

        while (tries > 0) {
            System.out.println("Word: " + wordGuessed);
            System.out.println("Tries left: " + tries);
            System.out.println("Type a character: ");
            char character = scanner.nextLine().charAt(0);
            boolean characterGuessed = false;

            for(int i = 0; i < wordSelected.length(); i++) {
                if(wordSelected.charAt(i) == character) {
                    wordGuessed.setCharAt(i, character);
                    characterGuessed = true;
                }
            }

            if (!characterGuessed) {
                tries--;
            }

            if(wordGuessed.toString().equals(wordSelected)) {
                System.out.println("Congratulations! You guessed the word correctly: " + wordSelected);
                break;
            }

        }

        if(tries == 0) {
            System.out.println("Game Over! The word was: " + wordSelected);
        }

        scanner.close();

    }

}

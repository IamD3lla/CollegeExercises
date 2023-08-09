/*Create an algorithm in Java that request the user to type an integer number (example: 14).
*And after that the algorithm show the multiplication table of the number utilizing "for" */

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberRequested, result;

        System.out.println("insert an integer number:");
        numberRequested = scanner.nextInt();

        for(int multiplication = 1; multiplication <= 10; multiplication++) {

            result = numberRequested * multiplication;
            System.out.println(numberRequested + "x" + multiplication + "=" + result);

        }


    }

}

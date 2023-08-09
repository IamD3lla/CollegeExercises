/*Create a Java algorithm that verifies if the number is positive, negative, or zero*/

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Insert a number and the program will tell you if it's: positive, negative or zero:");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number " + number + " is positive!");
        }else if (number < 0) {
            System.out.println("The number " + number + " is negative!");
        }else {
            System.out.println("The number is 0!");
        }

    }

}

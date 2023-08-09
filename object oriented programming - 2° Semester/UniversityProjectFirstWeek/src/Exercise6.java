/*Create an Java algorithm that requests the user an integer number. After that the program
* will verify if the number is a prime number*/

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean prime = true;

        System.out.println("insert a number and the program will tell if it is a prime number or it is not a prime number:");
        number = scanner.nextInt();

        if (number <= 1){
            prime = false;
        }else {
            //If the number is not divisible by the own square root,
            // it will not divide by anything above except for itself!
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println("The number " + number + " is a prime number!");
        }else {
            System.out.println("The number " + number + " is not a prime number!");
        }

    }

}

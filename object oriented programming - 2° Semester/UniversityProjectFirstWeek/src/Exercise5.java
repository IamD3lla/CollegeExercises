/*Create a Java algorithm that requests the user to type a year (example: 2032). After that
* the algorithm will verify if the year informed is or is not a leap year */

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.println("Insert a year and the program will tell you if it is a leap year or not:");
        year = scanner.nextInt();

        while(year < 0) {
            System.out.println("Insert a valuable year:");
            year = scanner.nextInt();
        }

        if (year % 4 == 0 && year != 0){
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a leap year.");
                }else {
                    System.out.println("The year " + year + " is not a leap year.");
                }
            }else {
                System.out.println("The year " + year + " is a leap year.");
            }
        }else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }

}

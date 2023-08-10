/**/

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont;

        System.out.println("Insert the triangle height:");
        cont = scanner.nextInt();

        for(int i = 0; i < cont; i++) {
            //Prints more than once because the variable "j" is initialized again and backs
            //to 0, so he prints the same amount as the variable "i" because he is lower or
            //equal.
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //Next line of "*"
            System.out.println();
        }

        scanner.close();
    }

}

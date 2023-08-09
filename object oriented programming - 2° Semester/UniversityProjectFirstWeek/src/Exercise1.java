/*Create an algorithm in Java that request 3 decimal numbers to the user. After that
* the average of this numbers is calculated and showed in screen for the user*/

import java.util.Scanner;
import java.util.Locale;

public class Exercise1 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);


        //numbers requested for the user
        float a, b, c;

        System.out.println("Insert 3 decimal numbers:");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        float average = (a + b + c) / 3;

        System.out.println("A média dos números é de: " + average);

    }
}

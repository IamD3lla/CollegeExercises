/*Create a Java algorithm that requests the user the temperature in Celsius and convert it to
* Fahrenheit. The program should also say if it is cold (below 32°F), moderate (32°F to 80°F)
* or hot (over 80°F)*/

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperature, conversion;

        System.out.println("Insert a temperature in Celsius and it will be converted to fahrenheit");
        temperature = scanner.nextDouble();

        conversion = temperature * 1.8 + 32;

        if (conversion < 32) {
            System.out.println("The temperature in fahrenheit is:  " + conversion + " and its cold!");
        }else if (conversion >= 32 && conversion <= 80) {
            System.out.println("The temperature in fahrenheit is:  " + conversion + " and its moderate climate.");
        }else  {
            System.out.println("The temperature in fahrenheit is:  " + conversion + " and its hot!");
        }

    }
}

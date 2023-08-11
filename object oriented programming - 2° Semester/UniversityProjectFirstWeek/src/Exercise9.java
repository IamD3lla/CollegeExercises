import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] romanUnits = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String[] romanTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        String[] romanHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        String[] romanThousands = {"", "M", "MM", "MMM"};

        System.out.println("Insert a number between 1 to 4000");
        int number = scanner.nextInt();

        while (number < 1 || number > 4000){
            System.out.println("Insert a valid number");
            number = scanner.nextInt();
        }

            String units = romanUnits[number % 10];
            String tens = romanTens[(number / 10) % 10];
            String hundreds = romanHundreds[(number / 100) % 10];
            String thousands = romanThousands[(number / 1000) % 10];

            String romanNumber = thousands + hundreds + tens + units;
            System.out.println("The roman number is: " + romanNumber);

        scanner.close();

    }

}

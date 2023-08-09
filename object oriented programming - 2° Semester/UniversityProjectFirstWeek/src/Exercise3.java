/*Create an algorithm in Java that shows in the screen all the multiples of three, between
* the numbers 0 to 30 using the structure "do while"*/

public class Exercise3 {

    public static void main(String[] args) {

        int number = 0;

        do {
            if (number % 3 == 0 && number != 0) {
                System.out.println(number);
            }
            number++;
        }while (number < 31);

    }

}

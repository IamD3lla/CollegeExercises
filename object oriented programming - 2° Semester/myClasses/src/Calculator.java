public class Calculator {

    public static double sqrt(double value) {
        return Math.sqrt(value);
    }

    public static double log(double value) {
        return Math.log(value);
    }

    public static void main(String[] args){
        int x = 25;
        int y = 100;

        double squareRoot = Calculator.sqrt(x);
        double logarithm = Calculator.log(y);

        System.out.printf("Square root of %d: %f \n",x,squareRoot);
        System.out.printf("Square root of %d: %f \n",y,logarithm);
    }

}

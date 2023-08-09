public class MyCalculator {
    public static int multiplication(int a, int b) {
        int x;
        x = a * b;
        return x;
    }
    public static void main(String[] args) {
        int x = 4, y = 5, z;
        System.out.println("Calculator");

        z = multiplication(x, y);
        System.out.println("Z = " + z);

        System.out.println("Z = " + multiplication(10, 3));


    }
}

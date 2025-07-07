package Arithmetic;

public class Factorial {

    public static int Factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = Factorial(10);// calculates the sum of 1 to 10
        System.out.println("Factorial;" + result);// sum is
    }
}
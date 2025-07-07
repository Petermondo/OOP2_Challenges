package Arithmetic;

public class Sum {
public static int sum(int n){
    if (n == 1){
        return 1;
    }
    else {
        return n + sum(n-1);
    }
}
public static void main(String[] args) {
    int result = sum(10);// calculates the sum of 1 to 10
System.out.println("Sum;" +result);// sum is 55
}
}

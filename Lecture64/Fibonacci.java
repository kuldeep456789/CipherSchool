import java.util.Arrays;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;

        return fibMemo(n, memo);
    }

    private static int fibMemo(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
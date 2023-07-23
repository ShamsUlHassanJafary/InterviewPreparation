public class FibonacciSeriesUpN {

    public static int number = 8;

    public static void main(String[] args) {
        printFibonacci(10); // Change this to the desired number of Fibonacci numbers.
    }

    public static void printFibonacci(int n) {
        int f1 = 0, f2 = 1;
        if (n < 1)
            return;
        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}

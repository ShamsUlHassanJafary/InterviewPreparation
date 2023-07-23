public class FactorialOfANumber {

    public static int number = -5;

    public static void main(String[] args) {

        int fact = findfactorial(number);
        System.out.println(" Factorial of " + number + " is " + fact);
    }

    private static int findfactorial(int factNumber) {
        if (factNumber > 0) {
            int sum = 1;

            for (int i = factNumber; i >= 1; i--) {
                sum = sum * i;
            }

            return sum;
        } else {
            throw new RuntimeException("Factorial of negative numbers is not defined.");
        }
    }
}

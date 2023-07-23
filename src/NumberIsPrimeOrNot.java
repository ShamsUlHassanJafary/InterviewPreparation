public class NumberIsPrimeOrNot {

    public static int number = 25;

    public static void main(String[] args) {

        int num = 2;
        int count = 0;

        while (count < 20) {
            if (isNumberPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    private static boolean isNumberPrime(int number2) {

        for (int i = 2; i <= number2 / 2; i++) {
            if (number2 % i == 0) {
                return false;
            }
        }
        return true;
    }

}

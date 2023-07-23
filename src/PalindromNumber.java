public class PalindromNumber {

    public static int number;
    private static int reverseNumber;

    PalindromNumber(int number) {
        PalindromNumber.number = number;
    }

    public static void main(String[] args) {
        isPalindromNumber(110011);
    }

    private static boolean isPalindromNumber(int number) {
        PalindromNumber palindromNumber = new PalindromNumber(number);

        while (true) {

            int reminder = number % 10;
            number = number / 10;

            if(reminder != 0)
        }

    }
}

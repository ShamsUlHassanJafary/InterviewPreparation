public class IsStringPalindrome {

    public static String str = "AAAOOAAA";

    public static void main(String[] args) {

        boolean check = isPalindromString(str);
        System.out.println("is String palindrom ?  " + check);
    }

    private static boolean isPalindromString(String str2) {

        String orignalString = str2;
        StringBuilder stringBuilder = new StringBuilder();

        char[] charArr = str2.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            stringBuilder.append(charArr[i]);
        }

        if (stringBuilder.toString().equals(orignalString)) {
            return true;
        }
        return false;
    }
}
